/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Empleado;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Franklin
 */
public class IngresarVehiculos extends javax.swing.JInternalFrame {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    DefaultTableModel datostabla=new DefaultTableModel(); 

    /**
     * Creates new form IngresarVehiculos
     */
    public IngresarVehiculos() {
        initComponents();
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setIconifiable(true);
        String Titulos[]={"PLACA","TIPO","SOAT","SERIE","AÑO","TRANSPORTE","PROPIETARIO"};
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

        txtSerie = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtPropietario = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        lblVehiculo = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblSoat = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        txtSoat = new javax.swing.JTextField();
        lblAño = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblTransporte = new javax.swing.JLabel();
        txtTransporte = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar vehiculos");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/agregar.png"))); // NOI18N
        btnAgregar.setText("Ingresar vehiculo");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        lblPlaca.setText("Placa de vehiculo:");

        lblVehiculo.setText("Tipo de vehiculo:");

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        lblSoat.setText("N° de SOAT:");

        lblSerie.setText("Serie vehiculo:");

        lblAño.setText("Año del vehiculo:");

        lblDni.setText("DNI propietario:");

        lblTitulo.setText("Ingrese vehiculo:");

        lblTransporte.setText("ID Trasnporte:");

        jLabel1.setText("Buscar :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblAño)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblSerie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblSoat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSoat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblVehiculo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblPlaca)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAgregar)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblDni)
                                            .addGap(27, 27, 27)
                                            .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTransporte)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTransporte)
                    .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehiculo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni)
                    .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoat)
                    .addComponent(txtSoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSerie)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAño)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void tbdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdatosMouseClicked
        // TODO add your handling code here:
        int fila = -1;
        fila=tbdatos.rowAtPoint(evt.getPoint());
        if(fila > -1){
            txtPlaca.setText(String.valueOf(tbdatos.getValueAt(fila, 0)));
            txtTipo.setText(String.valueOf(tbdatos.getValueAt(fila, 1)));
            txtSoat.setText(String.valueOf(tbdatos.getValueAt(fila, 2)));
            txtSerie.setText(String.valueOf(tbdatos.getValueAt(fila, 3)));
            txtAño.setText(String.valueOf(tbdatos.getValueAt(fila, 4)));
            txtTransporte.setText(String.valueOf(tbdatos.getValueAt(fila, 5)));
            txtPropietario.setText(String.valueOf(tbdatos.getValueAt(fila, 6)));
            btnAgregar.setText("Actualizar");
        }
    }//GEN-LAST:event_tbdatosMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
        try {
            conn=App.ConnectionBd.Enlace(conn);
            st=App.ConnectionBd.sta(st);
            String placa,tipo,soat,serie,año,sSQL;
            int transporte,propietario;
            placa=txtPlaca.getText();
            tipo=txtTipo.getText();
            soat=txtSoat.getText();
            serie=txtSerie.getText();
            año=txtAño.getText();
            transporte=Integer.parseInt(txtTransporte.getText());
            propietario=Integer.parseInt(txtPropietario.getText());
           
            if (btnAgregar.getText()=="Actualizar"){
                String sql1="update Vehiculo set placVehi='"+placa+"',tipoVehi='"+tipo+"',soatVehi='"+soat+"',"
                        +"serieVehi='"+serie+"',añofabricVehi='"+año+"',Transporte_idTran='"+transporte+
                        "',Propietario_dniProp='"+propietario+"' where placVehi='"+placa+"';";
                Statement st1=(Statement) conn.createStatement();
                st1.executeUpdate(sql1);
                buscar("");
                limpia();
                conn.close();
            } else {
                if (placa.equals("")){
                    JOptionPane.showMessageDialog(null, "Campos sin llenar");
                    txtPlaca.grabFocus();
                } else {
                    sSQL="insert Vehiculo values ('"+placa+"','"+tipo+"','"+soat+"','"+serie+"','"+año+"','"+transporte+"','"+propietario+"');";
                    try{
                        Statement st=(Statement) conn.createStatement();
                        st.executeUpdate(sSQL);
                        JOptionPane.showMessageDialog(null, "Registro exitoso");
                    } catch (SQLException ex){
                        JOptionPane.showMessageDialog(null, "Introduzca los datos correctamente");
                    }
                    
                    limpia();
                    buscar("");
                    conn.close();
                }
            
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar el dato, verifique porfavor.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Introduzca los datos correctamente");
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        buscar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyPressed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblSoat;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTransporte;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JTable tbdatos;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtSoat;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTransporte;
    // End of variables declaration//GEN-END:variables
    private void limpia(){
        txtPlaca.setText("");
        txtTipo.setText("");
        txtSoat.setText("");
        txtSerie.setText("");
        txtAño.setText("");
        txtTransporte.setText("");
        txtPropietario.setText("");
        txtPlaca.grabFocus();
        btnAgregar.setText("Guardar");
    }
    private void buscar (String valor){
        try {
            int f,i;
            conn=App.ConnectionBd.Enlace(conn);
            String sql1="Select * from Vehiculo where placVehi like '%"+valor+"%' or tipoVehi like '%"+valor+"%';";
            
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
                datos[3]=(String)rs1.getString(4);
                datos[4]=(String)rs1.getString(5);
                datos[5]=(String)rs1.getString(6);
                datos[6]=(String)rs1.getString(7);
                datostabla.addRow(datos);
            }
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar datos, verifique porfavor");
        }
    }
}
