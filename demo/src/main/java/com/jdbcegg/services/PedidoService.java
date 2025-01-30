package com.jdbcegg.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PedidoService {
    public static void getPedidosPorCliente(Connection con, int clienteId) {
        String query = "SELECT p.id_pedido ID, p.fecha_pedido Fecha, p.fecha_esperada Fecha_Entrega, p.estado Estado, c.nombre_contacto Cliente FROM pedido p JOIN cliente c ON p.id_cliente = c.id_cliente WHERE c.id_cliente = ?;";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,clienteId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("ID") + " " + rs.getString("Fecha")+ " " + rs.getString("Fecha_Entrega")+ " " + rs.getString("Estado")+ " " + rs.getString("Cliente"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

