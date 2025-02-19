package com.tva;

import com.tva.persistency.*;
import com.tva.entities.*;
import java.util.*;


// import jakarta.persistence.EntityManager;
// import jakarta.persistence.EntityManagerFactory;
// import jakarta.persistence.Persistence;

public class Main {
    public static final String CLEAR = "\033[H\033[2J";

    public static void main(String[] args) {
        System.out.print(CLEAR);
        LibroDAO lDao = new LibroDAO();
        // EditorialDAO eDao = new EditorialDAO();
        // AutorDAO aDao = new AutorDAO();


        // Libro book = new Libro();
        // Editorial edit = eDao.findEditorial(2);
        // edit.setAlta(false);
        
        // eDao.guardaEditorial(edit);
        // eDao.eliminarEditorial(1);



        Iterator<Libro> it = lDao.findLibrosAutor("J.R.R. Tolkien").iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}