/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registro_ventas;
import ejecucion.VistaMenuPrincipal;
import ventas.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;

/**
 *
 * @author Tati
 */
public class VistaRegistroVentas extends javax.swing.JFrame {
    private AdministradorRegistroVentas adminVentas;
    private DefaultTableModel modeloTabla;

    /**
     * Creates new form VistaRegistroVentas
     */
    public VistaRegistroVentas() {
        adminVentas = new AdministradorRegistroVentas();
        initComponents();
        crearTabla(adminVentas.getRegistroVentas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btnProdMasVendidos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRegistro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnProdMasVendidos.setText("Productos Mas Vendidos");

        tablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaRegistro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnProdMasVendidos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAtras)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProdMasVendidos)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        
            java.awt.EventQueue.invokeLater(() -> {
                new VistaMenuPrincipal().setVisible(true);
            });
    }//GEN-LAST:event_btnAtrasActionPerformed

    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnProdMasVendidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
    
    private final String[] TITULO_COLUMNAS = {"ID Venta", "Producto y Cantidad", "Pago" ,"Total"};
 
    
    
    private void crearTabla(RegistroVentas registro){
        DefaultTableModel modeloTabla = new DefaultTableModel();
        for (String i : TITULO_COLUMNAS) {
            modeloTabla.addColumn(i);
        }
        this.tablaRegistro.setModel(modeloTabla);
        
        ArrayList<Venta> listaAuxiliar = new ArrayList<>(registro.getListaVentas());
        
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        
        for (int i = 0; i < listaAuxiliar.size(); i ++) {
            
            Object[] arrayAux = new Object[TITULO_COLUMNAS.length];
            arrayAux[0] = listaAuxiliar.get(i).getIdVenta();
            arrayAux[1] = listaAuxiliar.get(i).toText();
            arrayAux[2] = listaAuxiliar.get(i).getPago().toText();
            arrayAux[3] = listaAuxiliar.get(i).getTotal();
            
            datos.add(arrayAux);
        
        }
        
        for(Object[] itemDato : datos) {
            modeloTabla.addRow(itemDato);
        }
        
        tablaRegistro.setModel(modeloTabla);
        //tablaRegistro.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
        

    }
    /*
    public class TextAreaRenderer extends JTextArea
    implements TableCellRenderer {

    public TextAreaRenderer() {
      setLineWrap(true);
      setWrapStyleWord(true);
    }

    public Component getTableCellRendererComponent(JTable jTable,
        Object obj, boolean isSelected, boolean hasFocus, int row,
        int column) {
      setText((String)obj);
      return this;
    }
*/
  }
    
    
    
    
    



