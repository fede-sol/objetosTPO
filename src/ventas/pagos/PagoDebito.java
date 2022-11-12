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
    
    @Override
    public void calcularTotal() {
        
        total = venta.getSubtotal();
    }
    
    @Override
    public String toText() {
        return "Pago Débito";
    }
    
}
