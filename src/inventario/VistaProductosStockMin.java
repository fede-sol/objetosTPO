 package inventario;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fede
 */
public class VistaProductosStockMin extends javax.swing.JFrame {

   
    public VistaProductosStockMin(VistaCatalogo vistaCatalogo,AdministradorCatalogo adminCatalogo) {
        
        initComponents();
       
        
        
        vistaCatalogoAdmin = vistaCatalogo;
        
        crearTabla(adminCatalogo.getProductosStockMin());
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        panelCentral = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        panelSuperior.add(botonAtras);

        titulo.setText("Productos que llegaron al stock mínimo");
        panelSuperior.add(titulo);

        getContentPane().add(panelSuperior, java.awt.BorderLayout.NORTH);

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        panelCentral.setViewportView(tablaProductos);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
       this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
        vistaCatalogoAdmin.setEnabled(true);
        vistaCatalogoAdmin.toFront();
        
        
    }//GEN-LAST:event_formWindowClosed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JScrollPane panelCentral;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    
    private VistaCatalogo vistaCatalogoAdmin;


    
    private DefaultTableModel modeloTabla;
    private final String[] TITULO_COLUMNAS = {"Código","Descripción", "Stock", "Precio"};
    
    private void crearTabla(ArrayList<Producto> listaProductosStockMin) {
        ArrayList<Producto> listaAuxiliar = new ArrayList<>(listaProductosStockMin);
        Object[][] datos = new Object[listaAuxiliar.size()][TITULO_COLUMNAS.length];

        for (int i = 0; i < listaAuxiliar.size(); i++) {

            datos[i][0] = listaAuxiliar.get(i).getCodigo();
            datos[i][1] = listaAuxiliar.get(i).getDescripcion();
            datos[i][2] = listaAuxiliar.get(i).getStock();
            datos[i][3] = listaAuxiliar.get(i).getPrecioUnitario();

        }

        modeloTabla = new DefaultTableModel(datos, TITULO_COLUMNAS) {

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        tablaProductos.setModel(modeloTabla);
    }


}
