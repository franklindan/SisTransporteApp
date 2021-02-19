/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Administrador;

import Frames.Log;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Franklin
 */
public class TransporteForm extends javax.swing.JInternalFrame {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;

    /**
     * Creates new form TransporteForm
     */
    public TransporteForm() {
        initComponents();
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setIconifiable(true);
        mostrar(Log.transporte);
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
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRegion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCantidadpara = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtParadero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHoraI = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHoraF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transporte");

        jLabel1.setText("Información transporte:");

        jLabel2.setText("Nombre transporte:");

        jLabel3.setText("Tipo de transporte:");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moto", "Taxi", "Combi o bus" }));

        jLabel4.setText("País:");

        jLabel5.setText("Región:");

        jLabel6.setText("Ciudad:");

        jLabel7.setText("Distrito:");

        jLabel8.setText("Ruta transporte:");

        jLabel9.setText("Cantidad de parderos:");

        jLabel10.setText("Paradero principal:");

        jLabel11.setText("Hora de inicio del transporte ejm(5:00):");

        jLabel12.setText("Hora fin del transporte ejm(21:00):");

        jLabel13.setText("RUC de la empresa de transporte:");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        btnAgregar.setText("Guardar");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtParadero, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCantidadpara, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHoraI, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11))
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtHoraF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCantidadpara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtParadero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtHoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoraF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnAgregar)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try {
            conn=App.ConnectionBd.Enlace(conn);
            st=App.ConnectionBd.sta(st);
            
            String nombre,tipo,pais,region,ciudad,distrito,ruta,cantpara,dire,hori,horf,ruc,sSQL;
            
            nombre=txtNombre.getText();
            tipo=(String)cbxTipo.getSelectedItem();
            pais=txtPais.getText();
            region=txtRegion.getText();
            ciudad=txtCiudad.getText();
            distrito=txtDistrito.getText();
            ruta=txtRuta.getText();
            cantpara=txtCantidadpara.getText();
            dire=txtParadero.getText();
            hori=txtHoraI.getText();
            horf=txtHoraF.getText();
            ruc=txtRuc.getText();

            if (nombre.equals("")){
                JOptionPane.showMessageDialog(null, "Campos sin llenar");
                txtNombre.grabFocus();
            } else {
                sSQL="update Transporte set NombTran='"
                        +nombre+"',tipoTran='"+tipo+"',paisTran='"+pais
                        +"',regiTran='"+region+"',ciudTran='"+ciudad+"',distTran='"+distrito+"',rutaTran='"+ruta+"',cantParaTran='"+cantpara
                        +"',direParaPrinTran='"+dire+"',horaInicTran='"+hori+"',horaFinaTran='"+horf+"',rucTran='"+ruc+"' where idTran='"+Log.transporte+"';";
                try{
                    Statement st=(Statement) conn.createStatement();
                    st.executeUpdate(sSQL);
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                } catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Introduzca los datos correctamente");
                }
                limpia();
                mostrar(Log.transporte);
                conn.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el dato, verifique porfavor.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCantidadpara;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtHoraF;
    private javax.swing.JTextField txtHoraI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtParadero;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
    private void limpia(){
        /*txtNombre.setText("");
        cbxTipo.setSelectedItem("Moto");
        txtPais.setText("");
        txtRegion.setText("");
        txtCiudad.setText("");
        txtDistrito.setText("");
        txtRuta.setText("");
        txtCantidadpara.setText("");
        txtParadero.setText("");
        txtHoraI.setText("");
        txtHoraF.setText("");
        txtRuc.setText("");*/
        txtNombre.grabFocus();
        btnAgregar.setText("Guardar");
    }
    private void mostrar (int valor){
        try {
            conn=App.ConnectionBd.Enlace(conn);
            String sql1="Select * from Transporte where idTran="+valor+";";
            
            Statement st1=conn.createStatement();
            ResultSet rs1=st1.executeQuery(sql1);
            String datos[]=new String[12];
            
            while(rs1.next()) {
                datos[0]=(String)rs1.getString(2);
                datos[1]=(String)rs1.getString(3);
                datos[2]=(String)rs1.getString(4);
                datos[3]=(String)rs1.getString(5);
                datos[4]=(String)rs1.getString(6);
                datos[5]=(String)rs1.getString(7);
                datos[6]=(String)rs1.getString(8);
                datos[7]=(String)rs1.getString(9);
                datos[8]=(String)rs1.getString(10);
                datos[9]=(String)rs1.getString(11);
                datos[10]=(String)rs1.getString(12);
                datos[11]=(String)rs1.getString(13);
                //añadimos a los txt
                txtNombre.setText(datos[0]);
                cbxTipo.setSelectedItem(datos[1]);
                txtPais.setText(datos[2]);
                txtRegion.setText(datos[3]);
                txtCiudad.setText(datos[4]);
                txtDistrito.setText(datos[5]);
                txtRuta.setText(datos[6]);
                txtCantidadpara.setText(datos[7]);
                txtParadero.setText(datos[8]);
                txtHoraI.setText(datos[9]);
                txtHoraF.setText(datos[10]);
                txtRuc.setText(datos[11]);
            }
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar datos, verifique porfavor");
        }
    }
}