package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Materia {
    private final List<Materia> correlativas;

    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas == null ?
                Collections.emptyList() :
                List.copyOf(correlativas);
    }

    public Materia() {
        this.correlativas = Collections.emptyList();
    }

    public boolean puedeCursar(Alumno alumno) {
        Objects.requireNonNull(alumno, "El alumno no puede ser null");
        return this.aproboTodasLasCorrelativas(alumno);
    }

    private boolean aproboTodasLasCorrelativas(Alumno alumno) {
        return this.correlativas.stream()
                .allMatch(correlativa -> alumno.aproboMateria(correlativa));
    }
}
