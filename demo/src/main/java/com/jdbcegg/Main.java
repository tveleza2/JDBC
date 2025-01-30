package com.jdbcegg;
import java.sql.*;

import com.jdbcegg.services.*;
import com.jdbcegg.services.PedidoService;

public class Main {
    public static String clear = "\033[H\033[2J";
    public static void main(String[] args) {
        System.out.print(clear);
        Connection con = DbConnector.getConnection();
        // ClienteService.buscaClientesPorEmpleado(con,5);
        // ProductoService.getProductosParaReponer(con, 30);
        // ProductoService.getProductosGama(con, "Herramientas");
        PedidoService.getPedidosPorCliente(con, 1);
        // DbConnector.closeConnection(con);
        
    }
}