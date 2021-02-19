/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franklin
 */
public class ConnectionBd {
    static Connection conn=null;
    static Statement st=null;
    static ResultSet rs=null;
    /*static String serverName="127.0.0.1";
    static String portNumber="3306";
    static String databaseName="sistranspublic";
    static String userName="root";
    static String password="123456";
    static String url="jdbc:mysql://"+serverName+":"+portNumber+"/"+databaseName+"?user="+userName+"&password="+password+"&useSSL=false";
    */
    /*static String url="jdbc:mysql://127.0.0.1/sistranspublic";
    static String usuario="root";
    static String contraseña="123456";
    */
    public static Connection Enlace(Connection conn) throws SQLException{
    
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver"); //driver otra forma
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //sqlDriver
            //conn=DriverManager.getConnection(url, usuario, contraseña);
            //conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sistranspublic?user=root&password=123456&useSSL=false");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/sistranspublic?"
                    +"useLegacyDatetimeCode=false&"
                    +"serverTimezone=America/Lima&"
                    +"useSSL=false","root","123456");
        } catch (ClassNotFoundException ex) {
            System.out.print("No se pudo conectar al servidor");
        }
        return conn;
    }
    
    public static Statement sta (Statement st) throws SQLException{
        conn=Enlace(conn);
        st=conn.createStatement();
        return st;
    }
}


