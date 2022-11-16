package inventario;

import java.io.Serializable;
import java.util.ArrayList;


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

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
    public int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(int ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }
   
    public String getDescripcionPorCodigo(int cod) {
        String desc = "";
        for(Producto i : listaProducto) {
            if(cod == i.getCodigo()){
                desc = i.getDescripcion();
            } 
        }
        return desc;
    }
}
