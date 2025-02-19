package com.tva.persistency;

import com.tva.entities.Oficina;

public class OficinaDAO extends DAO{

    public void guardaOficina(Oficina oficina) throws Exception {
        em.getTransaction().begin();
        em.persist(oficina);
        em.getTransaction().commit();
    }

    public void actualizarOficina(Oficina ofi){
        em.getTransaction().begin();
        em.merge(ofi);
        em.getTransaction().commit();
    }

    public Oficina findOficina(int id){
        return em.find(Oficina.class, id);
    }

    public void eliminarOficina(int id) {
        Oficina oficina = em.find(Oficina.class, id);
        if (oficina != null) {
            em.getTransaction().begin();
            em.remove(oficina);
            em.getTransaction().commit();
        }
    }

}