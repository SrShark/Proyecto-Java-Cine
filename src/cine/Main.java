package cine;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//      TODO: Actor -> Sexo (Relación de Asosiación.)
////      Instanciamos el objeto sexo para definir el atributo.
//        Sexo sexo = new Sexo("mujer");
//
////      Pasamos el objeto completo como parametro al constructor del objeto Actor.
//        Actor actor = new Actor("juan", "perez", false, sexo);
//
////      podemos acceder al atributo mediante el getter.
//        System.out.println(actor.getSexo().getNombre());

//        TODO Pelicula -> PaisDeOrigen, Genero, Calificación
//        Genero genero = new Genero();
//        genero.setNombre("Comedia");
//
//        Calificacion calificacion = new Calificacion();
//        calificacion.setNombre("ATP");
//
//        PaisDeOrigen pais = new PaisDeOrigen();
//        pais.setNombre("Argentina");
//        pais.setIdioma("Castellano");

//        // FORMA DE INSTANCIAR FECHAS
//        //FORMA 1
//        Calendar calendario = Calendar.getInstance();
//        calendario.set(Calendar.YEAR, 1988);
//        calendario.set(Calendar.MONTH, Calendar.JANUARY);
//        calendario.set(Calendar.DAY_OF_MONTH, 1);
//        //FORMA 2
//        Calendar calendario2 = new GregorianCalendar(1988, 0, 1, 20, 11, 44);
//        // ASIGNAR LA FECHA A UN OBJETO DATE.
//        Date fecha = calendario.getTime();
//        Date otraFecha = calendario2.getTime();

        // FECHAS PARA EL OBJETO PELICULA todoPoderoso.

//        Calendar fecha1 = new GregorianCalendar(1988, 0, 1);
//        Date anioEstreno = fecha1.getTime();
//
//        Calendar fecha2 = new GregorianCalendar(2014, 5, 20);
//        Date fechaIngreso = fecha2.getTime();
//
//        Pelicula todoPoderoso = new Pelicula(anioEstreno, true, (short)120, fechaIngreso, "TodoPoderoso", "GOD", genero, calificacion, pais);
//
//        System.out.println(todoPoderoso.getAnioEstreno());

//        TODO: Personaje -> Rol
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

        Personaje pj1 = new Personaje("wolverine", rol1, actor1);
        Personaje pj2 = new Personaje("wolverine", rol2, actor2);
        Personaje pj3 = new Personaje("wolverine", rol3, actor3);

//        TODO: Accesos a diferentes instancias de objetos.
//        System.out.println(pj1.getRol().getNombre());
//        // me traigo el objeto completo.
//        System.out.println(pj1.getActor().getSexo());
//        // nombre del sexo.
//        System.out.println(pj1.getActor().getSexo().getNombre());

        // lista de personajes
//        List<Personaje> listaPersonajes = new ArrayList<Personaje>();
//        listaPersonajes.add(new Personaje("wolverine", rol1, actor1));
//        listaPersonajes.add(new Personaje("wolverine", rol2, actor2);
//        listaPersonajes.add(new Personaje("wolverine", rol3, actor3);
//        pj1.buscarPersonajesSegunRoles(listaPersonajes, rol1);

//        TODO: Buscar actores por sexo.
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
        listaPersonajes.add(new Personaje("wolverine", rol1, actor1));
        listaPersonajes.add(new Personaje("wolverine", rol2, actor2));
        listaPersonajes.add(new Personaje("wolverine", rol3, actor3));
        listaPersonajes.add(new Personaje("wolverine", rol1, actor4));
        listaPersonajes.add(new Personaje("wolverine", rol2, actor5));
        listaPersonajes.add(new Personaje("wolverine", rol3, actor6));

        pj1.buscarPersonajesPorRol(listaPersonajes, listaRoles);

//        actor1.buscarActorPorSexo(listaActores, femenino);
//        actor2.buscarActorPorSexo(listaActores, masculino);
    }
}
