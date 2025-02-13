package com.tva.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity

@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int idEmpleado;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "codigo_empleado")
    private int codigoEmpleado;

    @Column(name = "email")
    private String email;

    @Column(name = "extension")
    private String extension;

    @Column(name = "id_jefe")
    private int idJefe;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "puesto")
    private String puesto;
    

    @ManyToOne // "Muchos empleados pueden pertenecer a una misma oficina"
    @JoinColumn(name = "id_oficina") //// Establezco la relacion con Oficina. Indico con que "dato se relacionan".
    private Oficina oficina;
    
    public Empleado(){}

    // public Empleado(int idEmpleado,String apellido,int codigoEmpleado,String email,String extension,int idJefe,String nombre, String puesto, int idOficina){
    //     this.apellido = apellido;
    //     this.codigoEmpleado = codigoEmpleado;
    //     this.email = email;
    //     this.extension = extension;
    //     this.idEmpleado = idEmpleado;
    //     this.idJefe = idJefe;
    //     this.idOficina = idOficina;
    //     this.nombre = nombre;
    //     this.puesto = puesto;
    // }
    // public Empleado(String apellido,int codigoEmpleado,String email,String extension,int idJefe,String nombre, String puesto, int idOficina){
    //     this.apellido = apellido;
    //     this.codigoEmpleado = codigoEmpleado;
    //     this.email = email;
    //     this.extension = extension;
    //     this.idJefe = idJefe;
    //     this.idOficina = idOficina;
    //     this.nombre = nombre;
    //     this.puesto = puesto;
    // }

    public String getApellido() {
        return apellido;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public String getExtension() {
        return extension;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public void setIdOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


}
