package cine;

import java.util.List;
import java.util.ArrayList;

public class BuscarActoresPorRol {
    public static void main(String[] args) {

        Sexo femenino = new Sexo("Femenino");
        Sexo masculino = new Sexo("Masculino");

        Actor actor1 = new Actor("Guido", masculino);
        Actor actor2 = new Actor("Ale", masculino);
        Actor actor3 = new Actor("Maria", femenino);
        Actor actor4 = new Actor("Cami", femenino);
        Actor actor5 = new Actor("Paola", femenino);
        Actor actor6 = new Actor("Lio", masculino);

        Rol rol1 = new Rol("Principal");
        Rol rol2 = new Rol("Secundario");
        Rol rol3 = new Rol("Extra");

        // Instancio un personaje con nombre gestor para poder invocar los metodos de la clase Personaje.
        Personaje gestor = new Personaje("Gestor", rol1, actor1);

        // LISTAS
        List<Actor> listaActores = new ArrayList<Actor>();
        listaActores.add(actor1);
        listaActores.add(actor2);
        listaActores.add(actor3);
        listaActores.add(actor4);
        listaActores.add(actor5);
        listaActores.add(actor6);

        List<Rol> listaRoles = new ArrayList<Rol>();
        listaRoles.add(rol1);
        listaRoles.add(rol2);
        listaRoles.add(rol3);

        List<Personaje> listaPersonajes = new ArrayList<Personaje>();
        listaPersonajes.add(new Personaje("Goku", rol1, actor1));
        listaPersonajes.add(new Personaje("Vegeta", rol2, actor2));
        listaPersonajes.add(new Personaje("videl", rol3, actor3));
        listaPersonajes.add(new Personaje("Milk", rol1, actor4));
        listaPersonajes.add(new Personaje("Bulma", rol2, actor5));
        listaPersonajes.add(new Personaje("Gohan", rol3, actor6));

        // Ejecuto el metodo para filtrar Personajes por Rol.
        gestor.FiltrarPersonajesPorRol(listaPersonajes, listaRoles);
    }
}
