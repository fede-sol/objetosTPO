package ventas.pagos;
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
