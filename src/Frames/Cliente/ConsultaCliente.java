/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Cliente;

import Frames.Log;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author Franklin
 */
public class ConsultaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaCliente
     */
    public ConsultaCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        btnConsultaReserva = new javax.swing.JButton();
        btnConsultaVehiculo = new javax.swing.JButton();
        btnConsultaGoogle = new javax.swing.JButton();
        btnConsultaParadero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas cliente");

        jLabel1.setText("Consultas del cliente:");

        btnConsultaReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/consultaReserva.png"))); // NOI18N
        btnConsultaReserva.setText("Consulta de reservas:");
        btnConsultaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaReservaActionPerformed(evt);
            }
        });

        btnConsultaVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/consultaVehiculoc.png"))); // NOI18N
        btnConsultaVehiculo.setText("Consulta de vehiculos cerca:");

        btnConsultaGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/maps.png"))); // NOI18N
        btnConsultaGoogle.setText("Consulta de destino en google maps:");

        btnConsultaParadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/paradero.png"))); // NOI18N
        btnConsultaParadero.setText("Consulta de paraderos de buses:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnConsultaGoogle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultaVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultaParadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaReserva)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaVehiculo)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaGoogle)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaParadero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaReservaActionPerformed
        // TODO add your handling code here:
        ConsultaReserva c=new ConsultaReserva();
        Dimension pantalla=Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana=c.getSize();
        c.setLocation((pantalla.width-ventana.width)/2, (pantalla.height-ventana.height)/5);
        c.setVisible(true);
    }//GEN-LAST:event_btnConsultaReservaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaGoogle;
    private javax.swing.JButton btnConsultaParadero;
    private javax.swing.JButton btnConsultaReserva;
    private javax.swing.JButton btnConsultaVehiculo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
