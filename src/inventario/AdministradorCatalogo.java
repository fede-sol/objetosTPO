package inventario;

import java.util.ArrayList;

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

    public void guardarModificaciones(int cod, String descripcion, int precioUnitario, int stock, int stockMin) {

    }

    public void actualizarStock(int cod, int cantVendida) {

    }

    public ArrayList<Producto> getProductosStockMin() {

        return null;
    }

    
    
    private void importarCatalogo(){
        
        catalogo = new Catalogo();
    }
}
