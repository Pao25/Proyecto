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
import java.util.ArrayList;
import java.util.List;
import models.PersonInCharge;

/**
 * Metodos de agregar, mostrar, obtener y actualizar datos del cliente.
 *
 * @author Karen Lopez
 * @version 1.0
 * @since Control_customer 1.0
 */
public class PersonInChargeDao {

    //agregar un cliente
    /**
     * Metodo para agregar un nuevo cliente
     *
     * @param person
     * @return
     */
    public static boolean add(PersonInCharge person) {

        Connection con;
        PreparedStatement ps;
        String sql = "insert into person_incharge values(null, ?, ?, ?, ?)";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            ps.setString(3, person.getKinship());
            ps.setString(4, person.getNumberPhone());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println("error al insertar" + e);

            return false;
        }

    }

    //mostrar datos del cliente
    /**
     * Metodo para mostrar datos del cliente
     *
     * @return
     */
    public static List<PersonInCharge> personList() {
        List<PersonInCharge> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from person_incharge";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new PersonInCharge(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("kinship"),
                        rs.getString("number_phone")
                ));

            }

            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("error al consultar" + e);
            list.clear();
        }
        return list;
    }

    //obtener datos del cliente
    /**
     * Metodo para obtener el id del cliente
     *
     * @param id
     * @return
     */
    public static PersonInCharge getById(int id) {
        PersonInCharge per;
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select *from person_incharge where id = ?";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            per = new PersonInCharge(
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("kinship"),
                    rs.getString("number_phone")
            );

            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("error consulta" + e.getMessage());
            per = null;

        }
        return per;

    }

    //actualizar datos del cliente
    /**
     * Metodo para actualizar el numero de telefono del cliente
     *
     * @param person
     * @return
     */
    public static boolean update(PersonInCharge person) {
        Connection con;
        PreparedStatement ps;
        String sql = "update person_incharge set first_name=?, last_name=?, number_phone=? where id = ?";
        int rowAffected;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(4, person.getId());
            ps.setString(3, person.getNumberPhone());
            ps.setString(2, person.getLastName());
            ps.setString(1, person.getFirstName());
            ps.executeUpdate();
            rowAffected = ps.executeUpdate();
            ps.close();
            con.close();
            return rowAffected == 1;

        } catch (SQLException e) {
            System.out.println("error consulta:1" + e.getMessage());
            return false;
        }

    }

}
