package com.jdbcegg.persistency;
import com.jdbcegg.entities.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends DAO{
    public void guardarCliente(Cliente cliente) throws Exception {
        try {
        if (cliente == null) {
        throw new Exception("El cliente no puede ser nulo.");
        }
        String sql = "INSERT INTO Cliente (nombre_cliente,nombre_contacto, apellido_contacto, telefono, fax, ciudad, region, país, codigo_postal, id_empleado, limite_credito) VALUES ('" +
        cliente.getNombreCliente() + "', '" +
        cliente.getNombreContacto() + "', '" +
        cliente.getApellidoContacto() + "', '" +
        cliente.getTelefono() + "', '" +
        cliente.getFax() + "', '" +
        cliente.getCiudad() + "', '" +
        cliente.getRegion() + "', '" +
        cliente.getPais() + "', '" +
        cliente.getCodigoPostal() + "', " +
        cliente.getIdEmpleado() + ", " +
        cliente.getLimiteCredito() + ");";
        CRUDDataBase(sql);
        } catch (Exception e) {
        desconectarDataBase();
        throw e;
        }
    }

    public void listarTodosLosClientes() throws Exception {
        try {
        String sql = "SELECT id_cliente,nombre_cliente,nombre_contacto, apellido_contacto FROM cliente ";
        
        consultarDataBase(sql);
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();
        while (resultSet.next()) {
        cliente = new Cliente();
        cliente.setIdCliente(resultSet.getInt("id_cliente"));
        cliente.setNombreCliente(resultSet.getString("nombre_cliente"));
        cliente.setNombreContacto(resultSet.getString("nombre_contacto"));
        cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
        clientes.add(cliente);
        }
        for (Cliente clienteUnitario : clientes) {
        System.out.println(clienteUnitario.imprimirCliente());
        }
        System.out.println("");
        } catch (Exception e) {
        desconectarDataBase();
        e.printStackTrace();
        throw e;
        }
        }
}

