package com.jdbcegg;
import java.sql.*;

import com.jdbcegg.services.DbConnector;

public class Main {
    public static void main(String[] args) {
        Connection con = DbConnector.getConnection();
        String query = "SELECT id_cliente, nombre_cliente FROM cliente";
        try {
            java.sql.PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("id_cliente") + " " + rs.getString("nombre_cliente"));
            }
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
        
        
    }
}