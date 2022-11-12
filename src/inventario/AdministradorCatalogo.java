package inventario;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.FileHandler;

/**
 *
 * @author Fede
 */
public class AdministradorCatalogo {

    private Catalogo catalogo = new Catalogo();
    
    private FileHandler fileHandler = new FileHandler();
    private final File RUTA_INVENTARIO = new File("src/saves/catalogo.dat");
    
    public AdministradorCatalogo(){
        importarCatalogo();
        
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void guardarProducto(Producto p) {
        catalogo.getListaProducto().add(p);
        catalogo.setUltimoCodigo(catalogo.getUltimoCodigo()+1);
        exportarCatalogo();
    }

    public void removerProducto(int cod) {

        catalogo.getListaProducto().remove(buscarProducto(cod));
        exportarCatalogo();
     
    }
    
    public void modificarProducto(int cod, String descripcion, float precio, int stock, int stockMin){
        
        Producto p = buscarProducto(cod);
        
        p.setDescripcion(descripcion);
        p.setPrecioUnitario(precio);
        p.setStock(stock);
        p.setStockMinimo(stockMin);
        
        exportarCatalogo();
    }
    
    
    private void importarCatalogo(){
        
        if (RUTA_INVENTARIO.exists()){
            try {
                catalogo = (Catalogo) fileHandler.importarObjeto(RUTA_INVENTARIO);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministradorCatalogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    public void exportarCatalogo(){
        
        fileHandler.exportarObjeto(catalogo, RUTA_INVENTARIO);
    }

    public int getUltimoCodigo() {
        return catalogo.getUltimoCodigo();
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
