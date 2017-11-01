package cine;

import java.util.List;
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {

        Sexo femenino = new Sexo("Femenino");
        Sexo masculino = new Sexo("Masculino");

        Actor actor1 = new Actor("Juan", masculino);
        Actor actor2 = new Actor("Pedro", masculino);
        Actor actor3 = new Actor("Maria", femenino);
        Actor actor4 = new Actor("Cami", femenino);
        Actor actor5 = new Actor("Vaneza", femenino);
        Actor actor6 = new Actor("Roberto", masculino);

        Rol rol1 = new Rol("Principal");
        Rol rol2 = new Rol("Secundario");
        Rol rol3 = new Rol("Extra");

        Personaje pj1 = new Personaje("Thor", rol1, actor1);
        Personaje pj2 = new Personaje("iron-man", rol2, actor2);
        Personaje pj3 = new Personaje("Hulk", rol3, actor3);

        // Me traigo el objeto completo.
        System.out.println(pj1.getActor().getSexo());

        // Obtengo el valor del atributo.
        System.out.println(pj1.getActor().getSexo().getNombre());

        // Creo una Lista de personajes
        List<Personaje> listaPersonajes = new ArrayList<Personaje>();

        // Le asigno los personajes.
        listaPersonajes.add(pj1);
        listaPersonajes.add(pj2);

        // tambien puedo asignar de esta forma, así no recibe nombre el personaje.
        listaPersonajes.add(new Personaje("wolverine", rol3, actor6));

        // Ejecuto el metodo 'buscarPersonajesSegunRoles' del objeto pj1 que proviene de la clase Personaje.
        // Este metodo recibe dos objetos - 'dejo de trabajar con datos primitivos'
        pj1.buscarPersonajesSegunRoles(listaPersonajes, rol1);
    }
}
