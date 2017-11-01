package cine;

import java.util.Date;

public class Entrada {
    private Date fechaHoraFuncion;
    private Date fechaHoraVenta;
    private float precioCobrado;
    private int ticketNro;

    public Entrada(Date fechaHoraFuncion, Date fechaHoraVenta, float precioCobrado, int ticketNro) {
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
    }

    public Date getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(Date fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public float getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(float precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }
}
