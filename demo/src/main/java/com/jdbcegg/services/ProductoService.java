package com.jdbcegg.services;
import java.sql.*;

public class ProductoService {
    public static void getProductosParaReponer(Connection con, int puntoReposicion){
        String query = "SELECT id_producto ID, nombre Producto, cantidad_en_stock Cantidad FROM producto WHERE cantidad_en_stock < ?";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,puntoReposicion);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("ID") + " " + rs.getString("Producto")+ " " + rs.getString("Cantidad"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void getProductosGama(Connection con, String gama){
        String query = "SELECT p.codigo_producto Codigo, p.nombre Producto, g.id_gama IDG, g.gama Gama FROM producto p JOIN gama_producto g on p.id_gama = g.id_gama WHERE g.gama = ?;";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,gama);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("Codigo") + " " + rs.getString("Producto")+ " " + rs.getString("IDG")+ " " + rs.getString("Gama"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
