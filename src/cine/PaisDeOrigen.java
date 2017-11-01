package cine;

public class PaisDeOrigen {
    private String idioma;
    private String nombre;

    public PaisDeOrigen(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
