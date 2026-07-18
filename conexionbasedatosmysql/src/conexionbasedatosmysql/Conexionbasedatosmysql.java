/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexionbasedatosmysql;

import conexionbasedatosmysql.usuariossql.UsuariosSQL;
import javax.swing.JOptionPane;

/**
 *
 * @author CUTT 5
 */
public class Conexionbasedatosmysql {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        UsuariosSQL usuarios = new UsuariosSQL();
        int resultado = usuarios.insertaUsuario("Miguelito", "191237");
//        System.out.println(resultado);
        usuarios.consultaUsuarios();

    }
    
}
