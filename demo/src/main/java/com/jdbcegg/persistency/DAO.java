package com.jdbcegg.persistency;
import java.sql.*;

public abstract class DAO {
    protected Connection conexion = null;
    protected ResultSet resultSet = null;
    protected Statement statement = null;
    private final String HOST = "127.0.0.1";
    private final String PORT = "3306";
    private final String USER = "root";
    private final String PASSWORD = "Dbroot2024.";
    private final String DATABASE = "vivero";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void connectarDataBase() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(DRIVER);
            String url = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE+"?useSSL=false";
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    protected void desconectarDataBase() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing ResultSet: " + e.getMessage());
        }
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing Statement: " + e.getMessage());
        }
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing Connection: " + e.getMessage());
        }
    }
    
    protected void CRUDDataBase(String sql) throws Exception {
        try {
            if(conexion == null){
                connectarDataBase();
            }
            statement = conexion.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Dato OK en BBDD");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    protected void consultarDataBase(String sql) throws Exception {
        try {
        connectarDataBase();
        statement = conexion.createStatement();
        resultSet = statement.executeQuery(sql);
        } catch (SQLException | ClassNotFoundException ex) {
        System.out.println(ex.getMessage());
        throw ex;
        }
    }    
}
