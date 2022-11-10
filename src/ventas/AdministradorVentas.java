/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;

/**
 *
 * @author Tati
 */
public class AdministradorVentas {
    
    private RegistroVentas registroVentas;
    
    public AdministradorVentas() {
        importarRegistroVentas();
    }
    
    private void importarRegistroVentas(){
        registroVentas = new RegistroVentas();
    }
    
    
    public RegistroVentas getRegistroVentas() {
        return registroVentas;
    }
    
    
    
}
