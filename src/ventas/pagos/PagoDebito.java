/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas.pagos;
import ventas.pagos.Pago;
import inventario.*;
import java.util.ArrayList;
import ventas.Detalle;
import ventas.Venta;
/**
 *
 * @author Tati
 */
public class PagoDebito extends Pago {
    
    public PagoDebito(Venta v) {
        super(v);
    }
    
    public float calcularTotal() {
        ArrayList<Detalle> totales = this.getVenta().getDetalle();
        float total = 0;
        
        for(Detalle i: totales){
            total = total + (i.getPrecioUnitario() * i.getCantidad());
        }
        
        return total;
    }
    
}
