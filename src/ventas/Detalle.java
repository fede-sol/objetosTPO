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
    private int idProducto;
    private float precio;
    private int cantidad;
    
    public Detalle(Venta ventaRealizada, int idProducto, float precio, int cantidad) {
        this.ventaRealizada = ventaRealizada;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public void setProducto(int idProducto){
        this.idProducto = idProducto;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
    
    public float getPrecio() {
        return this.precio;
    }
    
    
}
