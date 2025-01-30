package com.jdbcegg.services;
import java.sql.*;

public class DbConnector {
    private static String url="jdbc:mysql://localhost:3306/vivero";
    private static String userName = "root";
    private static String password = "Dbroot2024.";

    public static Connection getConnection(){
        try {
            Connection con =  DriverManager.getConnection(url,userName,password);
            System.out.println("Connection established successfully");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
                System.out.println("Connection closed successfully");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión:" + e.getMessage());
            }
        }
    }
}
