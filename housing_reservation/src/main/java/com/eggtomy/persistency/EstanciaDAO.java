package com.eggtomy.persistency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.eggtomy.entities.Estancia;

public class EstanciaDAO extends DAO {

    public void addEstancia(Estancia newEstancia) {
        String query = "INSERT INTO estancias (id_cliente,id_casa,nombre_huesped,fecha_desde,fecha_hasta) VALUES (?,?,?,?,?);";
        try {
            noOutputQuery(query, newEstancia.getIdCliente(),newEstancia.getIdCasa(),newEstancia.getNombreHuesped(),newEstancia.getFechaDesde(),newEstancia.getFechaHasta());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void readEstancias() {
        String query = "SELECT * FROM estancias;";
        List<Estancia> estancias = new ArrayList<>();
        try {
            outputQuery(query, (Object[])null);
            if (!resultSet.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            while(resultSet.next()){
                Estancia newEstancia = new Estancia(resultSet.getInt("id_estancia"),resultSet.getInt("id_cliente"),resultSet.getInt("id_casa"),resultSet.getString("nombre_huesped"),resultSet.getDate("fecha_desde"),resultSet.getDate("fecha_hasta"));
                estancias.add(newEstancia);

            }
            Iterator <Estancia> it = estancias.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void readEstanciasFromCasa(int idCasa) {
        String query = "SELECT * FROM estancias WHERE id_casa = ?;";
        List<Estancia> estancias = new ArrayList<>();
        try {
            outputQuery(query, (Object[])null);
            if (!resultSet.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            while(resultSet.next()){
                Estancia newEstancia = new Estancia(resultSet.getInt("id_estancia"),resultSet.getInt("id_cliente"),resultSet.getInt("id_casa"),resultSet.getString("nombre_huesped"),resultSet.getDate("fecha_desde"),resultSet.getDate("fecha_hasta"));
                estancias.add(newEstancia);

            }
            Iterator <Estancia> it = estancias.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void updateEstancia(int id,Estancia newEstancia) {
        String query = "UPDATE estancias SET id_cliente=?, id_casa=?, nombre_huesped=?, fecha_desde = ?, fecha_hasta = ? WHERE id_estancia = ?;";
        try {
            noOutputQuery(query, newEstancia.getIdCliente(),newEstancia.getIdCasa(),newEstancia.getNombreHuesped(),newEstancia.getFechaDesde(),newEstancia.getFechaHasta());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteEstancia(int id) {
        String query = "DELETE FROM estancias WHERE id_estancia = ?;";
        try {
            noOutputQuery(query, id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }




    
}
