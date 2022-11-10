/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;
import java.util.ArrayList;
/**
 *
 * @author Tati
 */
public class AdministradorRegistroVentas {
    
    private RegistroVentas registroVentas;
    int cantidadVentas;
    
    public AdministradorRegistroVentas() {
        importarRegistroVentas();
        cantidadVentas = 0;
    }
    
    private void importarRegistroVentas(){
        registroVentas = new RegistroVentas();
    }
    
    public void agregarVenta(Venta v) {
        registroVentas.getListaVentas().add(v);
        cantidadVentas++;
        v.setIdVenta(cantidadVentas); //setea el id de forma incremental
    }
    
    public void getProductosMasVendidos() {
        
    }
    
    
    public RegistroVentas getRegistroVentas() {
        return registroVentas;
    }
    
    
    
}