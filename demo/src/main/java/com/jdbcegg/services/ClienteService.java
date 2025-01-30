package com.jdbcegg.services;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteService {
    public static void buscaClientes(Connection con){
        String query = "SELECT id_cliente ID, nombre_contacto Nombre, apellido_contacto Apellido, telefono FROM cliente";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("ID") + " " + rs.getString("Nombre")+ " " + rs.getString("Apellido")+ " " + rs.getString("telefono"));
            }
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }

    }

    public static void buscaClientesPorCodigo(Connection con, String codigo){
        String query = "SELECT id_cliente ID, nombre_contacto Nombre, apellido_contacto Apellido, telefono FROM cliente WHERE id_cliente = ?";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,codigo);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("ID") + " " + rs.getString("Nombre")+ " " + rs.getString("Apellido")+ " " + rs.getString("telefono"));
            }
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }

    }

    public static void buscaClientesPorEmpleado(Connection con, int empleadoId){
        String query = "SELECT e.nombre Empleados, c.id_cliente ID, c.nombre_contacto Nombre, c.apellido_contacto Apellido, c.telefono FROM cliente c JOIN empleado e on e.id_empleado = c.id_empleado WHERE e.id_empleado = ?;";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,empleadoId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("Empleados")+ " " +rs.getString("ID") + " " + rs.getString("Nombre")+ " " + rs.getString("Apellido")+ " " + rs.getString("telefono"));
            }
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }

    }

}
