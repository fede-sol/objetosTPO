/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas.pagos;
import ventas.Venta;
/**
 *
 * @author Tati
 */
public class PagoContado extends Pago {
    
    public PagoContado(Venta v) {
        super(v);
    }
    
    @Override
    public void calcularTotal() {
        total = venta.getSubtotal() - venta.getSubtotal()*10/100;
    }
    
    
    
    @Override
    public String toText() {
        return "Pago Al Contado";
    }
    
}
