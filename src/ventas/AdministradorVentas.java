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
                        venta.getId(),
                        cod,
                        p.getPrecioUnitario(),
                        cant,
                        p.getDescripcion()));
        
        listadoCatalogoAuxiliar.get(i).setStock(p.getStock()-cant);
        
         
    }
    
    public void eliminarProducto(int cod){
        
        
    }
    
    public void registrarVenta(){
        
        
    }
    
    public ArrayList<Producto> getListadoCatalogoAuxiliar() {
        return listadoCatalogoAuxiliar;
    }

}
