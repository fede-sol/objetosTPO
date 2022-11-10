/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author Fede
 */
public class VistaProducto extends javax.swing.JFrame {

    /**
     * Creates new form VistaProducto
     */
    public VistaProducto(VistaCatalogo vistaCatalogo) {
        initComponents();
        setVisible(true);
        
        vistaCatalogoAdmin = vistaCatalogo;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelSuperior = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        tfStock = new javax.swing.JTextField();
        tfStockMinimo = new javax.swing.JTextField();
        tfPrecio = new javax.swing.JTextField();
        tfDescripcion = new javax.swing.JTextField();
        labelStockMinimo = new javax.swing.JLabel();
        labelStock = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(192, 77));
        setPreferredSize(new java.awt.Dimension(500, 312));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        titulo.setText("Agregar producto");
        panelSuperior.add(titulo);

        getContentPane().add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        panelCentral.setLayout(new java.awt.GridBagLayout());

        tfStock.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelCentral.add(tfStock, gridBagConstraints);

        tfStockMinimo.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 0, 28, 0);
        panelCentral.add(tfStockMinimo, gridBagConstraints);

        tfPrecio.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 0, 28, 0);
        panelCentral.add(tfPrecio, gridBagConstraints);

        tfDescripcion.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelCentral.add(tfDescripcion, gridBagConstraints);

        labelStockMinimo.setText("Stock mínimo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 0, 28, 46);
        panelCentral.add(labelStockMinimo, gridBagConstraints);

        labelStock.setText("Stock");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 46);
        panelCentral.add(labelStock, gridBagConstraints);

        labelPrecio.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 0, 28, 46);
        panelCentral.add(labelPrecio, gridBagConstraints);

        labelDescripcion.setText("Descripcion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 46);
        panelCentral.add(labelDescripcion, gridBagConstraints);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        botonGuardar.setText("Guardar");
        panelInferior.add(botonGuardar);

        botonCancelar.setText("Cancelar");
        panelInferior.add(botonCancelar);

        getContentPane().add(panelInferior, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        vistaCatalogoAdmin.setEnabled(true);
        vistaCatalogoAdmin.toFront();

        
    }//GEN-LAST:event_formWindowClosed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelStock;
    private javax.swing.JLabel labelStockMinimo;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfPrecio;
    private javax.swing.JTextField tfStock;
    private javax.swing.JTextField tfStockMinimo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables


    private VistaCatalogo vistaCatalogoAdmin;

}
