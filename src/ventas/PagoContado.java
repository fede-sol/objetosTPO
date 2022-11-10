/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;
import java.util.ArrayList;
import inventario.*;
/**
 *
 * @author Tati
 */
public class PagoContado extends Pago {
    
    public PagoContado(Venta v) {
        super(v);
    }
    
    public float calcularTotal() {
        ArrayList<Detalle> totales = this.getVenta().getDetalle();
        float total = 0;
        
        for(Detalle i: totales){
            total = total + (i.getPrecio() * i.getCantidad());
        }
        
        return (total- (float)(total*0.1));
    }
    
}
