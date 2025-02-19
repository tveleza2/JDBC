package com.tva.persistency;

import java.util.List;

import com.tva.entities.Editorial;

public class EditorialDAO extends DAO{
    public EditorialDAO(){
        System.out.print(CLEAR);
    }

    public void guardaEditorial(Editorial editorial) {
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
    }

    public void actualizarEditorial(Editorial editorial){
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
    }

    public Editorial findEditorial(int id){
        return em.find(Editorial.class, id);
    }

    public Editorial findEditorial(String nombre){
        return em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE:name",Editorial.class).setParameter("name", nombre).getResultList().get(0);
    }

    public List<Editorial> findEditoriales(){
        return em.createQuery("SELECT e FROM Editorial e WHERE e.alta = TRUE ",Editorial.class).getResultList();
    }

    public void eliminarEditorial(int id) {
        Editorial editorial = findEditorial(id);
        if (editorial != null) {
            em.getTransaction().begin();
            em.remove(editorial);
            em.getTransaction().commit();
        }
    }


    public void toggleAlta(int id){
        Editorial editorial = findEditorial(id);
        editorial.setAlta(!editorial.isAlta());
        actualizarEditorial(editorial);
    }
}
