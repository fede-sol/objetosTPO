package inventario;

import ejecucion.VistaMenuPrincipal;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fede
 */
public class VistaCatalogo extends javax.swing.JFrame {

  
    public VistaCatalogo() {
        adminCatalogo = new AdministradorCatalogo();
        initComponents();

        
        
        crearTabla(adminCatalogo.getCatalogo());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        tituloCatalogo = new javax.swing.JLabel();
        panelCentral = new javax.swing.JScrollPane();
        tablaCatalogo = new javax.swing.JTable();
        panelInferior = new javax.swing.JPanel();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panelSuperior.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 60, 5));

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        panelSuperior.add(botonAtras);

        tituloCatalogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloCatalogo.setText("       Catálogo");
        panelSuperior.add(tituloCatalogo);

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
        panelCentral.setViewportView(tablaCatalogo);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        panelInferior.add(botonAgregar);

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        panelInferior.add(botonModificar);

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelInferior.add(botonEliminar);

        botonFiltrar.setText("Filtrar productos con stock mínimo");
        botonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFiltrarActionPerformed(evt);
            }
        });
        panelInferior.add(botonFiltrar);

        getContentPane().add(panelInferior, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        this.setEnabled(false);
        new VistaProducto(this,adminCatalogo,0);
        
        
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        actualizarTabla(adminCatalogo.getCatalogo());
        
    }//GEN-LAST:event_formWindowActivated

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        
        if(hayFilaSeleccionada()){
            
            adminCatalogo.removerProducto(codigoArticuloSeleccionado());
            actualizarTabla(adminCatalogo.getCatalogo());
        }
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed

            this.dispose();
        
            java.awt.EventQueue.invokeLater(() -> {
                new VistaMenuPrincipal().setVisible(true);
            });
        
            
        
        
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        
        
        if(hayFilaSeleccionada()){
            
            this.setEnabled(false);
            new VistaProducto(this,adminCatalogo,1,codigoArticuloSeleccionado());
        }
        
        
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFiltrarActionPerformed
        
        this.setEnabled(false);
        new VistaProductosStockMin(this,adminCatalogo).setVisible(true);
        
    }//GEN-LAST:event_botonFiltrarActionPerformed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonFiltrar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JScrollPane panelCentral;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tablaCatalogo;
    private javax.swing.JLabel tituloCatalogo;
    // End of variables declaration//GEN-END:variables

    private AdministradorCatalogo adminCatalogo;
    
    private DefaultTableModel modeloTabla;
    private final String[] TITULO_COLUMNAS = {"Código","Descripción", "Stock", "Precio"};
    
    private void crearTabla(Catalogo catalogo) {
        ArrayList<Producto> listaAuxiliar = new ArrayList<>(catalogo.getListaProducto());
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
 
    private void actualizarTabla(Catalogo catalogo) {
        LinkedList<Producto> listaAuxiliar = new LinkedList<>(catalogo.getListaProducto());

        modeloTabla.setRowCount(listaAuxiliar.size());

        for (int i = 0; i < listaAuxiliar.size(); i++) {

            modeloTabla.setValueAt(listaAuxiliar.get(i).getCodigo(), i, 0);
            modeloTabla.setValueAt(listaAuxiliar.get(i).getDescripcion(), i, 1);
            modeloTabla.setValueAt(listaAuxiliar.get(i).getStock(), i, 2);
            modeloTabla.setValueAt(listaAuxiliar.get(i).getPrecioUnitario(), i, 3);

        }

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



}
