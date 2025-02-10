package com.eggtomy.persistency;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


import com.eggtomy.entities.Cliente;


public class ClienteDAO extends DAO{
    public void addCliente(Cliente newCliente) {
        String query = "INSERT INTO clientes (nombre,calle,numero,codigo_postal,ciudad,pais,email) VALUES (?,?,?,?,?,?,?);";
        try {
            noOutputQuery(query, newCliente.getNombre(),newCliente.getCalle(),newCliente.getNumero(),newCliente.getCodigoPostal(),newCliente.getCiudad(),newCliente.getPais(),newCliente.getEmail());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void readCliente() {
        String query = "SELECT * FROM clientes;";
        List<Cliente> clientes = new ArrayList<>();
        try {
            outputQuery(query, (Object[])null);
            if (!resultSet.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            while(resultSet.next()){
                Cliente newCliente = new Cliente(resultSet.getInt("id_cliente"),resultSet.getString("nombre"),resultSet.getString("calle"),resultSet.getInt("numero"),resultSet.getString("codigo_postal"),resultSet.getString("ciudad"),resultSet.getString("pais"),resultSet.getString("email"));
                clientes.add(newCliente);

            }
            Iterator <Cliente> it = clientes.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateCliente(int id,Cliente newCliente) {
        String query = "UPDATE clientes SET nombre=?, calle=?,numero=?,codigo_postal=?,ciudad=?,pais=?,email=? WHERE id_casa = ?;";
        try {
            noOutputQuery(query, newCliente.getNombre(),newCliente.getCalle(),newCliente.getNumero(),newCliente.getCodigoPostal(),newCliente.getCiudad(),newCliente.getPais(),newCliente.getEmail(),id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteCliente(int id) {
        String query = "DELETE FROM clientes WHERE id_cliente = ?;";
        try {
            noOutputQuery(query, id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
