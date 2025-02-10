package com.eggtomy.persistency;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.eggtomy.entities.Comentario;

public class ComentarioDAO extends DAO{
    public void addComentario(Comentario newComentario) {
        String query = "INSERT INTO comentarios (id_casa,comentario) VALUES (?,?);";
        try {
            noOutputQuery(query, newComentario.getIdCasa(),newComentario.getComentario());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void readComentario() {
        String query = "SELECT * FROM comentarios;";
        List<Comentario> comments = new ArrayList<>();
        try {
            outputQuery(query, (Object[])null);
            if (!resultSet.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            while(resultSet.next()){
                Comentario newComment = new Comentario(resultSet.getInt("id_comentario"),resultSet.getInt("id_casa"),resultSet.getString("comentario"));
                comments.add(newComment);

            }
            Iterator <Comentario> it = comments.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void readComentarioFromCasa(int idCasa) {
        String query = "SELECT * FROM comentarios WHERE id_casa = ?;";
        List<Comentario> comments = new ArrayList<>();
        try {
            outputQuery(query, idCasa);
            if (!resultSet.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            while(resultSet.next()){
                Comentario newComment = new Comentario(resultSet.getInt("id_comentario"),resultSet.getInt("id_casa"),resultSet.getString("comentario"));
                comments.add(newComment);

            }
            Iterator <Comentario> it = comments.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void updateComentario(int id,Comentario newComentario) {
        String query = "UPDATE comentarios SET id_casa=?, comentario=? WHERE id_comentario = ?;";
        try {
            noOutputQuery(query, newComentario.getIdCasa(),newComentario.getComentario(),id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteComentario(int id) {
        String query = "DELETE FROM comentarios WHERE id_comentario = ?;";
        try {
            noOutputQuery(query, id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
