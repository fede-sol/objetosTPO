package ventas.pagos;

import ventas.Venta;

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
    
    public abstract String toTexto();
}
