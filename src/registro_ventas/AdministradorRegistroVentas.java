/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro_ventas;
import ventas.*;
import inventario.*;
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
    
    private RegistroVentas registroVentas = new RegistroVentas();


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
        
        AdministradorCatalogo admin = new AdministradorCatalogo();
        ArrayList<Producto> productos = admin.getCatalogo().getListaProducto();
        ArrayList<Venta> ventas = registroVentas.getListaVentas();
        
        class Item {
            int cant;
            int cod;
        }
        
        ArrayList<Item> items = new ArrayList();
        
    
        for (int i = 0; i < ventas.size(); i++){
            ArrayList<Detalle> carrito = ventas.get(i).getCarrito();
            
            for (int j = 0; j < carrito.size(); j++) {
                
                int cant = carrito.get(j).getCantidad();
                int cod = carrito.get(j).getCodigo();
                boolean existe = false;
                int k = 0;
                
                while (!existe && k < items.size()){
                    if(cod == items.get(k).cod){ //si ya estaba cargado en items se actualiza la cantidad vendida
                        existe = true;
                        items.get(k).cant = items.get(k).cant + cant;
                    }
                    k++;
                }
                
                if(!existe){ //si no existe se crea un nuevo item
                    Item itemAux = new Item();
                    itemAux.cant = cant;
                    itemAux.cod = cod;
                    items.add(itemAux);
                } 
            }
        }
        
        for(int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i).cod + " ");
            System.out.print(items.get(i).cant + "\n");
        }
    }
    
    
    
    
    public RegistroVentas getRegistroVentas() {
        return registroVentas;
    }
    
    
    
}
