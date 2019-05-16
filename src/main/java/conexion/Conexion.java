/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 **
 * @author Karen Lopez
 * @version 1.0
 * @since Control_customer 1.0
 */
public class Conexion {

    private static Connection con;
    private static String stringConexion;
    private static boolean connected = false;

    /**
     * Metodo para conectar con la base de datos
     *
     * @return
     */
    public static Connection getConexion() {
        stringConexion = "jdbc:mysql://localhost:3306/control_boy?useSSL=false";

        try {
            Class.forName("com.mysql.jdbc.Driver"); //carga el drive
            con = DriverManager.getConnection(stringConexion, "root", "1234");
            connected = true;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la coneccion: " + e);
            connected = false;
            con = null;

        }
        return con;

    }

    /**
     * Metodo para cerrar la conexion
     */
    public static void close() {
        if (connected) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("No se puede cerrar");

            }
        }
    }

}
