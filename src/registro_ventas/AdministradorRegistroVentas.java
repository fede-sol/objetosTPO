package registro_ventas;
import ventas.*;
import java.util.ArrayList; 
import java.io.File;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.FileHandler;


public class AdministradorRegistroVentas {
    
    private RegistroVentas registroVentas = new RegistroVentas();


    private FileHandler fileHandler = new FileHandler();
    private final File RUTA_REGISTROVENTAS = new File("src/saves/registroVentas.dat");
    
    
    public AdministradorRegistroVentas() {
        importarRegistroVentas();
    }
    
    private void importarRegistroVentas(){
        if (RUTA_REGISTROVENTAS.exists()){
            try {
                registroVentas = (RegistroVentas) fileHandler.importarObjeto(RUTA_REGISTROVENTAS);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministradorRegistroVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

    public void exportarRegistroVentas(){
        
        fileHandler.exportarObjeto(registroVentas, RUTA_REGISTROVENTAS);
    }
    
    public void agregarVenta(Venta v) {
        registroVentas.getListaVentas().add(v);
        registroVentas.setCantidadVentas(registroVentas.getCantidadVentas()+ 1);
        exportarRegistroVentas();
        
    }
    
    public class Item implements Comparable<Item>{
            int cant;
            int cod;
            
            @Override
            public int compareTo(Item e) {
                if(e.cant < cant) {
                    return -1;
                } else if(e.cant < cant) {
                    return 0;
                } else {
                    return 1;
                }
            }

        }
    
    public ArrayList getProductosMasVendidos() {
                
        ArrayList<Venta> ventas = registroVentas.getListaVentas();

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
        Collections.sort(items);
        return items;
    }
    
    
    
    
    public RegistroVentas getRegistroVentas() {
        return registroVentas;
    }
    
    
    
}
