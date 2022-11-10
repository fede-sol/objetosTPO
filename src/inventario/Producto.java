package inventario;

/**
 *
 * @author Fede
 */
public class Producto {
    
    private int codigo;
    private int precioUnitario;
    private int stock;
    private int stockMinimo;
    private String descripcion;

    public Producto(int codigo, int precioUnitario, int stock, int stockUnitario, int stockMinimo,String descripcion){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        
    }
    
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
