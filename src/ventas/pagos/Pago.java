package ventas.pagos;

import ventas.Venta;

/**
 *
 * @author Tati
 */
public abstract class Pago {

    
    
    protected Venta venta;
    protected float total;
    
    public Pago(Venta v) {
        this.venta = v;
    }
    
    public Venta getVenta() {
        return this.venta;
    }
    
    public abstract void calcularTotal();
    
    public abstract String toText();
    
    public float getTotal() {
        return total;
    }
}
