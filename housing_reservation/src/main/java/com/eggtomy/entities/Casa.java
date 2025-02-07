package com.eggtomy.entities;

import java.sql.Date;

public class Casa {
    private int idCasa;
    private String calle;
    private int numero;
    private String zipCode;
    private String ciudad;
    private String pais;
    private Date fechaDesde;
    private Date fechaHasta;
    private int minTime;
    private int maxTime;
    private Float price;
    private String tipoVivienda;

    public Casa(){}

    public Casa(String calle, int numero, String zipCode, String ciudad, String pais, Date desde, Date hasta, int minTime, int maxTime, Float price, String tipo){
        this.calle = calle;
        this.numero = numero;
        this.zipCode = zipCode;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = desde;
        this.fechaHasta = hasta;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.price = price;
        this.tipoVivienda = tipo;
    }
    public Casa(int id,String calle, int numero, String zipCode, String ciudad, String pais, Date desde, Date hasta, int minTime, int maxTime, Float price, String tipo){
        this.idCasa = id;
        this.calle = calle;
        this.numero = numero;
        this.zipCode = zipCode;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = desde;
        this.fechaHasta = hasta;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.price = price;
        this.tipoVivienda = tipo;
    }
    
    public String getCalle() {
        return calle;
    }
    public String getCiudad() {
        return ciudad;
    }
    public Date getFechaDesde() {
        return fechaDesde;
    }
    public Date getFechaHasta() {
        return fechaHasta;
    }
    public int getIdCasa() {
        return idCasa;
    }
    public int getMaxTime() {
        return maxTime;
    }
    public int getMinTime() {
        return minTime;
    }
    public int getNumero() {
        return numero;
    }
    public String getPais() {
        return pais;
    }
    public Float getPrice() {
        return price;
    }
    public String getTipoVivienda() {
        return tipoVivienda;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }
    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }
    public void setMinTime(int minTime) {
        this.minTime = minTime;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public String toString() {
        return "Casa: [id: " + getIdCasa() +", precio: " + getPrice().toString() + ", calle: "+ getCalle()+ ", ciudad: " + getCiudad()+", CodigoPostal: "+getZipCode()+"]";
    }
}
