package inventario;

import java.util.ArrayList;

/**
 *
 * @author Fede
 */
public class AdministradorCatalogo {

    private Catalogo catalogo;
    private int ultimoCodigo;
    
    public AdministradorCatalogo(){
        importarCatalogo();
        
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void guardarProducto(Producto p) {
        catalogo.getListaProducto().add(p);
        ultimoCodigo++;
    }

    public void removerProducto(int cod) {

        catalogo.getListaProducto().remove(buscarProducto(cod));
     
     
    }
    
    public void modificarProducto(int cod, String descripcion, int precio, int stock, int stockMin){
        
        Producto p = buscarProducto(cod);
        
        p.setDescripcion(descripcion);
        p.setPrecioUnitario(precio);
        p.setStock(stock);
        p.setStockMinimo(stockMin);
        
    }
    
    
    private void importarCatalogo(){
        
        catalogo = new Catalogo();
        ultimoCodigo = 0;
    }

    public int getUltimoCodigo() {
        return ultimoCodigo;
    }
    
    public Producto buscarProducto(int cod){
        
        int i = 0;
        
        while(catalogo.getListaProducto().get(i).getCodigo() != cod)
            i++;
            
        return catalogo.getListaProducto().get(i);
    }
    
    public ArrayList<Producto> getProductosStockMin(){
        
        ArrayList<Producto> listaProductosStockMin = new ArrayList<>();
        
        for (Producto producto : catalogo.getListaProducto()) {
            
            if(producto.getStock() <= producto.getStockMinimo())
                listaProductosStockMin.add(producto);
            
            
        }
        
        return listaProductosStockMin;
    }
}
