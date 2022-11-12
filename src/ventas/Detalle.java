/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;
import inventario.*;
/**
 *
 * @author Tati
 */
public class Detalle {
    
    private Venta ventaRealizada;
    private int codigo;
    private float precioUnitario;
    private int cantidad;
    
    public Detalle(Venta ventaRealizada, int codigo, float precioUnitario, int cantidad) {
        this.ventaRealizada = ventaRealizada;
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
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
    
    
}
