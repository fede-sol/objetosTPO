package inventario;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Fede
 */
public class Catalogo implements Serializable{
   
    
    private ArrayList<Producto> listaProducto;

    private int ultimoCodigo;

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }
    
    
    public Catalogo(){
        listaProducto = new ArrayList<>();
        ultimoCodigo = 0;
    }
    
    public int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(int ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }
   
    
}
