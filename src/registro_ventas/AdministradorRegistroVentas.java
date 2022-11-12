/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro_ventas;
import java.util.ArrayList;
import ventas.Venta;
/**
 *
 * @author Tati
 */
public class AdministradorRegistroVentas {
    
    private RegistroVentas registroVentas;
    
    
    public AdministradorRegistroVentas() {
        importarRegistroVentas();
        
    }
    
    private void importarRegistroVentas(){
        registroVentas = new RegistroVentas();
    }
    
    public void agregarVenta(Venta v) {
        registroVentas.getListaVentas().add(v);
        registroVentas.setCantidadVentas(registroVentas.getCantidadVentas()+ 1);
        
    }
    
    public void getProductosMasVendidos() {
        
    }
    
    
    public RegistroVentas getRegistroVentas() {
        return registroVentas;
    }
    
    
    
}