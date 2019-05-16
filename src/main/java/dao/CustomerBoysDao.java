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
import models.CustomerBoys;

/**
 * Metodos de agregar y mostrar datos del familiar del cliente.
 *
 * @author Karen Lopez
 * @version 1.0
 * @since Control_customer 1.0
 */
public class CustomerBoysDao {

    // agregar un familiar del cliente
    /**
     * Metodo para crear un nuevo niño
     *
     * @param customer
     * @return
     */
    public static boolean add(CustomerBoys customer) {

        Connection con;
        PreparedStatement ps;
        String sql = "insert into customer_boys values(null, ?, ?, ?, ?, ?, ?)";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, customer.getFirstNamec());
            ps.setString(2, customer.getLastNamec());
            ps.setDate(3, java.sql.Date.valueOf(customer.getDateString()));
            ps.setDate(4, java.sql.Date.valueOf(customer.getDateAString()));
            ps.setInt(5, customer.getIdPersonInCharge());
            ps.setInt(6, customer.getIdMedical());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println("error al insertar" + e);

            return false;
        }

    }

    // lista de clientes, familiare e historial medico
    /**
     * Metodo para mostrar datos de diferentes tablas.
     *
     * @return
     */
    public static List<CustomerBoys> getAll() {
        List<CustomerBoys> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select c.id, c.first_name, c.last_name, c.kinship, tt.id, tt.disease, tt.description, t.id, t.first_namec, t.last_namec "
                + "from person_incharge c, customer_boys t, medical_history tt "
                + "where t.id_personInCharge=c.id "
                + "and t.id_medical = tt.id";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new CustomerBoys(
                        rs.getInt("t.id"),
                        rs.getString("t.first_namec"),
                        rs.getString("t.last_namec"),
                        rs.getInt("c.id"),
                        rs.getString("c.first_name"),
                        rs.getString("c.last_name"),
                        rs.getString("c.kinship"),
                        rs.getInt("tt.id"),
                        rs.getString("tt.disease"),
                        rs.getString("tt.description")
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

}
