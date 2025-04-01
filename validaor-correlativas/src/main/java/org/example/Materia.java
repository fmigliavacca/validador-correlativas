package org.example;

import java.util.List;

public class Materia {
    private final List<Materia> correlativas;

    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean puedeCursar(Alumno alumno){
        return this.aproboTodasLasCorrelativas(alumno);
    }

    private boolean aproboTodasLasCorrelativas(Alumno alumno){
        return this.correlativas.stream().allMatch(correlativa -> alumno.aproboMateria(correlativa));
    }

}
