package ventas;
import ventas.pagos.Pago;
import java.util.ArrayList;
import java.io.Serializable;
/**
 * 
 * @author Tati
 */
public class Venta implements Serializable{
    
    private int id; 
    private float subtotal;
    private float total;
    private ArrayList<Detalle> carrito;
    private Pago pago;

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

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
            resultado = resultado + 
                    "Codigo: " + String.valueOf(carrito.get(i).getCodigo()) + "         " + 
                    "Cantidad: " + String.valueOf(carrito.get(i).getCantidad()) + "\n";
        }
        System.out.println(resultado);
        return resultado;
    }


    
}
