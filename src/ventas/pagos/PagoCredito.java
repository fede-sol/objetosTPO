/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas.pagos;
import inventario.*;
import java.util.ArrayList;
import ventas.Venta;
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
 
        return 0;
    }
    
    public float getPrecioCuotas() {
    
        
        return 0;
    }
    
}
