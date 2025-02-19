package com.tva.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "editorial")
public class Editorial {
    public Editorial(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_editorial")
    private int idEditorial;

    @Column(name="nombre")
    private String nombre;

    @Column(name="alta")
    private boolean alta;

    public int getIdEditorial() {
        return idEditorial;
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
    public void setIdEditorial(int id) {
        this.idEditorial = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "Editorial: [id: "+getIdEditorial()+", nombre: "+ getNombre()+ ", alta: "+isAlta()+"]";
    }

}
