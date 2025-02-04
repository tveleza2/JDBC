package com.jdbcegg.entities;

public class DetallePedido {
    private int idDetallePedido;
    private int idPedido;
    private int idProducto;
    private int cantidad;
    private double precio;
    private int numLinea;
    public DetallePedido(int idDetallePedido, int idPedido, int idProducto, int cantidad, double precio, int numLinea) {
        this.idDetallePedido = idDetallePedido;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.numLinea = numLinea;
    }
    public DetallePedido() {
    }
    public int getIdDetallePedido() {
        return idDetallePedido;
    }
    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getNumLinea() {
        return numLinea;
    }
    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }
    @Override
    public String toString() {
        return "DetallePedido [cantidad=" + this.cantidad + ", idDetallePedido=" + this.idDetallePedido + ", idPedido=" + this.idPedido+ ", idProducto=" + this.idProducto + ", numLinea=" +this.numLinea + ", precio=" + this.precio + "]";
    }
}
