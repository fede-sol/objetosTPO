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
    
    public ArrayList<Detalle> getCarrito() {
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
    
    public int getIdVenta(){
        return id;
    }
    
    public String toText() {
        String resultado = "";
        for(int i = 0; i < carrito.size(); i++) {
            resultado = String.valueOf(carrito.get(i).getCodigo()) + " " + String.valueOf(carrito.get(i).getCantidad()) + "\n";
        }
        return resultado;
    }

    
}
