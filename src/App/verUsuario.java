/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import static App.ConnectionBd.conn;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class verUsuario {
    public verUsuario(){
        try{
            conn=ConnectionBd.Enlace(conn);
            String sql="select idUsua, usuaUsua from Usuario;";
            Statement s= conn.createStatement();
            ResultSet rs=s.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar datos, verifique porfavor");
        }
    }
    public static void main (String[] args){
        new verUsuario();
    }  
}

