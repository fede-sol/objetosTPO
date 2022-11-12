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
        
        listadoCatalogoAuxiliar = adminCatalogo.getCatalogo().getListaProducto();
        venta.setIdVenta(adminRegistroVentas.getRegistroVentas().getCantidadVentas()+1);
    }




    public Venta getVenta() {
        return venta;
    }
    
    public void agregarProducto(int cant, int cod){
        
        Producto p = adminCatalogo.buscarProducto(cod);
        venta.getCarrito().add(new Detalle(0,cod,p.getPrecioUnitario(),cant,p.getDescripcion()));
        
    }
    
    public void eliminarProducto(int cod){
        
        
    }
    
    public void registrarVenta(){
        
        
    }
    
    public ArrayList<Producto> getListadoCatalogoAuxiliar() {
        return listadoCatalogoAuxiliar;
    }

}
