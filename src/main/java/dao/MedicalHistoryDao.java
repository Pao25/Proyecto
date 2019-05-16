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
import models.MedicalHistory;

/**
 **Metodos de agregar y mostrar obtener y actualizar datos del historial
 * medico.
 *
 * @author Karen Lopez
 * @version 1.0
 * @since Control_customer 1.0
 */
public class MedicalHistoryDao {

    //Agregar datos del historial medico
    /**
     * Metodo para agregar nuevos datos del historial medico
     *
     * @param medical
     * @return
     */
    public static boolean add(MedicalHistory medical) {

        Connection con;
        PreparedStatement ps;
        String sql = "insert into medical_history values(null, ?, ?)";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, medical.getDisease());
            ps.setString(2, medical.getDescription());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println("error al insertar" + e);

            return false;
        }

    }

    //mostrar datos del historial medico
    /**
     * Metod para mostrar datos del historial medico
     *
     * @return
     */
    public static List<MedicalHistory> medicalList() {
        List<MedicalHistory> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from medical_history";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new MedicalHistory(
                        rs.getInt("id"),
                        rs.getString("disease"),
                        rs.getString("description")
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

    //obtener el id del historial medico
    /**
     * Metodo para obtener el id del historial medico
     *
     * @param id
     * @return
     */
    public static MedicalHistory getById(int id) {
        MedicalHistory med;
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select *from medical_history where id = ?";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            med = new MedicalHistory(
                    rs.getInt("id"),
                    rs.getString("disease"),
                    rs.getString("description")
            );

            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("error consulta" + e.getMessage());
            med = null;

        }
        return med;

    }

    //actualizar datos del historial medico
    /**
     * Metodo para actualizar datos del historial medico
     *
     * @param medical
     * @return
     */
    public static boolean update(MedicalHistory medical) {
        Connection con;
        PreparedStatement ps;
        String sql = "update medical_history set disease=?, description=? where id = ?";
        int rowAffected;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(3, medical.getId());
            ps.setString(2, medical.getDescription());
            ps.setString(1, medical.getDisease());
            ps.executeUpdate();
            rowAffected = ps.executeUpdate();
            ps.close();
            con.close();
            return rowAffected == 1;

        } catch (SQLException e) {
            System.out.println("error consulta:" + e.getMessage());
            return false;
        }

    }

}
