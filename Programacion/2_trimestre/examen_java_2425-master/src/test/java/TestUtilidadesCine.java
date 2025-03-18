import enumerados.Genero;
import modelos.*;
import org.junit.jupiter.api.Test;
import utilidades.UtilidadesCine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestUtilidadesCine {
    @Test
    void testEjercicio1() {
        List<Cine> cines = List.of(
                new Cine(1L, "Cine A", "Direccion A", List.of(
                        new Sala(1L, "Sala 1", List.of(new Asiento(1L, 1, 1, true)), List.of())
                )),
                new Cine(2L, "Cine B", "Direccion B", List.of(
                        new Sala(2L, "Sala 2", new ArrayList<>(Collections.nCopies(21, new Asiento(1L, 1, 1, true))), List.of())
                ))
        );

        List<Cine> resultado = UtilidadesCine.ejercicio1(cines);
        assertEquals(1, resultado.size());
        assertEquals("Cine B", resultado.get(0).getNombre());
    }

    @Test
    void testEjercicio2() {
        Sala sala1 = new Sala(1L, "Sala 1", List.of(new Asiento(1L, 1, 1, true), new Asiento(2L, 1, 2, true)), List.of());
        Sala sala2 = new Sala(2L, "Sala 2", List.of(new Asiento(3L, 1, 3, true)), List.of());
        Cine cine = new Cine(1L, "Cine X", "Direccion X", List.of(sala1, sala2));

        Map<Sala, Integer> resultado = UtilidadesCine.ejercicio2(cine);
        assertEquals(2, resultado.get(sala1));
        assertEquals(1, resultado.get(sala2));
    }

    @Test
    void testEjercicio3() {
        Pelicula peli1 = new Pelicula(1L, "Peli A", Genero.ACCION, 120, 8.5);
        Pelicula peli2 = new Pelicula(2L, "Peli B", Genero.COMEDIA, 90, 9.0);
        Sala sala = new Sala(1L, "Sala 1", List.of(), List.of(
                new Proyeccion(1L, peli1, LocalDateTime.now(), LocalDateTime.now().plusHours(2), null, List.of()),
                new Proyeccion(2L, peli2, LocalDateTime.now(), LocalDateTime.now().plusHours(1), null, List.of())
        ));
        Cine cine = new Cine(1L, "Cine Y", "Direccion Y", List.of(sala));

        Pelicula resultado = UtilidadesCine.ejercicio3(cine);
        assertEquals("Peli B", resultado.getTitulo());
    }

    @Test
    void testEjercicio4() {
        Proyeccion proy1 = new Proyeccion(1L, null, LocalDateTime.now(), LocalDateTime.now().plusMinutes(150), null, List.of());
        Proyeccion proy2 = new Proyeccion(2L, null, LocalDateTime.now(), LocalDateTime.now().plusMinutes(90), null, List.of());
        Sala sala = new Sala(1L, "Sala 1", List.of(), List.of(proy1, proy2));

        Map<Proyeccion, Long> resultado = UtilidadesCine.ejercicio4(sala);
        assertEquals(150 * 60, resultado.get(proy1));
        assertEquals(90 * 60, resultado.get(proy2));
    }

    @Test
    void testEjercicio5() {
        Entrada e1 = new Entrada(1L, null, null, 10.0);
        Entrada e2 = new Entrada(2L, null, null, 15.0);
        Proyeccion p1 = new Proyeccion(1L, null, null, null, null, List.of(e1, e2));
        Sala sala = new Sala(1L, "Sala 1", List.of(), List.of(p1));
        Cine cine = new Cine(1L, "Cine Z", "Direccion Z", List.of(sala));

        Double resultado = UtilidadesCine.ejercicio5(cine);
        assertEquals(25.0, resultado);
    }

    @Test
    void testEjercicio6() {
        Asiento asiento1 = new Asiento(1L, 1, 1, true);
        Asiento asiento2 = new Asiento(2L, 1, 2, false);
        Asiento asiento3 = new Asiento(2L, 1, 3, true);
        Asiento asiento4 = new Asiento(2L, 1, 4, true);
        Sala sala = new Sala(1L, "Sala 1", List.of(asiento1, asiento2, asiento3, asiento4), List.of());
        Entrada entrada1 = new Entrada(1L, null, asiento1, 10.0);
        Entrada entrada2 = new Entrada(2L, null, asiento2, 15.0);
        Proyeccion proy = new Proyeccion(1L, new Pelicula(1L, "Peli X", Genero.ACCION, 120, 7.5), null, null, sala, List.of(entrada1, entrada2));

        InformeProyeccion informe = UtilidadesCine.ejercicio6(proy);
        assertEquals(2, informe.getAsientosOcupados());
        assertEquals(2, informe.getAsientosDisponibles());
        assertEquals(25.0, informe.getRecaudacionSala());
        assertEquals(0.5, informe.getPorcentajeOcupacionSala());
        assertEquals(1, informe.getEntradasFraudulentas().size());
    }
}
