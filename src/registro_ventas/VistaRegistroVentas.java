/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registro_ventas;
import ejecucion.VistaMenuPrincipal;
import ventas.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import inventario.AdministradorCatalogo;
import java.awt.Font;

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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnProdMasVendidos.setText("Productos Mas Vendidos");
        btnProdMasVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdMasVendidosActionPerformed(evt);
            }
        });

        tablaRegistro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        tablaRegistro.setRowHeight(30);
        jScrollPane2.setViewportView(tablaRegistro);
        if (tablaRegistro.getColumnModel().getColumnCount() > 0) {
            tablaRegistro.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablaRegistro.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jLabel1.setText("Registro de Ventas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(btnProdMasVendidos))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAtras)
                .addGap(187, 187, 187)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(jLabel1))
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

    private void btnProdMasVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdMasVendidosActionPerformed
        
        this.setEnabled(false);
        new VistaProductosMasVendidos(this, adminVentas).setVisible(true);
    }//GEN-LAST:event_btnProdMasVendidosActionPerformed

    
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnProdMasVendidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaRegistro;
    // End of variables declaration//GEN-END:variables
    
    private final String[] TITULO_COLUMNAS = {"ID Venta", "Producto y Cantidad", "Pago" ,"Total"};
 
    
    
    private void crearTabla(RegistroVentas registro){
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
            
        };
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
        tablaRegistro.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
        actualizarAlturaFila();
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tablaRegistro.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tablaRegistro.getColumnModel().getColumn(2).setCellRenderer(tcr);
        tablaRegistro.getColumnModel().getColumn(3).setCellRenderer(tcr);
        
    }
    
    public class TextAreaRenderer extends JTextArea implements TableCellRenderer {

        public TextAreaRenderer() {
          setLineWrap(true);
          setWrapStyleWord(true);
          setFont(new Font("Arial", Font.PLAIN, 12));
          
        }

        public Component getTableCellRendererComponent(JTable jTable, Object obj, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((String)obj);
            return this;
        }
    }
    
    private void actualizarAlturaFila() {
        for (int row = 0; row < tablaRegistro.getRowCount(); row++) {
            int rowHeight = tablaRegistro.getRowHeight();

            for (int column = 0; column < tablaRegistro.getColumnCount(); column++) {
                Component comp = tablaRegistro.prepareRenderer(tablaRegistro.getCellRenderer(row, column), row, column);
                rowHeight = Math.max(rowHeight, comp.getPreferredSize().height);
            }

            tablaRegistro.setRowHeight(row, rowHeight);
        }
    }
    
  }
    
    
    
    
    



