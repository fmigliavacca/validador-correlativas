package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class AlumnoTest {
    private Materia matematica = new Materia();
    private Materia lengua = new Materia();
    Alumno alumnoPrueba = new Alumno(List.of(matematica));
    @Test
    @DisplayName("Test de alumno que aprobó materia")
    public void testAproboMateria() {
        Assertions.assertTrue(alumnoPrueba.aproboMateria(matematica));
    }
    @Test
    @DisplayName("Test de alumno que no aprobó materia")
    public void noAproboMateria() {
        Assertions.assertFalse(alumnoPrueba.aproboMateria(lengua));
    }
}