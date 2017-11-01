package cine;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AplicandoCalendarYDate {
    public static void main(String[] args) {

        // Instancio los objetos con los que voy a trabajar.
        Genero genero = new Genero("Comedia");
        Calificacion calificacion = new Calificacion("ATP");
        PaisDeOrigen pais = new PaisDeOrigen("Argentina", "Castellano");

//        TODO: FORMA DE INSTANCIAR FECHAS

//        //FORMA 1
//        Calendar calendario = Calendar.getInstance();
//        calendario.set(Calendar.YEAR, 1988);
//        calendario.set(Calendar.MONTH, Calendar.JANUARY);
//        calendario.set(Calendar.DAY_OF_MONTH, 1);
//
//        //FORMA 2
//        Calendar calendario2 = new GregorianCalendar(1988, 0, 1, 20, 11, 44);
//
//        // ASIGNAR LA FECHA A UN OBJETO DATE.
//        Date fecha = calendario.getTime();
//        Date otraFecha = calendario2.getTime();

        // Intacia de un objeto fecha para la pelicula
        Calendar fecha1 = new GregorianCalendar(1988, 0, 1);
        Calendar fecha2 = new GregorianCalendar(2014, 5, 20);

        // Le asigno la fecha a la variable de tipo Date.
        Date anioEstreno = fecha1.getTime();
        Date fechaIngreso = fecha2.getTime();

        // Instancio un objeto de la clase pelicula
        Pelicula pelicula1 = new Pelicula(anioEstreno, (short)120, fechaIngreso, "El extraño mundo de Jack", genero, calificacion, pais);

        // Accedo al metodo toString de la clase Pelicula.
        System.out.println(pelicula1.toString());
    }
}
