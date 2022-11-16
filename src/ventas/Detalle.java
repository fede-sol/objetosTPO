package ventas;
import java.io.Serializable;
public class Detalle implements Serializable {
    
    private int idVenta;
    private int codigo;
    private float precioUnitario;
    private int cantidad;
    private String descripcion;

    
    public Detalle(int idVenta,int codigo, float precioUnitario, int cantidad,String descripcion) {
        this.idVenta = idVenta;
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
    
    public void setProducto(int idProducto){
        this.codigo = idProducto;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
    
    public float getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
