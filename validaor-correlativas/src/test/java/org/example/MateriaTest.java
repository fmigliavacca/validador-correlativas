package org.example;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {
    private Materia matematica = new Materia();
    private Materia lengua = new Materia();
    private Materia lenguaDos = new Materia(List.of(lengua));
    private List<Materia> listaMateria= List.of(matematica);
    private Materia algebra = new Materia(listaMateria);
    private Materia proyectoFinal = new Materia(List.of(matematica, lenguaDos));
    Alumno alumnoPrueba = new Alumno(List.of(matematica));
    @Test
    @DisplayName("Test de materia que puede ser cursada por alumno")
    public void puedeCursarMateriaAlumno() {
        Assertions.assertTrue(algebra.puedeCursar(alumnoPrueba));
    }
    @Test
    @DisplayName("Test de materia que no puede ser cursada por alumno")
    public void noPuedeCursarMateriaAlumno() {
        Assertions.assertFalse(lenguaDos.puedeCursar(alumnoPrueba));
    }
    @Test
    @DisplayName("Test de materia que no puede ser cursada por alumno por falta de alguna correlatividad")
    public void noPuedeCursarMateriaAlumnoPorFaltaDeCorrelatividad() {
        Assertions.assertFalse(proyectoFinal.puedeCursar(alumnoPrueba));
    }
}