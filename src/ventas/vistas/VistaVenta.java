package ventas.vistas;

import inventario.Catalogo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import ventas.AdministradorVentas;
import ventas.Detalle;

/**
 *
 * @author Fede
 */
public class VistaVenta extends javax.swing.JFrame {

 
    public VistaVenta() {
        initComponents();
        
        adminVentas = new AdministradorVentas();
        crearTabla(adminVentas.getVenta().getCarrito());
        
        
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
        panelCarrito = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        panelIzquierdo = new javax.swing.JPanel();
        botonAgregarProducto = new javax.swing.JButton();
        botonEliminarProducto = new javax.swing.JButton();
        panelInferior = new javax.swing.JPanel();
        textoSubtotal = new javax.swing.JLabel();
        campoSubtotal = new javax.swing.JTextField();
        botonContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAtras.setText("Atrás");
        panelSuperior.add(botonAtras);

        titulo.setText("Nueva venta");
        panelSuperior.add(titulo);

        getContentPane().add(panelSuperior, java.awt.BorderLayout.NORTH);

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        panelCarrito.setViewportView(tablaCarrito);

        getContentPane().add(panelCarrito, java.awt.BorderLayout.CENTER);

        panelIzquierdo.setLayout(new java.awt.GridBagLayout());

        botonAgregarProducto.setText("Agregar artículo");
        botonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(28, 34, 28, 34);
        panelIzquierdo.add(botonAgregarProducto, gridBagConstraints);

        botonEliminarProducto.setText("Eliminar artículo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(39, 0, 39, 0);
        panelIzquierdo.add(botonEliminarProducto, gridBagConstraints);

        getContentPane().add(panelIzquierdo, java.awt.BorderLayout.WEST);

        panelInferior.setLayout(new java.awt.GridBagLayout());

        textoSubtotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textoSubtotal.setText("Subtotal: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(29, 0, 29, 0);
        panelInferior.add(textoSubtotal, gridBagConstraints);

        campoSubtotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoSubtotal.setEnabled(false);
        campoSubtotal.setMinimumSize(new java.awt.Dimension(20, 20));
        campoSubtotal.setPreferredSize(new java.awt.Dimension(100, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(29, 0, 29, 50);
        panelInferior.add(campoSubtotal, gridBagConstraints);

        botonContinuar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonContinuar.setText("Continuar");
        botonContinuar.setMaximumSize(new java.awt.Dimension(120, 35));
        botonContinuar.setMinimumSize(new java.awt.Dimension(120, 35));
        botonContinuar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(29, 50, 29, 0);
        panelInferior.add(botonContinuar, gridBagConstraints);

        getContentPane().add(panelInferior, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed
      
        new VistaAgregarProducto(this,adminVentas).setVisible(true);
        
        
    }//GEN-LAST:event_botonAgregarProductoActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonEliminarProducto;
    private javax.swing.JTextField campoSubtotal;
    private javax.swing.JScrollPane panelCarrito;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JLabel textoSubtotal;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    /*
    * este catalogo es una copia del original y va a ser el que voy a manipular durante la venta
    * cuando agregue articulos al carrito, se va a descontar el stock de este catalogo auxiliar
    * una vez terminada la venta, el catalogo original va a ser reemplazado por esta copia
    * en caso de que se cancele la venta, no afecta al catalogo original
    */
    
    
    
    private AdministradorVentas adminVentas;
    
    private DefaultTableModel modeloTabla;
    private final String[] TITULO_COLUMNAS = {"Código","Cantidad", "Descripción", "Precio unitario","Precio total"};
    
    private void crearTabla(ArrayList<Detalle> carrito) {
        ArrayList<Detalle> listaAuxiliar = new ArrayList<>(carrito);
        Object[][] datos = new Object[listaAuxiliar.size()][TITULO_COLUMNAS.length];

        for (int i = 0; i < listaAuxiliar.size(); i++) {

            datos[i][0] = listaAuxiliar.get(i).getCodigo();
            datos[i][1] = listaAuxiliar.get(i).getCantidad();
            datos[i][2] = listaAuxiliar.get(i).getDescripcion();
            datos[i][3] = listaAuxiliar.get(i).getPrecioUnitario();
            datos[i][4] = listaAuxiliar.get(i).getPrecioUnitario() * listaAuxiliar.get(i).getCantidad();

        }

        modeloTabla = new DefaultTableModel(datos, TITULO_COLUMNAS) {

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        tablaCarrito.setModel(modeloTabla);
    }

    protected void actualizarTabla(ArrayList<Detalle> carrito) {
        ArrayList<Detalle> listaAuxiliar = new ArrayList<>(carrito);

        modeloTabla.setRowCount(listaAuxiliar.size());

        for (int i = 0; i < listaAuxiliar.size(); i++) {

            modeloTabla.setValueAt(listaAuxiliar.get(i).getCodigo(), i, 0);
            modeloTabla.setValueAt(listaAuxiliar.get(i).getCantidad(), i, 1);
            modeloTabla.setValueAt(listaAuxiliar.get(i).getDescripcion(), i, 2);
            modeloTabla.setValueAt(listaAuxiliar.get(i).getPrecioUnitario(), i, 3);
            modeloTabla.setValueAt(listaAuxiliar.get(i).getPrecioUnitario()*listaAuxiliar.get(i).getCantidad(), i, 4);

        }

    }


    
    
    private boolean hayFilaSeleccionada() {

        return tablaCarrito.isRowSelected(tablaCarrito.getSelectedRow());
    }

    private int codigoArticuloSeleccionado() {

        if (tablaCarrito.getSelectedRows().length <= 1) {
            
            return Integer.parseInt(String.valueOf(tablaCarrito.getValueAt(tablaCarrito.getSelectedRow(), 0)));
        }
        return -1;
    }











}
