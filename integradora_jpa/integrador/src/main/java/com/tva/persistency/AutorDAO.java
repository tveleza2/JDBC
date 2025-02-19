package com.tva.persistency;

import java.util.List;

import com.tva.entities.Autor;

public class AutorDAO extends DAO {
    public void guardaAutor(Autor autor) throws Exception {
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }

    public void actualizarAutor(Autor autor){
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }

    public Autor findAutorId(int id){
        return em.find(Autor.class, id);
    }

    public List<Autor> findAutoresNombre(String nombre){
        return em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE:name",Autor.class).setParameter("nombre", nombre).getResultList();
    }


    public void eliminarAutor(int id) {
        Autor cliente = findAutorId(id);
        if (cliente != null) {
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        }
    }
}
