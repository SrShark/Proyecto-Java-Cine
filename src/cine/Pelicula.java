package cine;

import java.util.Date;

public class Pelicula {
    private Date anioEstreno;
    private boolean disponible;
    private short duracion;
    private Date fechaIngreso;
    private String nombre;
    private String tituloOriginal;

    //  Asosiaciones
    private Genero genero;
    private Calificacion calificacion;
    private PaisDeOrigen paisDeOrigen;

    public Pelicula(Date anioEstreno, boolean disponible, short duracion, Date fechaIngreso, String nombre, String tituloOriginal, Genero genero, Calificacion calificacion, PaisDeOrigen paisDeOrigen) {
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.genero = genero;
        this.calificacion = calificacion;
        this.paisDeOrigen = paisDeOrigen;
    }

    public Date getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(Date anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public short getDuracion() {
        return duracion;
    }

    public void setDuracion(short duracion) {
        this.duracion = duracion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public PaisDeOrigen getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }
}
