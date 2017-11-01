package cine;

public class Asociacion {
    public static void main(String[] args) {
//      Instanciamos el objeto sexo para definir el atributo.
        Sexo sexo = new Sexo("Femenino");

//      Pasamos el objeto completo como parametro al constructor del objeto Actor.
        Actor actor = new Actor("Cami", sexo);

//      podemos acceder al atributo mediante el getter.
        System.out.println(actor.getSexo().getNombre());

        // devolvemos el metodo toString de la clase Actor.
        System.out.println(actor.toString());
    }
}
