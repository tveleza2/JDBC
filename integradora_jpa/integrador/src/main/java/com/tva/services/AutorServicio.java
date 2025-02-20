package com.tva.services;

import com.tva.entities.Autor;
import com.tva.persistency.AutorDAO;

import java.util.List;
import java.util.Iterator;

// import com.tva.persistency.AutorDAO;

public class AutorServicio {
    protected static AutorDAO authorDao = new AutorDAO();

    public static void persistNuevoAutor(Autor autor) throws Exception{
        if(autor == null|| autor.getNombre() == null || autor.getNombre().trim().isEmpty()){
            throw new Exception("El nombre del autor no puede estar vacío.");
        }

        List<Autor> authors = authorDao.findAutores(autor.getNombre());
        if (!authors.isEmpty()) {
            throw new Exception(String.format("El autor %s ya existe en la base de datos",autor.getNombre()));
        }
        authorDao.guardaAutor(autor);
        
    }

    public static void autorPorNombre(String nombre) throws Exception{
        if(nombre == null){
            throw new Exception("El nombre no puede ser nulo");
        }
        List<Autor> autoresList = authorDao.findAutores(nombre);
        mostrarAutores(autoresList);
    }

    public static void actualizarAutor(Autor autor) throws Exception{
        if(autor == null || autor.getNombre() == null){
            throw new Exception("El autor no es válido");
        }
        Autor autorExistente = authorDao.findAutor(autor.getIdAutor());
        if(autorExistente==null){
            throw new Exception("No se encontró autor con ID: "+autor.getIdAutor());
        }
        authorDao.actualizarAutor(autor);
        
    }

    public static void eliminarAutor(int id) throws Exception {
        Autor autor = authorDao.findAutor(id);
        if (autor == null) {
            throw new Exception("No se encontró el autor con ID: " + id);
        }
        authorDao.eliminarAutor(id);
    }
    

    public static void toggleAlta(int id) throws Exception{
        Autor autor = authorDao.findAutor(id);
        if(autor!=null){
            autor.setAlta(!autor.isAlta());
            authorDao.actualizarAutor(autor);
        }else{
            throw new Exception("No hay autor con ID: "+id);
        }
    }

    private static void mostrarAutores(List<Autor> listaAutores){
        Iterator<Autor> it = listaAutores.iterator();
        if(!it.hasNext()){
            System.out.println("LISTA VACÍA");
        }
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }



}
