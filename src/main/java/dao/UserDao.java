/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.User;

/**
 * Metodos de agregar y obtener datos del usuario.
 *
 * @author Karen Lopez
 * @version 1.0
 * @since Control_customer 1.0
 */
public class UserDao {

    //agregar usuario
    /**
     * Metodo para agregar un nuevo usuario
     *
     * @param user
     * @return
     */
    public static boolean add(User user) {

        Connection con;
        PreparedStatement ps;
        String sql = "insert into user values (null, ?, ?, ?, ?)";

        try {
            con = conexion.Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getFirstName());
            ps.setString(3, user.getLastName());
            ps.setString(4, user.getPassword());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println("error al insertar" + e);
            return false;
        }
    }

    //obtener dato del usuario
    /**
     * Metodo para obtener el nombre de usuario
     *
     * @param userName
     * @return
     */
    public static User getUserByUserName(String userName) {

        User user;
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from user where user_name = ?";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            rs.first();
            user = new User(
                    rs.getString("user_name"),
                    rs.getString("password")
            );

            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("error en consulta:" + e.getMessage());
            user = null;

        }
        return user;
    }

}
