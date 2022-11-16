package ventas.pagos;
import ventas.Venta;


public class PagoCredito extends Pago {
    
    private int cantCuotas;
    private float precioCuota;
    
    public PagoCredito(Venta v, int cantCuotas) {
        super(v);
        this.cantCuotas = cantCuotas;
    }
    
    @Override
    public void calcularTotal() {
 
        switch (cantCuotas) {
            case 2:
                total = venta.getSubtotal() + venta.getSubtotal()*6/100;
                precioCuota = (venta.getSubtotal() + (venta.getSubtotal()*6/100))/2;
                break;
            case 3:
                total = venta.getSubtotal() + venta.getSubtotal()*12/100;
                precioCuota = (venta.getSubtotal() + (venta.getSubtotal()*12/100))/3;
                break;
            case 6:
                total = venta.getSubtotal() + venta.getSubtotal()*20/100;
                precioCuota = (venta.getSubtotal() + (venta.getSubtotal()*20/100))/6;
                break;
            default:
                total = venta.getSubtotal();
                precioCuota = venta.getSubtotal();
                break;
        }
    }
    

    
    @Override
    public String toText() {
        return "Pago Crédito";
    }
    
}
