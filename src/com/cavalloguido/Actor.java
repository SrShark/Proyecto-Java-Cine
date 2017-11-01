package com.cavalloguido;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String nombre;
    private String apellido;
    private boolean animado;
    private Sexo sexo; // Relación de Asociación

    public Actor(String nombre, String apellido, boolean animado, Sexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.animado = animado;
        this.sexo = sexo;
    }

    public Actor(String nombre, Sexo sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public List<Actor> buscarActorPorSexo(List<Actor> listaActores, Sexo sexoBuscar){
        List<Actor> listaDeActoresFiltradosPorSexo = new ArrayList<Actor>();

        for (Actor actor : listaActores) {
            if (actor.getSexo().getNombre().equals(sexoBuscar.getNombre())) {
                listaDeActoresFiltradosPorSexo.add(actor);
                System.out.println(actor.toString());
            }
        }

        return listaDeActoresFiltradosPorSexo;
    }

    @Override
    public String toString() {
        String msj = String.format("el actor %s es de sexo %s", getNombre(), getSexo().getNombre());
        return msj;
    }

//    GETTERS AND SETTERS

    // Get Relación de Asociación
    public Sexo getSexo() {
        return sexo;
    }

    // Set Relación de Asociación
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public boolean isAnimado() {
        return animado;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
