/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;
import inventario.*;
import java.util.ArrayList;
/**
 *
 * @author Tati
 */
public class PagoCredito extends Pago {
    
    private int cantCuotas;
    private float precioCuotas;
    
    public PagoCredito(Venta v, int cantCuotas) {
        super(v);
        this.cantCuotas = cantCuotas;
    }
    
    public float calcularTotal() {
        ArrayList<Detalle> totales = this.getVenta().getDetalle();
        float total = 0;
        
        for(Detalle i: totales){
            total = total + (i.getPrecio() * i.getCantidad());
        }
        
        if (cantCuotas == 2){
            return total + (float)(total * 0.06);
        } else if (cantCuotas == 3) {
            return total + (float)(total * 0.12);
        } else {
            return total + (float)(total * 0.2);
        }
        
    }
    
    public float getPrecioCuotas() {
        return this.getVenta().getTotal()/cantCuotas;
    }
    
}
