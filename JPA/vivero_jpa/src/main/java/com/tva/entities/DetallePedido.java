package com.tva.entities;

import jakarta.persistence.*;

@Entity
@Table(name="detalle_pedido")
public class DetallePedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_detalle_pedido")
  private int idDetallePedido;

  @Column(name = "cantidad")
  private int cantidad;

  @Column(name = "numero_linea")
  private int numeroLinea;

  @Column(name = "precio_unidad")
  private double precioUnidad;

  @ManyToOne
  @JoinColumn(name = "id_producto")
  private Producto producto;

  @ManyToOne
  @JoinColumn(name = "id_pedido")
  private Pedido pedido;

  public DetallePedido() {
  }

  public int getIdDetallePedido() {
    return idDetallePedido;
  }

  public void setIdDetallePedido(int idDetallePedido) {
    this.idDetallePedido = idDetallePedido;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public int getNumeroLinea() {
    return numeroLinea;
  }

  public void setNumeroLinea(int numeroLinea) {
    this.numeroLinea = numeroLinea;
  }

  public double getPrecioUnidad() {
    return precioUnidad;
  }

  public void setPrecioUnidad(double precioUnidad) {
    this.precioUnidad = precioUnidad;
  }
  
  public Pedido getPedido() {
      return pedido;
  }
  public void setPedido(Pedido pedido) {
      this.pedido = pedido;
  }
  public Producto getProducto() {
      return producto;
  }
  public void setProducto(Producto producto) {
      this.producto = producto;
  }
}

