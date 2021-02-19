/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Empleado;

import Frames.Log;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class RegistrarPago extends javax.swing.JInternalFrame {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    /**
     * Creates new form ConsultarPago
     */
    public RegistrarPago() {
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
        lblTipoPago = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        txtPago = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar pagos");

        lblTitulo.setText("Registrar Pago");

        lblTipoPago.setText("Tipo de pago:");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conductor", "Ayudante", "Propietario" }));

        lblDni.setText("Ingrese DNI:");

        btnCalcular.setText("Calcular Pago:");

        lblFecha.setText("Fecha:");

        lblHora.setText("Hora (00:00 a 23:59):");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/registrar.png"))); // NOI18N
        btnAgregar.setText("Registrar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        txtaDescripcion.setColumns(20);
        txtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtaDescripcion);

        jLabel5.setText("Descripción:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoPago)
                            .addComponent(lblDni)
                            .addComponent(btnCalcular)
                            .addComponent(lblFecha)
                            .addComponent(lblHora)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora)
                            .addComponent(txtPago)
                            .addComponent(txtDni)
                            .addComponent(txtDate))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoPago)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
        try {
            conn=App.ConnectionBd.Enlace(conn);
            st=App.ConnectionBd.sta(st);
            
            String nombre="",pago,hora,fecha,descp,tipo,sSQL="";
            int dnicond=0,dniempl;
            
            tipo=(String)cbxTipo.getSelectedItem();
            if (cbxTipo.getSelectedItem()=="Conductor"){
                nombre="Pago conductor";
            }
            if (cbxTipo.getSelectedItem()=="Ayudante"){
                nombre="Pago ayudante";
            }
            if (cbxTipo.getSelectedItem()=="Propietario"){
                nombre="Pago propietario";
            }
            pago=txtPago.getText();
            hora=txtHora.getText();
            fecha=txtDate.getText();
            descp=txtaDescripcion.getText();
            dnicond=Integer.parseInt(txtDni.getText());
            dniempl=Log.dni;
            
            if (dnicond==0){
                JOptionPane.showMessageDialog(null, "Campos sin llenar");
                txtDni.grabFocus();
            } else {
                if (cbxTipo.getSelectedItem()=="Conductor"){
                    sSQL="insert into OperacionConductor (nombOper,pagoOper,horaOper,fechOper,descpOper,Empleado_dniEmpl,"
                            + "Conductor_dniCond)values('"+nombre+"','"+pago+"','"+hora+"','"+fecha+"','"+descp+"','"+dniempl+"','"+dnicond+"');";
                }
                if (cbxTipo.getSelectedItem()=="Ayudante"){
                    sSQL="insert into OperacionAyudante (nombOper,pagoOper,horaOper,fechOper,descpOper,Empleado_dniEmpl,"
                            + "Ayudante_dniAyudante)values('"+nombre+"','"+pago+"','"+hora+"','"+fecha+"','"+descp+"','"+dniempl+"','"+dnicond+"');";
                }
                if (cbxTipo.getSelectedItem()=="Propietario"){
                    sSQL="insert into OperacionPropietario (nombOper,pagoOper,horaOper,fechOper,descpOper,Empleado_dniEmpl,"
                            + "Propietario_dniProp)values('"+nombre+"','"+pago+"','"+hora+"','"+fecha+"','"+descp+"','"+dniempl+"','"+dnicond+"');";
                }
                
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
    }//GEN-LAST:event_btnAgregarMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblTipoPago;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables
    private void limpia(){
        txtPago.setText("");
        txtHora.setText("");
        txtaDescripcion.setText("");
        txtDni.setText("");
        txtDni.grabFocus();
        btnAgregar.setText("Guardar");
    }
}
