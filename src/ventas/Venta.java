/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ventas;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Tati
 */
public class Venta {
    
    private int idVenta; //tal vez despues agrego fecha porque lo dijo el profe
    private float total;
    private ArrayList<Detalle> detalles;
    private Pago pago;
    
    public Venta(Pago p) {
        this.pago = p;
        detalles = new ArrayList<Detalle>();
    }
    
    public ArrayList<Detalle> getDetalle() {
        return this.detalles;
    }
    
    public void setPago(Pago p) {
        this.pago = p;
    }
    
    private void setTotal() {
        this.total = pago.calcularTotal();
    }
    
    public float getTotal() {
        setTotal();
        return this.total;
    }
    
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
}
