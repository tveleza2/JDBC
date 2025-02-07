package com.eggtomy.persistency;

import com.eggtomy.entities.Familia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FamiliaDAO extends DAO {
    public void addFamilia(Familia newFamilia) {
        String query = "INSERT INTO familias (nombre, edad_minima, edad_maxima, num_hijos, email, id_casa_familia) VALUES (?,?,?,?,?,?);";
        try {
            noOutputQuery(query, newFamilia.getNombre(),newFamilia.getEdadMinima(), newFamilia.getEdadMaxima(), newFamilia.getNumHijos(), newFamilia.getEmail(), newFamilia.getIdCasaFamilia());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void readFamilias() {
        String query = "SELECT * FROM familias;";
        List<Familia> familias = new ArrayList<>();
        try {
            outputQuery(query, (Object[])null);
            if (!resultSet.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            while(resultSet.next()){
                Familia newFamilia = new Familia(resultSet.getInt("id_familia"),resultSet.getString("nombre"),resultSet.getInt("edad_minima"),resultSet.getInt("edad_maxima"),resultSet.getInt("num_hijos"),resultSet.getString("email"),resultSet.getInt("id_casa_familia"));
                familias.add(newFamilia);

            }
            Iterator <Familia> it = familias.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateCasa(int id,Familia newFamilia) {
        String query = "UPDATE familias SET nombre=?, edad_minima=?,edad_maxima=?,num_hijos=?,email=?,id_casa_familia=? WHERE id_familia = ?;";
        try {
            noOutputQuery(query, newFamilia.getNombre(),newFamilia.getEdadMinima(), newFamilia.getEdadMaxima(), newFamilia.getNumHijos(), newFamilia.getEmail(), newFamilia.getIdCasaFamilia());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteCasa(int id) {
        String query = "DELETE FROM familias WHERE id_familia = ?;";
        try {
            noOutputQuery(query, id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
