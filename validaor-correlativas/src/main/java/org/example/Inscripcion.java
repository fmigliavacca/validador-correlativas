package org.example;

import java.util.List;

public class Inscripcion {
    private final List<Materia> asignaturas;

    public Inscripcion(List<Materia> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public boolean aprobada(Alumno alumno){
        return asignaturas.stream().allMatch(asignatura ->{
            return asignatura.puedeCursar(alumno);
        });
    }
}
