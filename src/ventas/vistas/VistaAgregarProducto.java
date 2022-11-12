package ventas.vistas;

import inventario.Producto;
import java.util.ArrayList;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import ventas.AdministradorVentas;

/**
 *
 * @author Fede
 */
public class VistaAgregarProducto extends javax.swing.JFrame {

 
    public VistaAgregarProducto(VistaVenta adminVistaVenta,AdministradorVentas adminVentas) {
        initComponents();
        this.adminVistaVenta = adminVistaVenta;
        this.adminVentas = adminVentas;
        
        crearTabla(adminVentas.getListadoCatalogoAuxiliar());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelSuperior = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        panelCatalogo = new javax.swing.JScrollPane();
        tablaCatalogo = new javax.swing.JTable();
        panelLateral = new javax.swing.JPanel();
        textoCantidad = new javax.swing.JLabel();
        campoCantidad = new javax.swing.JSpinner();
        botonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(151, 280));
        setPreferredSize(new java.awt.Dimension(635, 280));

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        panelSuperior.add(botonAtras);

        titulo.setText("Agregar artículo");
        panelSuperior.add(titulo);

        getContentPane().add(panelSuperior, java.awt.BorderLayout.NORTH);

        tablaCatalogo.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCatalogoMouseClicked(evt);
            }
        });
        panelCatalogo.setViewportView(tablaCatalogo);

        getContentPane().add(panelCatalogo, java.awt.BorderLayout.CENTER);

        panelLateral.setLayout(new java.awt.GridBagLayout());

        textoCantidad.setText("Cantidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 21, 7, 21);
        panelLateral.add(textoCantidad, gridBagConstraints);

        campoCantidad.setEnabled(false);
        campoCantidad.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        panelLateral.add(campoCantidad, gridBagConstraints);

        botonConfirmar.setText("Confirmar");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 21, 17, 21);
        panelLateral.add(botonConfirmar, gridBagConstraints);

        getContentPane().add(panelLateral, java.awt.BorderLayout.WEST);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
       
        if(hayFilaSeleccionada()){
            if((int) campoCantidad.getValue() > 0)
                adminVentas.agregarProducto((int) campoCantidad.getValue(), codigoArticuloSeleccionado());
            else
                System.out.println("todo mal");
            
                
                
        }
        
        
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        
        this.dispose();
        adminVistaVenta.setEnabled(true);
        adminVistaVenta.toFront();
       
      
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void tablaCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCatalogoMouseClicked
        
        actualizarSpinner();
        
        
    }//GEN-LAST:event_tablaCatalogoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JSpinner campoCantidad;
    private javax.swing.JScrollPane panelCatalogo;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tablaCatalogo;
    private javax.swing.JLabel textoCantidad;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    private VistaVenta adminVistaVenta;
    private AdministradorVentas adminVentas;

    private DefaultTableModel modeloTabla;
    private final String[] TITULO_COLUMNAS = {"Código","Descripción", "Stock", "Precio"};
    
    private void crearTabla(ArrayList<Producto> catalogoAux) {
        ArrayList<Producto> listaAuxiliar = new ArrayList<>(catalogoAux);
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

        tablaCatalogo.setModel(modeloTabla);
    }



    
    private boolean hayFilaSeleccionada() {

        return tablaCatalogo.isRowSelected(tablaCatalogo.getSelectedRow());
    }

    private int codigoArticuloSeleccionado() {

        if (tablaCatalogo.getSelectedRows().length <= 1) {
            
            return Integer.parseInt(String.valueOf(tablaCatalogo.getValueAt(tablaCatalogo.getSelectedRow(), 0)));
        }
        return -1;
    }

    
    private void actualizarSpinner() {
        
        campoCantidad.setModel(new SpinnerNumberModel(0, 0, Integer.parseInt(String.valueOf(tablaCatalogo.getValueAt(tablaCatalogo.getSelectedRow(), 2))), 1));
        campoCantidad.setEnabled(true);
    }

}
