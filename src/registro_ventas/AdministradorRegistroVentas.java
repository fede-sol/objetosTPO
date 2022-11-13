/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro_ventas;
import ventas.Venta;
import java.util.ArrayList;
import inventario.AdministradorCatalogo;
import inventario.Catalogo;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.FileHandler;
/**
 *
 * @author Tati
 */
public class AdministradorRegistroVentas {
    
    private RegistroVentas registroVentas;
    private AdministradorCatalogo adminCatalogo;
    private FileHandler fileHandler = new FileHandler();
    private final File RUTA_INVENTARIO = new File("src/saves/registroVentas.dat");
    
    
    public AdministradorRegistroVentas() {
        importarRegistroVentas();
    }
    
    private void importarRegistroVentas(){
        if (RUTA_INVENTARIO.exists()){
            try {
                registroVentas = (RegistroVentas) fileHandler.importarObjeto(RUTA_INVENTARIO);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministradorRegistroVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void exportarRegistroVentas(){
        
        fileHandler.exportarObjeto(registroVentas, RUTA_INVENTARIO);
    }
    
    public void agregarVenta(Venta v) {
        registroVentas.getListaVentas().add(v);
        registroVentas.setCantidadVentas(registroVentas.getCantidadVentas()+ 1);
        exportarRegistroVentas();
        
    }
    
    public void getProductosMasVendidos() {
        int cantVentas = registroVentas.getCantidadVentas();
        ArrayList ventas = registroVentas.getListaVentas();
        ArrayList productos = adminCatalogo.getCatalogo().getListaProducto();
        ArrayList productosMasVendidos = new ArrayList();  
    }
    
    
    public RegistroVentas getRegistroVentas() {
        return registroVentas;
    }
    
    
    
}