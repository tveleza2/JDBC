package com.jdbcegg.entities;

public class Producto {
    private int idProducto;
    private String codigoProducto;
    private String nombre;
    private int idGama;
    private String dimensiones;
    private String proveedor;
    private String descripcion;
    private short cantidadEnStock;
    private double precioVenta;
    private double precioProveedor;

    public Producto(int idProducto, String codigoProducto, String nombre, int idGama, String dimensiones, String proveedor, String descripcion, short cantidadEnStock, double precioVenta, double precioProveedor) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.idGama = idGama;
        this.dimensiones = dimensiones;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidadEnStock = cantidadEnStock;
        this.precioVenta = precioVenta;
        this.precioProveedor = precioProveedor;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdGama() {
        return idGama;
    }

    public void setIdGama(int idGama) {
        this.idGama = idGama;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(short cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioProveedor() {
        return precioProveedor;
    }

    public void setPrecioProveedor(double precioProveedor) {
        this.precioProveedor = precioProveedor;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", cantidadEnStock=" + cantidadEnStock + ", codigoProducto=" + codigoProducto + ", descripcion=" + descripcion + ", dimensiones=" + dimensiones + ", idGama=" + idGama + ", idProducto=" + idProducto + ", precioProveedor=" + precioProveedor + ", precioVenta=" + precioVenta + ", proveedor=" + proveedor + "]";
    }




}
