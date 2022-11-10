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
public class RegistroVentas {
    
    private ArrayList<Venta> ventas;
    
    public RegistroVentas() {
        ventas = new ArrayList<Venta>();
    }
    
    public ArrayList<Venta> getListaVentas() {
        return ventas;
    }
}
