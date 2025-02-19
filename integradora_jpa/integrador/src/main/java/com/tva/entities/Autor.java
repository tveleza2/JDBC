package com.tva.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {
    public Autor(){
        setAlta(true);
    }

    public Autor(String nombre){
        setNombre(nombre);
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_autor")
    private int idAutor;

    @Column(name="nombre")
    private String nombre;

    @Column(name="alta")
    private boolean alta;

    public int getIdAutor() {
        return idAutor;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean isAlta() {
        return alta;
    }
    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    public void setIdAutor(int id) {
        this.idAutor = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "Autor: [id: "+getIdAutor()+", nombre: "+ getNombre()+ ", alta: "+isAlta()+"]";
    }



}
