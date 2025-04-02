package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    private Materia matematica = new Materia();
    private Materia lengua = new Materia();
    private Materia lenguaDos = new Materia(List.of(lengua));
    private List<Materia> listaMateria= List.of(matematica);
    private Materia algebra = new Materia(listaMateria);
    private Inscripcion inscripcion1 = new Inscripcion(List.of(algebra));
    private Inscripcion inscripcion2 = new Inscripcion(List.of(lenguaDos, algebra));
    private Inscripcion inscripcion3 = new Inscripcion(List.of(lengua));
    private
    Alumno alumnoPrueba = new Alumno(List.of(matematica));
    @Test
    @DisplayName("Test de inscripcion que es aprobada")
    public void inscripcionAprobada() {
        Assertions.assertTrue(inscripcion1.aprobada(alumnoPrueba));
    }
    @Test
    @DisplayName("Test de inscripcion que no es aprobada con una sola materia")
    public void inscripcionDesaprobadaUnaSolaMateria() {
        Assertions.assertFalse(inscripcion2.aprobada(alumnoPrueba));
    }
    @Test
    @DisplayName("Test de inscripcion que no es aprobada con mas de una materia")
    public void inscripcionDesaprobadaMasDeUnaMateria() {
        Assertions.assertFalse(inscripcion2.aprobada(alumnoPrueba));
    }
    @Test
    @DisplayName("Test de inscripcion aceptada por que la materia no tiene correlativas")
    public void inscripcionAprobadaPorNoCorrelativas() {
        Assertions.assertTrue(inscripcion3.aprobada(alumnoPrueba));
    }
}