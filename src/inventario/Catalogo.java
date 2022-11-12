package inventario;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Fede
 */
public class Catalogo implements Serializable{
   
    
    private ArrayList<Producto> listaProducto;

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }
    
    
    public Catalogo(){
        importar();
    }
    
    private void importar(){
        listaProducto = new ArrayList<>();
        
    }
    
}
