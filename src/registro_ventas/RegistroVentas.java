/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro_ventas;
import java.util.ArrayList;
import ventas.Venta;
import java.io.Serializable;
/**
 *
 * @author Tati
 */
public class RegistroVentas implements Serializable{
    
    private ArrayList<Venta> ventas;
    private int cantidadVentas;
    
    public RegistroVentas() {
        ventas = new ArrayList<>();
        cantidadVentas = 0;
    }
    
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }
    
    public ArrayList<Venta> getListaVentas() {
        return ventas;
    }
    
    
}
