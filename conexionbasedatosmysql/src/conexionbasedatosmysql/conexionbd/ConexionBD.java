/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbasedatosmysql.conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CUTT 5
 */
public class ConexionBD {
     private static Connection conn = null;
    private static String URL = "jdbc:mysql://localhost:3306/escuela2?useSSL=false&serverTimezone=UTC";
    private static String USUARIO = "root";
    private static String PASSWORD = "";

    public static Connection obtieneConexion() {

        try {
            conn = DriverManager.getConnection(
                    URL,
                    USUARIO,
                    PASSWORD
            );
        } catch (SQLException ex) {
            System.getLogger(ConexionBD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return conn;
    }
    
        public static void main(String[] args) {
        ConexionBD ejecutaBD = new ConexionBD();
        ejecutaBD.obtieneConexion();
    }
}
