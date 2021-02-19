/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Administrador;

import App.ConnectionBd;
import Frames.Log;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Franklin
 */
public class ResumenMensual extends javax.swing.JInternalFrame {

    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;

    /**
     * Creates new form ResumenMensual
     */
    public ResumenMensual() {
        initComponents();
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setIconifiable(true);
        labelPlaca.setVisible(false);
        txtPlaca.setVisible(false);
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
        cbxReport = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxArea = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        btnGenerar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtf1 = new javax.swing.JTextField();
        txtf2 = new javax.swing.JTextField();
        labelPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resumen mensual");

        jLabel1.setText("Generar reporte:");

        jLabel2.setText("Nombre del reporte:");

        jLabel3.setText("Tipo de reporte:");

        cbxReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago total", "Ingreso total", "Ganancia total", "Control ruta" }));
        cbxReport.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxReportItemStateChanged(evt);
            }
        });

        jLabel4.setText("Area:");

        cbxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Cliente" }));

        jLabel5.setText("Fecha actual:");

        jLabel6.setText("Descripción:");

        txtaDescripcion.setColumns(20);
        txtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtaDescripcion);

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/generar.png"))); // NOI18N
        btnGenerar.setText("Generar reporte");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel7.setText("Periodo del reporte:");

        jLabel8.setText("hasta");

        labelPlaca.setText("Placa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnGenerar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelPlaca)
                                .addGap(9, 9, 9)
                                .addComponent(txtPlaca))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtf2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 21, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        String nombre, tipo, area, fecha, descp, placa;
        int dni;
        
        nombre = txtNombre.getText();
        tipo = String.valueOf(cbxReport.getSelectedItem());
        area = String.valueOf(cbxArea.getSelectedItem());
        fecha = String.valueOf(txtFecha.getDate());
        descp = txtaDescripcion.getText();
        placa= txtPlaca.getText();
        dni = Log.dni;
        
        try {
            conn = ConnectionBd.Enlace(conn);
            st = ConnectionBd.sta(st);

            String sSQL;

            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Campos sin llenar");
                txtNombre.grabFocus();
            } else {
                sSQL = "insert into Informe (nombInfo,tipoInfo,areaInfo,fechaInfo,descpInfo,"
                        + "Administrador_dniAdmi) values ('" + nombre + "','" + tipo + "','" + area + "','" + fecha
                        + "','" + descp + "','" + dni + "');";
                try {
                    Statement st = (Statement) conn.createStatement();
                    st.executeUpdate(sSQL);
                    JOptionPane.showMessageDialog(null, "Reporte registrado");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Introduzca los datos correctamente");
                }
                limpia();
                conn.close();
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Introduzca los datos correctamente");
        }

        //CREAMOS UN REPORTE Y LA URL
        try {
            conn = ConnectionBd.Enlace(conn);
            String path = "";

            //CREAMOS UN REPORTE Y LA URL
            JasperReport reporte = null;
            if (cbxReport.getSelectedItem().equals("Ingreso total")) {
                path = "src\\Reportes\\Ingresos.jasper";
            }
            if (cbxReport.getSelectedItem().equals("Pago total")) {
                path = "src\\Reportes\\Pagos.jasper";
            }
            if (cbxReport.getSelectedItem().equals("Ganancia total")) {
                path = "src\\Reportes\\Ganancias.jasper";
            }
            if (cbxReport.getSelectedItem().equals("Control ruta")) {
                path = "src\\Reportes\\Controles.jasper";
            }

            //ENVIAMOS PARAMETROS
            Map parametro = new HashMap();
            String fecha1 = txtf1.getText();
            String fecha2 = txtf2.getText();
            parametro.put("f1", fecha1);
            parametro.put("f2", fecha2);
            parametro.put("nombre", nombre);
            parametro.put("tipo", tipo);
            parametro.put("placa", placa);

            //CARGAMOS,LLENAMOS Y MOSTRAMOS EL REPORTE EN UNA VENTANA
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            conn.close();
            
        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, "Introduzca los datos correctamente");
        } 

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void cbxReportItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxReportItemStateChanged
        // TODO add your handling code here:
        if (cbxReport.getSelectedItem().equals("Control ruta")){
            labelPlaca.setVisible(true);
            txtPlaca.setVisible(true);
        }
        if (cbxReport.getSelectedItem().equals("Ingreso total")) {
            labelPlaca.setVisible(false);
            txtPlaca.setVisible(false);
        }
        if (cbxReport.getSelectedItem().equals("Pago total")) {
            labelPlaca.setVisible(false);
            txtPlaca.setVisible(false);
        }
        if (cbxReport.getSelectedItem().equals("Ganancia total")) {
            labelPlaca.setVisible(false);
            txtPlaca.setVisible(false);
        }
    }//GEN-LAST:event_cbxReportItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPlaca;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextArea txtaDescripcion;
    private javax.swing.JTextField txtf1;
    private javax.swing.JTextField txtf2;
    // End of variables declaration//GEN-END:variables
    private void limpia() {
        txtNombre.setText("");
        cbxArea.setSelectedItem("Empleado");
        txtaDescripcion.setText("");
        txtNombre.grabFocus();
    }
}
