package com.tva.entities;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "pago")
public class Pago {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private int idPago;
 
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_pago")
    private Date fechaPago;


    @Column(name = "forma_pago")
    private String formaPago;


    @Column(name = "id_transaccion")
    private String idTransaccion;
   
    @Column(name = "total")
    private double total;


    @ManyToOne//Muchos pagos pueden estar asociados a un cliente.
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
//GETTERS Y SETTERS / CONSTRUCTOR VACÍO
}


