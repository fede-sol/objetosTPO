package ventas;
import ventas.pagos.Pago;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Tati
 */
public class Venta {
    
    private int id; //tal vez despues agrego fecha porque lo dijo el profe
    private float subtotal;
    private float total;
    private ArrayList<Detalle> carrito;
    private Pago pago;
    
    public Venta() {
        carrito = new ArrayList<>();
    }
    
    public ArrayList<Detalle> getDetalle() {
        return this.carrito;
    }
    
    public void setPago(Pago p) {
        
    }
    
    private void calcularSubtotal() {
       
    }
    
    public float getSubtotal() {
        return this.subtotal;
    }
    
    public void setIdVenta(int id){
        
        this.id = id;
    }
    

    
}
