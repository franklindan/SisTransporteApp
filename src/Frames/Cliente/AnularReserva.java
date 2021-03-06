/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Cliente;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Franklin
 */
public class AnularReserva extends javax.swing.JInternalFrame {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    static String reserva;
    DefaultTableModel datostabla=new DefaultTableModel(); 

    /**
     * Creates new form AnularReserva
     */
    public AnularReserva() {
        initComponents();
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setIconifiable(true);
        String Titulos[]={"IDRESERVA","TIPO","HORA","ORIGEN","DESTINO","COSTO","VEHICULO"};
        datostabla.setColumnIdentifiers(Titulos);
        tbdatos.setModel(datostabla);
        //tbdatos.getColumnModel().getColumn(0).setMaxWidth(0);
        //tbdatos.getColumnModel().getColumn(0).setMinWidth(0);
        //tbdatos.getColumnModel().getColumn(0).setPreferredWidth(0);
        buscar("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdatos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anular reserva");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/anular.png"))); // NOI18N
        btnAgregar.setText("Anular reserva");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Generar reserva (Puedes anular tu reserva solo con 10 minutos de anticipación):");

        jLabel2.setText("Busqueda:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        jLabel3.setText("Reservas en proceso:");

        tbdatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdatos);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregar)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdatosMouseClicked
        // TODO add your handling code here:
        int fila = -1;
        fila=tbdatos.rowAtPoint(evt.getPoint());
        if(fila > -1){
            reserva=String.valueOf(tbdatos.getValueAt(fila, 0));
        }
    }//GEN-LAST:event_tbdatosMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try {
            conn=App.ConnectionBd.Enlace(conn);
            st=App.ConnectionBd.sta(st);
            
            String sSQL;
            
            String sql1="delete from Reserva where idReserva='"+reserva+"';";
            Statement st1=(Statement) conn.createStatement();
            st1.executeUpdate(sql1);
            buscar("");
            conn.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el dato, verifique porfavor.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        buscar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    private void buscar (String valor){
        try {
            int f,i;
            conn=App.ConnectionBd.Enlace(conn);
            String sql1="Select * from Reserva where idReserva like '%"+valor+"%' or tipoReserva like '%"+valor+"%';";
            
            Statement st1=conn.createStatement();
            ResultSet rs1=st1.executeQuery(sql1);
            String datos[]=new String[7];
            f=datostabla.getRowCount();
            if(f>0)
                for(i=0;i<f;i++)
                    datostabla.removeRow(0);
            while(rs1.next()) {
                datos[0]=(String)rs1.getString(1);
                datos[1]=(String)rs1.getString(2);
                datos[2]=(String)rs1.getString(3);
                datos[3]=(String)rs1.getString(5);
                datos[4]=(String)rs1.getString(6);
                datos[5]=(String)rs1.getString(7);
                datos[6]=(String)rs1.getString(9);
                datostabla.addRow(datos);
            }
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar datos, verifique porfavor");
        }
    }
}
