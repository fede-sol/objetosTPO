package ventas;

import inventario.AdministradorCatalogo;
import inventario.Producto;
import java.util.ArrayList;
import registro_ventas.AdministradorRegistroVentas;

/**
 *
 * @author nicolas.r
 */
public class AdministradorVentas {
    
    private Venta venta;
    private AdministradorCatalogo adminCatalogo;
    private AdministradorRegistroVentas adminRegistroVentas;
    
    
      /*
    * este catalogo es una copia del original y va a ser el que voy a manipular durante la venta
    * cuando agregue articulos al carrito, se va a descontar el stock de este catalogo auxiliar
    * una vez terminada la venta, el catalogo original va a ser reemplazado por esta copia
    * en caso de que se cancele la venta, no afecta al catalogo original
    */
    
    
    private ArrayList<Producto> listadoCatalogoAuxiliar; 
    
    public AdministradorVentas(){
        
        venta = new Venta();
        adminCatalogo = new AdministradorCatalogo();
        adminRegistroVentas = new AdministradorRegistroVentas();
        
        listadoCatalogoAuxiliar = new ArrayList<>(adminCatalogo.getCatalogo().getListaProducto());
        venta.setIdVenta(adminRegistroVentas.getRegistroVentas().getCantidadVentas()+1);
    }




    public Venta getVenta() {
        return venta;
    }
    
    public void agregarProducto(int cant, int cod){
        
        int i = 0;
        
        while(listadoCatalogoAuxiliar.get(i).getCodigo() != cod)
            i++;
        
        Producto p = listadoCatalogoAuxiliar.get(i);
        
        venta.getCarrito().add(
                new Detalle(
                        venta.getIdVenta(),
                        cod,
                        p.getPrecioUnitario(),
                        cant,
                        p.getDescripcion()));
        
        listadoCatalogoAuxiliar.get(i).setStock(p.getStock()-cant);
        
         
    }
    
    public void eliminarProducto(int cod){
        
        int i = 0;
        
        while(listadoCatalogoAuxiliar.get(i).getCodigo() != cod)
            i++;
        
        int j = 0;
        
        while(venta.getCarrito().get(j).getCodigo() != cod)
            j++;
        
        listadoCatalogoAuxiliar.get(i).setStock(listadoCatalogoAuxiliar.get(i).getStock() + venta.getCarrito().get(j).getCantidad());
        venta.getCarrito().remove(j);
        
    }
    
    public void registrarVenta(){
        venta.getPago().calcularTotal();
        venta.setTotal(venta.getPago().getTotal());
        
        
        // aca hay que poner el codigo para guardar la venta en el registro de ventas
        
    }
    
    public ArrayList<Producto> getListadoCatalogoAuxiliar() {
        return listadoCatalogoAuxiliar;
    }

    
    public void calcularSubtotal(){
        
        float subtotal = 0;
        
        for(Detalle d : venta.getCarrito())
            subtotal += d.getPrecioUnitario() * d.getCantidad();
        
        venta.setSubtotal(subtotal);
    }
}
