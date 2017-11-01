package cine;

public class HorarioFuncion {
    private String nombre;
    private String apellido;
    private boolean animado;

    public HorarioFuncion(String nombre, String apellido, boolean animado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.animado = animado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isAnimado() {
        return animado;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }
}
