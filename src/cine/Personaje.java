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

    public List<Personaje> buscarPersonajesSegunRoles(List<Personaje> listaPersonajes, Rol rolReferencia)
    {
        System.out.println("Buscando Personajes de ROl: " + rolReferencia.getNombre());
        List<Personaje> listaPersonajeConRol = new ArrayList();
        for (Personaje personaje : listaPersonajes)
        {
            if (personaje.getRol().getNombre().equals(rolReferencia.getNombre()))
            {
                listaPersonajeConRol.add(personaje);
                System.out.println(personaje.toString());
            }
        }
        return listaPersonajeConRol;
    }

    public List<Personaje> buscarPersonajesPorRol(List<Personaje> listaPersonajes, List<Rol> listaRoles){
        List<Personaje> listaPersonajesFiltrados = new ArrayList<Personaje>();

        for (Rol roles : listaRoles)
        {
            for (Personaje pj : listaPersonajes) {
//                System.out.println("el rol es: " + roles.getNombre());
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
        String msj = String.format("el actor %s tiene el rol %s", getActor().getNombre(), getRol().getNombre());
        return msj;
    }

    // GET AND SET
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
