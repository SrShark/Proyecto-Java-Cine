package com.cavalloguido;

import java.util.Date;

public class Cine {
    private String direccion;
    private String nombre;
    private float precioEntrada;
    private Date fechaInauguracion;

    public Cine(){
    }

    public Cine(String direccion, String nombre, float precioEntrada, Date fechaInauguracion) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        this.fechaInauguracion = fechaInauguracion;
    }

    //    GETTERS AND SETTERS

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Date getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(Date fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }
}
