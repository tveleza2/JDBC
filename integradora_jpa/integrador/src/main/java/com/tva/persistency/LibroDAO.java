package com.tva.persistency;

import java.util.List;

import com.tva.entities.Libro;

public class LibroDAO extends DAO{
    public LibroDAO(){
        System.out.print(CLEAR);
    }

    public void guardaLibro(Libro libro) {
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }

    public void actualizarLibro(Libro libro){
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
    }

    public Libro findLibro(int isbn){
        return em.find(Libro.class, isbn);
    }

    public Libro findLibro(String titulo){
        return em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE:tit",Libro.class).setParameter("tit", titulo).getResultList().get(0);
    }

    public List<Libro> findLibros(){
        return em.createQuery("SELECT l FROM Libro l WHERE l.alta = TRUE ",Libro.class).getResultList();
    }

    public List<Libro> findLibrosAutor(String autor){
        return em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE l.alta = TRUE AND a.nombre LIKE: author",Libro.class).setParameter("author", autor).getResultList();
    }

    public List<Libro> findLibrosEditorial(String editorial){
        return em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE l.alta = TRUE AND e.nombre LIKE: editorial",Libro.class).setParameter("editorial", editorial).getResultList();
    }


    public void eliminarLibro(int id) {
        Libro libro = findLibro(id);
        if (libro != null) {
            em.getTransaction().begin();
            em.remove(libro);
            em.getTransaction().commit();
        }
    }

    public void toggleAlta(int isbn){
        Libro libro = findLibro(isbn);
        libro.setAlta(!libro.isAlta());
        actualizarLibro(libro);
    }

}
