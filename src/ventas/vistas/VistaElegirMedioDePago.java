package ventas.vistas;

import ejecucion.VistaMenuPrincipal;
import ventas.AdministradorVentas;
import ventas.pagos.PagoContado;
import ventas.pagos.PagoCredito;
import ventas.pagos.PagoDebito;

/**
 *
 * @author Fede
 */
public class VistaElegirMedioDePago extends javax.swing.JFrame {


    public VistaElegirMedioDePago(float subtotal,AdministradorVentas adminVentas,VistaVenta adminVistaVenta) {
        initComponents();
        deshabilitarOpcionesCuotas();
        
        this.adminVistaVenta = adminVistaVenta;
        this.adminVentas = adminVentas;
        
        this.SUBTOTAL = subtotal;
        
        campoTotal.setText(String.valueOf(subtotal));
        
        
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

        botonesMetodoDePago = new javax.swing.ButtonGroup();
        panelSuperior = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        rbEfectivo = new javax.swing.JRadioButton();
        rbDebito = new javax.swing.JRadioButton();
        rbCredito = new javax.swing.JRadioButton();
        campoTotal = new javax.swing.JTextField();
        tituloTotal = new javax.swing.JLabel();
        cbCuotas = new javax.swing.JComboBox<>();
        tituloCuotas = new javax.swing.JLabel();
        tituloValorCuotas = new javax.swing.JLabel();
        campoValorCuota = new javax.swing.JTextField();
        tituloInteresDescuento = new javax.swing.JLabel();
        campoInteres = new javax.swing.JTextField();
        panelInferior = new javax.swing.JPanel();
        botonConfirmar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        titulo.setText("Elige el método de pago");
        panelSuperior.add(titulo);

        getContentPane().add(panelSuperior, java.awt.BorderLayout.PAGE_START);

        panelCentral.setLayout(new java.awt.GridBagLayout());

        botonesMetodoDePago.add(rbEfectivo);
        rbEfectivo.setText("Efectivo");
        rbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEfectivoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        panelCentral.add(rbEfectivo, gridBagConstraints);

        botonesMetodoDePago.add(rbDebito);
        rbDebito.setText("Débito");
        rbDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDebitoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        panelCentral.add(rbDebito, gridBagConstraints);

        botonesMetodoDePago.add(rbCredito);
        rbCredito.setText("Crédito");
        rbCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCreditoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 64);
        panelCentral.add(rbCredito, gridBagConstraints);

        campoTotal.setEnabled(false);
        campoTotal.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 94;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(21, 11, 25, 11);
        panelCentral.add(campoTotal, gridBagConstraints);

        tituloTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tituloTotal.setText("Total");
        tituloTotal.setMinimumSize(new java.awt.Dimension(40, 30));
        tituloTotal.setPreferredSize(new java.awt.Dimension(40, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(21, 11, 25, 20);
        panelCentral.add(tituloTotal, gridBagConstraints);

        cbCuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "6" }));
        cbCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCuotasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 17, 0);
        panelCentral.add(cbCuotas, gridBagConstraints);

        tituloCuotas.setText("Cantidad de cuotas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(17, 12, 17, 0);
        panelCentral.add(tituloCuotas, gridBagConstraints);

        tituloValorCuotas.setText("Valor por cada cuota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 17, 0);
        panelCentral.add(tituloValorCuotas, gridBagConstraints);

        campoValorCuota.setEnabled(false);
        campoValorCuota.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 17, 0);
        panelCentral.add(campoValorCuota, gridBagConstraints);

        tituloInteresDescuento.setText("Interés");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 17, 0);
        panelCentral.add(tituloInteresDescuento, gridBagConstraints);

        campoInteres.setText("-");
        campoInteres.setEnabled(false);
        campoInteres.setPreferredSize(new java.awt.Dimension(40, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.insets = new java.awt.Insets(17, 10, 17, 10);
        panelCentral.add(campoInteres, gridBagConstraints);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        botonConfirmar.setText("Confirmar venta");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });
        panelInferior.add(botonConfirmar);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        panelInferior.add(botonCancelar);

        getContentPane().add(panelInferior, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCreditoActionPerformed
        
        tituloInteresDescuento.setText("Interes");
        habilitarOpcionesCuotas();
        actualizarValoresCuotas();
        campoValorCuota.setText(String.valueOf(SUBTOTAL));
        
    }//GEN-LAST:event_rbCreditoActionPerformed

    private void rbDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDebitoActionPerformed
        
        deshabilitarOpcionesCuotas();
        campoTotal.setText(String.valueOf(SUBTOTAL));
    }//GEN-LAST:event_rbDebitoActionPerformed

    private void rbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEfectivoActionPerformed
        
        deshabilitarOpcionesCuotas();
        tituloInteresDescuento.setVisible(true);
        tituloInteresDescuento.setText("Descuento: 10%");
        campoTotal.setText(String.valueOf(SUBTOTAL - SUBTOTAL*10/100));
    }//GEN-LAST:event_rbEfectivoActionPerformed

    private void cbCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCuotasActionPerformed
       
        actualizarValoresCuotas();
        
    }//GEN-LAST:event_cbCuotasActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
       
        
        
        if(rbDebito.isSelected()){
            adminVentas.getVenta().setPago(new PagoDebito(adminVentas.getVenta()));
            
        }else if(rbEfectivo.isSelected()){
            adminVentas.getVenta().setPago(new PagoContado(adminVentas.getVenta()));
            
        }else if(rbCredito.isSelected()){
            adminVentas.getVenta().setPago(new PagoCredito(adminVentas.getVenta(),Integer.parseInt((String)cbCuotas.getSelectedItem())));
            
            
        }
        
        adminVentas.registrarVenta();
        this.dispose();
        adminVistaVenta.dispose();
        
            java.awt.EventQueue.invokeLater(() -> {
                new VistaMenuPrincipal().setVisible(true);
        });
        
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
      
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
        adminVistaVenta.setEnabled(true);
        adminVistaVenta.toFront();
    }//GEN-LAST:event_formWindowClosed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.ButtonGroup botonesMetodoDePago;
    private javax.swing.JTextField campoInteres;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JTextField campoValorCuota;
    private javax.swing.JComboBox<String> cbCuotas;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JRadioButton rbCredito;
    private javax.swing.JRadioButton rbDebito;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloCuotas;
    private javax.swing.JLabel tituloInteresDescuento;
    private javax.swing.JLabel tituloTotal;
    private javax.swing.JLabel tituloValorCuotas;
    // End of variables declaration//GEN-END:variables

    private AdministradorVentas adminVentas;
    
    private VistaVenta adminVistaVenta;
    
    private final float SUBTOTAL;

    private void deshabilitarOpcionesCuotas(){
        campoInteres.setVisible(false);
        campoValorCuota.setVisible(false);
        tituloCuotas.setVisible(false);
        tituloInteresDescuento.setVisible(false);
        tituloValorCuotas.setVisible(false);
        cbCuotas.setVisible(false);
        
        
    }
    
    private void habilitarOpcionesCuotas(){
        campoInteres.setVisible(true);
        campoValorCuota.setVisible(true);
        tituloCuotas.setVisible(true);
        tituloInteresDescuento.setVisible(true);
        tituloValorCuotas.setVisible(true);
        cbCuotas.setVisible(true);
        
    }
    
    private void actualizarValoresCuotas(){
        switch (Integer.parseInt((String)cbCuotas.getSelectedItem())) {
            case 2:
                campoInteres.setText("6%");
                campoValorCuota.setText(String.valueOf((SUBTOTAL + (SUBTOTAL*6/100)) /2));
                campoTotal.setText(String.valueOf(SUBTOTAL+ SUBTOTAL*6/100));
                break;
            case 3:
                campoInteres.setText("12%");
                campoValorCuota.setText(String.valueOf((SUBTOTAL + (SUBTOTAL*12/100)) /3));
                campoTotal.setText(String.valueOf(SUBTOTAL+ SUBTOTAL*12/100));
                break;
            case 6:
                campoInteres.setText("20%");
                campoValorCuota.setText(String.valueOf((SUBTOTAL + (SUBTOTAL*20/100)) /6));
                campoTotal.setText(String.valueOf(SUBTOTAL+ SUBTOTAL*20/100));
                break;
            default:
                campoInteres.setText("-");
                campoValorCuota.setText(String.valueOf(SUBTOTAL));
                campoTotal.setText(String.valueOf(SUBTOTAL));
                break;
        }
        
    }







}