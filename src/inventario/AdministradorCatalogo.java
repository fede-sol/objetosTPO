package inventario;



/**
 *
 * @author Fede
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

    }

    public void removerProducto(int cod) {

    
     
     
    }
    
    
    private void importarCatalogo(){
        
        catalogo = new Catalogo();
    }
}
