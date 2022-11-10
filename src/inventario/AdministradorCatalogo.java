package inventario;

import java.util.ArrayList;

/**
 *
 * @author Fede fasdf
 */
public class AdministradorCatalogo {

    private Catalogo catalogo;
    
    public AdministradorCatalogo(){
        importarCatalogo();
        
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void guardarProducto(Producto p) {
        catalogo.getListaProducto().add(p);
    }

    public void removerProducto(int cod) {

    
     
     
    }
    
    
    private void importarCatalogo(){
        
        catalogo = new Catalogo();
    }
    
    public int ultimoCodigoDeProducto(){
        return catalogo.getListaProducto().size();
        
    }
}
