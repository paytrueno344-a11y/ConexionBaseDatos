/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbasedatosmysql.usuariossql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexionbasedatosmysql.conexionbd.ConexionBD;


/**
 *
 * @author CUTT 5
 */

public class UsuariosSQL {
    
    public int insertaUsuario(String user, String pass) {
        String insertar = "INSERT INTO usuarios( usuario, password, activo, idperfil) VALUES (?,?,?,?)";
        Connection conn = ConexionBD.obtieneConexion();
        int resultado =0;
        try {
            PreparedStatement ps = conn.prepareStatement(insertar);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setInt(3, 1);
            ps.setInt(4, 1);

             resultado = ps.executeUpdate();
        } catch (SQLException ex) {
            System.getLogger(UsuariosSQL.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

        return resultado;
    }
//    public static void main(String[] args) {
//        
//        UsuariosSQL usuarios = new UsuariosSQL();
//        int resultado = usuarios.insertaUsuario("Miguelito", "191237");
//        System.out.println(resultado);
//        
//    }
}

      
  
