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
        return "Pago Efectivo";
    }
    
}
