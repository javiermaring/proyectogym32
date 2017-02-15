package com.leonardo.gym.view;

import com.leonardo.gym.dao.Antropometria;
import com.leonardo.gym.dao.Clientes;
import com.leonardo.gym.util.Util;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

//hola soy fabian

public class BusquedaPane extends javax.swing.JDialog {

    private RutinaPrincipal rutinaPrincipal;
    DefaultTableModel modelo;
    ResultSet rs;
    Clientes cliente = new Clientes();
    private String id_cli;

    public String getId_cli() {
        return id_cli;
    }
    ResultSet rsl, rsantro;
    Antropometria an = new Antropometria();
    Util util = new Util();

    BusquedaPane() {
    
    }

   
    public BusquedaPane(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        rutinaPrincipal = (RutinaPrincipal) parent;

        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        modelo = (DefaultTableModel) tabClientes.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCliente = new javax.swing.JPanel();
        cbxBusqueda = new javax.swing.JComboBox<String>();
        lblBusqueda = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        panResultados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabClientes = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda de cliente\n");

        panCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

        cbxBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nombre", "Apellido", "Nif", "Teléfono fijo", "Teléfono movil", "Email" }));

        lblBusqueda.setText("Buscar por:");

        btnBusqueda.setText("buscar");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panClienteLayout = new javax.swing.GroupLayout(panCliente);
        panCliente.setLayout(panClienteLayout);
        panClienteLayout.setHorizontalGroup(
            panClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panClienteLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(lblBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panClienteLayout.setVerticalGroup(
            panClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnBusqueda)
                    .addComponent(lblBusqueda)
                    .addComponent(cbxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panResultados.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        tabClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "NIF", "Teléfono", "Email"
            }
        ));
        jScrollPane1.setViewportView(tabClientes);

        javax.swing.GroupLayout panResultadosLayout = new javax.swing.GroupLayout(panResultados);
        panResultados.setLayout(panResultadosLayout);
        panResultadosLayout.setHorizontalGroup(
            panResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        panResultadosLayout.setVerticalGroup(
            panResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitulo.setText("Busqueda de clientes");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed

        int filas = tabClientes.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
        if (cbxBusqueda.getSelectedItem().equals("ID")) {

            rs = cliente.busquedaID(txtBusqueda.getText());
        } else if (cbxBusqueda.getSelectedItem().equals("Nombre")) {
            rs = cliente.busquedaNombre(txtBusqueda.getText());
        } else if (cbxBusqueda.getSelectedItem().equals("Apellido")) {
            rs = cliente.busquedaApellido(txtBusqueda.getText());
        } else if (cbxBusqueda.getSelectedItem().equals("Nif")) {
            rs = cliente.busquedaNif(txtBusqueda.getText());
        } else if (cbxBusqueda.getSelectedItem().equals("Teléfono fijo")) {
            rs = cliente.busquedaTelefonoFijo(txtBusqueda.getText());
        } else if (cbxBusqueda.getSelectedItem().equals("Teléfono movil")) {
            rs = cliente.busquedaTelefonoMovil(txtBusqueda.getText());
        } else {
            rs = cliente.busquedaEmail(txtBusqueda.getText());
        }

        try {

            while (rs.next()) {

                modelo.addRow(new Object[]{rs.getInt("id_cliente"), rs.getString("nombre"),
                    rs.getString("apellidos"), rs.getString("nif"), rs.getInt("telefono_fijo"), rs.getString("email")});
            }
            if (!rs.last()) {
                JOptionPane.showMessageDialog(null, "No se encontraron usuarios con esos datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusquedaPane.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        int aux = (int) modelo.getValueAt(tabClientes.getSelectedRow(), 0);
        rutinaPrincipal.establecerId(aux);

        rs = cliente.busquedaID(Integer.toString(aux));
        rsantro = an.busquedaAntropometria(Integer.toString(aux));
        try {

            while (rs.next()) {

                rutinaPrincipal.establecerNombre(rs.getString("nombre"));
                rutinaPrincipal.establecerApellidos(rs.getString("apellidos"));
                rutinaPrincipal.establecerEdad(Integer.toString(util.CalcularEdad(rs.getString("fecha_nacimiento"))));

            }
            rs.close();

            while (rsantro.next()) {
                float peso = rsantro.getFloat("peso");
                rutinaPrincipal.establecerPeso(String.valueOf(peso));
                float imc = rsantro.getFloat("IMC");
                rutinaPrincipal.establecerIMC(String.valueOf(imc));
            }
            
            
         id_cli=modelo.getValueAt(tabClientes.getSelectedRow(), 0).toString();
         
         rutinaPrincipal.rellenarDatosTabla(id_cli);
         
         
            rsantro.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(RutinaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BusquedaPane dialog = new BusquedaPane(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {

                    }
                });
                dialog.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxBusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panCliente;
    private javax.swing.JPanel panResultados;
    private javax.swing.JTable tabClientes;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

}
