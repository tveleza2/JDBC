package com.tva.persistency;

import com.tva.entities.Cliente;

public class ClienteDAO extends DAO{
    public void guardaCliente(Cliente cliente) throws Exception {
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
    }

    public void actualizarCliente(Cliente cliente){
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
    }

    public Cliente findCliente(int id){
        return em.find(Cliente.class, id);
    }

    public void eliminarCliente(int id) {
        Cliente cliente = findCliente(id);
        if (cliente != null) {
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        }
    }
}
