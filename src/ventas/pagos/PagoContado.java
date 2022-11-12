/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas.pagos;
import java.util.ArrayList;
import inventario.*;
import ventas.Detalle;
import ventas.Venta;
/**
 *
 * @author Tati
 */
public class PagoContado extends Pago {
    
    public PagoContado(Venta v) {
        super(v);
    }
    
    public float calcularTotal() {
        ArrayList<Detalle> totales = this.getVenta().getCarrito();
        float total = 0;
        
        for(Detalle i: totales){
            total = total + (i.getPrecioUnitario() * i.getCantidad());
        }
        
        return (total- (float)(total*0.1));
    }
    
    public String toText() {
        return "Pago Al Contado";
    }
    
}
