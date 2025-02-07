package com.eggtomy.persistency;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.eggtomy.entities.Casa;

public class CasaDAO extends DAO {
    public void addCasa(Casa newCasita) {
        String query = "INSERT INTO casas (calle,numero,codigo_postal,ciudad,pais,fecha_desde,fecha_hasta,tiempo_minimo,tiempo_maximo,precio_habitacion,tipo_vivienda) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
        try {
            noOutputQuery(query, newCasita.getCalle(),newCasita.getNumero(),newCasita.getZipCode(),newCasita.getCiudad(),newCasita.getPais(),newCasita.getFechaDesde(),newCasita.getFechaHasta(),newCasita.getMinTime(),newCasita.getMaxTime(),newCasita.getPrice(),newCasita.getTipoVivienda());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void readCasas() {
        String query = "SELECT * FROM casas;";
        List<Casa> casas = new ArrayList<>();
        try {
            outputQuery(query, (Object[])null);
            if (!resultSet.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            while(resultSet.next()){
                Casa newCasa = new Casa(resultSet.getInt("id_casa"),resultSet.getString("calle"),resultSet.getInt("numero"),resultSet.getString("codigo_postal"),resultSet.getString("ciudad"),resultSet.getString("pais"),resultSet.getDate("fecha_desde"),resultSet.getDate("fecha_hasta"),resultSet.getInt("tiempo_minimo"),resultSet.getInt("tiempo_maximo"),resultSet.getFloat("precio_habitacion"),resultSet.getString("tipo_vivienda"));
                casas.add(newCasa);

            }
            Iterator <Casa> it = casas.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateCasa(int id,Casa newCasita) {
        String query = "UPDATE casas SET calle=?, numero=?,codigo_postal=?,ciudad=?,pais=?,fecha_desde=?,fecha_hasta=?,tiempo_minimo=?,tiempo_maximo=?,precio_habitacion=?,tipo_vivienda=? WHERE id_casa = ?;";
        try {
            noOutputQuery(query, newCasita.getCalle(),newCasita.getNumero(),newCasita.getZipCode(),newCasita.getCiudad(),newCasita.getPais(),newCasita.getFechaDesde(),newCasita.getFechaHasta(),newCasita.getMinTime(),newCasita.getMaxTime(),newCasita.getPrice(),newCasita.getTipoVivienda());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteCasa(int id) {
        String query = "DELETE FROM casas WHERE id_casa = ?;";
        try {
            noOutputQuery(query, id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
