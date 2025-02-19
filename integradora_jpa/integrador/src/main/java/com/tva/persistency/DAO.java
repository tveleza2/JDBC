package com.tva.persistency;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public abstract class DAO {
    public static final String CLEAR = "\033[H\033[2J";
    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria");
    protected final EntityManager em = emf.createEntityManager();

}


