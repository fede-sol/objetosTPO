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

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    private Pago pago;

    public Venta() {
        carrito = new ArrayList<>();
        subtotal = 0;
        total = 0;
    }
    
    public ArrayList<Detalle> getCarrito() {
        return this.carrito;
    }
    
    public void setPago(Pago p) {
        this.pago = p;
    }
    
    public Pago getPago() {
        return pago;
    }
    
    
    public float getSubtotal() {
        return this.subtotal;
    }
    
    public void setIdVenta(int id){
        
        this.id = id;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    


    

    public int getIdVenta(){
        return id;
    }
    
    public float getTotal() {
        return total;
    }
    
    public String toText() {
        String resultado = "";
        for(int i = 0; i < carrito.size(); i++) {
            resultado = String.valueOf(carrito.get(i).getCodigo()) + " " + String.valueOf(carrito.get(i).getCantidad()) + "\n";
        }
        return resultado;
    }


    
}
