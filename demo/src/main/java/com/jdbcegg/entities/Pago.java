package com.jdbcegg.entities;
import java.sql.Date;

public class Pago {
    private int idPago;
    private int idCliente;
    private String formaPago;
    private String idTransaccion;
    private Date fechaPago;
    private double total;

    public Pago(int idPago, int idCliente, String formaPago, String idTransaccion, Date fechaPago, double total) {
        this.idPago = idPago;
        this.idCliente = idCliente;
        this.formaPago = formaPago;
        this.idTransaccion = idTransaccion;
        this.fechaPago = fechaPago;
        this.total = total;
    }

    public Pago() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pago [fechaPago=" + this.fechaPago + ", formaPago=" + this.formaPago + ", idCliente=" + this.idCliente + ", idPago=" + this.idPago + ", idTransaccion=" + this.idTransaccion + ", total=" + this.total + "]";
    }
}
