package org.example.UTILIDADES;

import org.example.MODELOS.Alumno;
import org.example.MODELOS.Colegio;
import org.example.MODELOS.Curso;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesColegio {
    public static Integer totalAlumnos(List<Colegio> colegios) {
        Integer total = 0;
        for (Colegio colegio : colegios) {
            Integer alumnos = colegio.getAlumnos().size();
            total += alumnos;
        }
        return total;
    }

    public static List<Alumno> mayoresEdad(Colegio colegio) {
        List<Alumno> alumnos = new ArrayList<Alumno>();
        for (Alumno alumno : colegio.getAlumnos()) {
            if ((Period.between(alumno.getFechaNacimiento(), LocalDate.now()).getYears() > 18) && alumno.getCurso().equals(Curso.CICLOS)){
                alumnos.add(alumno);
            }
        }
        return alumnos;
    }

    public static Map<Colegio, Integer> totalAlumnosPorColegio (List<Colegio> colegios) {
        Map<Colegio, Integer> alumnos = new HashMap<>();
        for (Colegio colegio : colegios) {
            if (colegio.getAlumnos().size() > 0){
                alumnos.put(colegio, colegio.getAlumnos().size());
            }
        }
        return alumnos;
    }

    public static Map<Curso, List<Alumno>> alumnosPorCurso (Colegio colegio) {
        Map<Curso, List<Alumno>> alumnos = new HashMap<>();
        for (Alumno alumno : colegio.getAlumnos()) {
            if (!alumnos.containsKey(alumno.getCurso())) {
                alumnos.put(alumno.getCurso(), new ArrayList<>(List.of(alumno)));
            } else {
                alumnos.get(alumno.getCurso()).add(alumno);
            }
        }
        return alumnos;
    }
}
