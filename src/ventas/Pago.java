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
public abstract class Pago {
    
    private Venta venta;
    
    public Pago(Venta v) {
        this.venta = v;
    }
    
    public Venta getVenta() {
        return this.venta;
    }
    
    public abstract float calcularTotal();
    
}
