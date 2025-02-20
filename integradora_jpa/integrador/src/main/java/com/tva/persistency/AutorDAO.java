package com.tva.persistency;

import java.util.List;

import com.tva.entities.Autor;

public class AutorDAO extends DAO {
    public AutorDAO(){
        System.out.print(CLEAR);
    }

    public void guardaAutor(Autor autor) {
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }

    public void actualizarAutor(Autor autor){
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }

    public Autor findAutor(int id){
        Autor autor = em.find(Autor.class, id);
        return autor;
    }

    public List<Autor> findAutores(String nombre){
        return em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE:name",Autor.class).setParameter("name", nombre).getResultList();
    }

    public List<Autor> findAutores(){
        return em.createQuery("SELECT a FROM Autor a WHERE a.alta = TRUE ",Autor.class).getResultList();
    }

    public void eliminarAutor(int id) {
        Autor autor = findAutor(id);
        if (autor != null) {
            em.getTransaction().begin();
            em.remove(autor);
            em.getTransaction().commit();
        }
    }

}
