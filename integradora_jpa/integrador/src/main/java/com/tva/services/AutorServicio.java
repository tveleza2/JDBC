package com.tva.services;

import com.tva.entities.Autor;
import com.tva.persistency.AutorDAO;

import java.util.List;
import java.util.Iterator;

// import com.tva.persistency.AutorDAO;

public class AutorServicio {
    protected static AutorDAO authorDao = new AutorDAO();

    public static void persistNuevoAutor(String nombre) throws Exception{
        List<Autor> authors = authorDao.findAutores(nombre);
        if (authors.isEmpty()) {
            throw new Exception(String.format("El autor %s ya existe en la base de datos",nombre));
        }else{
            Autor author = new Autor(nombre);
            authorDao.guardaAutor(author);
        }
    }

    public void toggleAlta(int id){
        Autor autor = authorDao.findAutor(id);
        autor.setAlta(!autor.isAlta());
        authorDao.actualizarAutor(autor);
    }

    private void mostrarAutores(List<Autor> listaAutores){
        Iterator<Autor> it = listaAutores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }



}
