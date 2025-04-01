package org.example;
import java.util.List;

public class Alumno {
    private final List<Materia> materiasAprobadas;
    private Inscripcion miInscripcion;

    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean aproboMateria(Materia materia){
        return materiasAprobadas.contains(materia);
    }
}
