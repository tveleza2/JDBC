package com.tva.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {
    public Libro(){}

    @Id
    @Column(name="isbn")
    private long isbn;
    
    @Column(name="titulo")
    private String titulo;

    @Column(name="anio")
    private int anio;

    @Column(name="ejemplares")
    private int ejemplares;

    @Column(name="alta")
    private boolean alta;

    @ManyToOne
    @JoinColumn(name="id_autor")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name="id_editorial")
    private Editorial editorial;

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public boolean isAlta() {
        return alta;
    }
    public int getAnio() {
        return anio;
    }
    public Autor getAutor() {
        return autor;
    }
    public Editorial getEditorial() {
        return editorial;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public long getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Libro [ ISBN: "+getIsbn()+", titulo: "+getTitulo() + " ,ejemplares: "+getEjemplares()+"]";
    }


}
