package cine;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombreEnPelicula;
    private Rol rol;
    private Actor actor;

    public Personaje(String nombreEnPelicula, Rol rol){
        this.nombreEnPelicula = nombreEnPelicula;
        this.rol = rol;
    }

    public Personaje(String nombreEnPelicula, Rol rol, Actor actor){
        this.nombreEnPelicula = nombreEnPelicula;
        this.rol = rol;
        this.actor = actor;
    }

    public List<Personaje> buscarPersonajesSegunRoles(List<Personaje> listaPersonajes, Rol rol) {
        System.out.printf("Buscando Personajes de Rol: %s \n", rol.getNombre());

        // Lista a retornar
        List<Personaje> listaPersonajeConRol = new ArrayList<Personaje>();

        // Recorro la lista de personajes
        for (Personaje personaje : listaPersonajes)
        {
            // Comparo el rol de cada personaje con el rol de referencia que llega como parametro del metodo.
            if (personaje.getRol().getNombre().equals(rol.getNombre()))
            {
                listaPersonajeConRol.add(personaje);
                System.out.println(personaje.toString());
            }
        }

        return listaPersonajeConRol;
    }

    public List<Personaje> FiltrarPersonajesPorRol(List<Personaje> listaPersonajes, List<Rol> listaRoles) {
        // Lista a retornar
        List<Personaje> listaPersonajesFiltrados = new ArrayList<Personaje>();

        // Recorro los roles y los personajes de las listas.
        for (Rol roles : listaRoles) {
            // Imprimo el rol a filtrar
            System.out.printf("Rol: %s\n", roles.getNombre());

            // Recorro los personajes
            for (Personaje pj : listaPersonajes) {

                // Filtro por roles que en el momento se esta buscando y los asigno en orgen en la lista a retornar.
                if (roles.getNombre().equals(pj.getRol().getNombre()))
                {
                    listaPersonajesFiltrados.add(pj);
                    System.out.println(pj.toString());
                }
            }

        }

        return listaPersonajesFiltrados;
    }

    @Override
    public String toString() {
        String msj = String.format(
                "El actor %s tiene el rol '%s'",
                getActor().getNombre(),
                getRol().getNombre()
        );
        return msj;
    }

    // GETERS AND SETERS
    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
