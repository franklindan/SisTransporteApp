/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Cliente;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class GenerarReserva extends javax.swing.JInternalFrame {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    /**
     * Creates new form GenerarReserva
     */
    public GenerarReserva() {
        initComponents();
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setIconifiable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        btnCalcularCosto = new javax.swing.JButton();
        txtCosto = new javax.swing.JTextField();
        btnPlaca = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generar reserva");

        lblTitulo.setText("Generar reserva:");

        jLabel2.setText("Ingrese DNI:");

        jLabel3.setText("Tipo de reserva:");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moto", "Taxi o colectivo" }));

        jLabel4.setText("Hora de reserva (00:00 a 23:59):");

        jLabel5.setText("Dirrección de su ubicación actual:");

        jLabel6.setText("Dirrección de su destino:");

        btnCalcularCosto.setText("Calcular costo:");

        btnPlaca.setText("Placa de su vehiculo:");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/generarReserva.png"))); // NOI18N
        btnAgregar.setText("Reservar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(btnCalcularCosto)
                                    .addComponent(btnPlaca))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnAgregar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularCosto)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try {
            conn=App.ConnectionBd.Enlace(conn);
            st=App.ConnectionBd.sta(st);
            
            String tipo,hora,direccion,origen,destino,costo,placa,sSQL;
            int dni;
            
            tipo=String.valueOf(cbxTipo.getSelectedItem());
            hora=txtHora.getText();
            direccion=txtUbicacion.getText();
            origen=txtUbicacion.getText();
            destino=txtDestino.getText();
            costo=txtCosto.getText();
            placa=txtPlaca.getText();
            dni=Integer.parseInt(txtDni.getText());

            if (dni==0){
                JOptionPane.showMessageDialog(null, "Campos sin llenar");
                txtDni.grabFocus();
            } else {
                sSQL="insert into Reserva (tipoReserva,horaReserva,direRese,origReserv,destReserva,costoReserva,"
                        + "Cliente_dniClie,Vehiculo_placVehi)values ('"+tipo+"','"+hora+"','"+direccion+"','"
                        +origen+"','"+destino+"','"+costo+"','"+dni+"','"+placa+"');";
                try{
                    Statement st=(Statement) conn.createStatement();
                    st.executeUpdate(sSQL);
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Introduzca los datos correctamente");
                }
                limpia();
                //buscar("");
                conn.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el dato, verifique porfavor.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Introduzca los datos correctamente");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcularCosto;
    private javax.swing.JButton btnPlaca;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
    private void limpia(){
        cbxTipo.setSelectedItem("Moto");
        txtHora.setText("");
        txtUbicacion.setText("");
        txtUbicacion.setText("");
        txtDestino.setText("");
        txtCosto.setText("");
        txtPlaca.setText("");
        txtDni.setText("");
        txtDni.grabFocus();
    }
}
