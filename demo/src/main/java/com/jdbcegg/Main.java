package com.jdbcegg;
// import com.jdbcegg.entities.*;
import com.jdbcegg.persistency.*;


public class Main {
    public static String clear = "\033[H\033[2J";
    public static void main(String[] args) {
        System.out.print(clear);
        ClienteDAO clienteDAO = new ClienteDAO();
        try {
            // clienteDAO.guardarCliente(cliente1);
            // clienteDAO.guardarCliente(cliente2);
            clienteDAO.listarTodosLosClientes();
        } catch (Exception e) {
        }
        
    }
}