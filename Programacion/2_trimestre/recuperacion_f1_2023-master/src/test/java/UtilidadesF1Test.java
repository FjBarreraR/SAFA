import modelos.*;
import org.junit.jupiter.api.Test;
import utilidades.UtilidadesF1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UtilidadesF1Test {



    @Test
    public void getPilotosPorMarcaEscuderia() {
        Coche coche1 = new Coche(350.0, 5.0, 20.0, 0.1);
        Coche coche2 = new Coche(330.0, 4.5, 22.0, 0.05);

        Escuderia escuderia1 = new Escuderia(Marca.Mercedes, coche1, 800, 1);
        Escuderia escuderia2 = new Escuderia(Marca.Red_Bull, coche2, 600, 2);

        Piloto piloto1 = new Piloto("Lewis", escuderia1, "Hamilton", LocalDate.of(1985, 1, 7), "Reino Unido", 0, 0);
        Piloto piloto2 = new Piloto("Max", escuderia2, "Verstappen", LocalDate.of(1997, 9, 30), "Países Bajos", 0, 0);
        Piloto piloto3 = new Piloto("Valtteri", escuderia1, "Bottas", LocalDate.of(1989, 8, 28), "Finlandia", 0, 0);
        Piloto piloto4 = new Piloto("Sergio", escuderia2, "Pérez", LocalDate.of(1990, 1, 26), "México", 0, 0);

        List<Piloto> pilotos = new ArrayList<>();
        pilotos.add(piloto1);
        pilotos.add(piloto2);
        pilotos.add(piloto3);
        pilotos.add(piloto4);

        List<Piloto> pilotosPorMarca = UtilidadesF1.getPilotosPorMarcaEscuderia(pilotos, Marca.Mercedes);

        // Verificar que la lista de pilotos por marca es la esperada
        assertEquals(2, pilotosPorMarca.size());
        assertTrue(pilotosPorMarca.contains(piloto1));
        assertTrue(pilotosPorMarca.contains(piloto3));
    }


    @Test
    public void pilotosPorEscuderia() {
        Coche coche1 = new Coche(350.0, 5.0, 20.0, 0.1);
        Coche coche2 = new Coche(330.0, 4.5, 22.0, 0.05);

        Escuderia escuderia1 = new Escuderia(Marca.Mercedes, coche1, 800, 1);
        Escuderia escuderia2 = new Escuderia(Marca.Red_Bull, coche2, 600, 2);

        Piloto piloto1 = new Piloto("Lewis", escuderia1, "Hamilton", LocalDate.of(1985, 1, 7), "Reino Unido", 0, 0);
        Piloto piloto2 = new Piloto("Max", escuderia2, "Verstappen", LocalDate.of(1997, 9, 30), "Países Bajos", 0, 0);
        Piloto piloto3 = new Piloto("Valtteri", escuderia1, "Bottas", LocalDate.of(1989, 8, 28), "Finlandia", 0, 0);
        Piloto piloto4 = new Piloto("Sergio", escuderia2, "Pérez", LocalDate.of(1990, 1, 26), "México", 0, 0);

        List<Piloto> pilotos = new ArrayList<>();
        pilotos.add(piloto1);
        pilotos.add(piloto2);
        pilotos.add(piloto3);
        pilotos.add(piloto4);

        Map<Escuderia, List<Piloto>> pilotosPorEscuderia = UtilidadesF1.pilotosPorEscuderia(pilotos);

        // Verificar que la cantidad de escuderías es la esperada
        assertEquals(2, pilotosPorEscuderia.size());

        // Verificar que los pilotos están agrupados correctamente por escudería
        assertTrue(pilotosPorEscuderia.containsKey(escuderia1));
        assertTrue(pilotosPorEscuderia.containsKey(escuderia2));

        List<Piloto> pilotosEscuderia1 = pilotosPorEscuderia.get(escuderia1);
        List<Piloto> pilotosEscuderia2 = pilotosPorEscuderia.get(escuderia2);

        assertEquals(2, pilotosEscuderia1.size());
        assertTrue(pilotosEscuderia1.contains(piloto1));
        assertTrue(pilotosEscuderia1.contains(piloto3));

        assertEquals(2, pilotosEscuderia2.size());
        assertTrue(pilotosEscuderia2.contains(piloto2));
        assertTrue(pilotosEscuderia2.contains(piloto4));
    }

    @Test
    public void testTopMejoresCoches() {
        List<Coche> coches = new ArrayList<>();
        Coche coche1 = new Coche(390.0, 4.2, 12.0, 0.05);
        Coche coche2 = new Coche(400.0, 4.0, 11.5, 0.06);
        Coche coche3 = new Coche(345.0, 4.5, 12.5, 0.04);
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);

        Double minimoPuntuacionRequerida = 8.0;
        List<Coche> cochesTop = UtilidadesF1.topMejoresCoches(coches, minimoPuntuacionRequerida);

        List<Coche> expectedCochesTop = new ArrayList<>();
        expectedCochesTop.add(coche2);
        expectedCochesTop.add(coche1);
        expectedCochesTop.add(coche3);

        assertEquals(expectedCochesTop, cochesTop);
    }


    @Test
    public void testPorcentajeVictoriaPiloto() {
        Escuderia escuderia = new Escuderia(Marca.Mercedes, new Coche(350.0, 4.2, 12.0, 0.05), 120, 1);
        Piloto piloto = new Piloto("Lewis", escuderia, "Hamilton", LocalDate.of(1985, 1, 7), "Reino Unido", 90, 2);

        Double porcentajeVictoria = UtilidadesF1.porcentajeVictoriaPiloto(piloto);

        Double expectedPorcentaje = 350.0 + 4.2 - 12.0 - 0.05 + 120 + 90;
        assertEquals(expectedPorcentaje, porcentajeVictoria, 0.001);
    }

    @Test
    public void testGetMejorPiloto() {
        Escuderia escuderia1 = new Escuderia(Marca.Mercedes, new Coche(350.0, 4.2, 12.0, 0.05), 120, 1);
        Escuderia escuderia2 = new Escuderia(Marca.Red_Bull, new Coche(355.0, 4.0, 11.5, 0.06), 110, 2);
        Piloto piloto1 = new Piloto("Lewis", escuderia1, "Hamilton", LocalDate.of(1985, 1, 7), "Reino Unido", 90, 2);
        Piloto piloto2 = new Piloto("Max", escuderia2, "Verstappen", LocalDate.of(1997, 9, 30), "Países Bajos", 150, 1);

        Piloto mejorPiloto = UtilidadesF1.getMejorPiloto(piloto1, piloto2);

       assertEquals(piloto2, mejorPiloto);
    }


    @Test
    public void getRankigPorEscuderias() {
        Coche coche1 = new Coche(350.0, 5.0, 20.0, 0.1);
        Coche coche2 = new Coche(330.0, 4.5, 22.0, 0.05);
        Coche coche3 = new Coche(340.0, 5.5, 19.0, 0.2);

        Escuderia mercedes = new Escuderia(Marca.Mercedes, coche1, 800, 1);
        Escuderia redbull = new Escuderia(Marca.Red_Bull, coche2, 600, 2);
        Escuderia ferrari = new Escuderia(Marca.Ferrari, coche3, 400, 3);

        List<Escuderia> escuderias2021 = new ArrayList<>();
        escuderias2021.add(mercedes);
        escuderias2021.add(redbull);
        escuderias2021.add(ferrari);

        List<Escuderia> escuderias2022 = new ArrayList<>();
        escuderias2022.add(redbull);
        escuderias2022.add(ferrari);


        RankingEscuderias ranking2021 = new RankingEscuderias(2021, escuderias2021);
        RankingEscuderias ranking2022 = new RankingEscuderias(2022, escuderias2022);

        List<RankingEscuderias> rankingEscuderias = new ArrayList<>();
        rankingEscuderias.add(ranking2021);
        rankingEscuderias.add(ranking2022);

        Integer temporada = 2021;

        Map<Integer, Escuderia> rankingPorEscuderias = UtilidadesF1.getRankigPorEscuderias(rankingEscuderias, temporada);

        // Verificar que el mapa de ranking por escuderías es el esperado
        assertEquals(3, rankingPorEscuderias.size());
        assertEquals(mercedes, rankingPorEscuderias.get(1));
        assertEquals(redbull, rankingPorEscuderias.get(2));
        assertEquals(ferrari, rankingPorEscuderias.get(3));
    }


    @Test
    public void totalPuntuacion() {
        Coche coche1 = new Coche(350.0, 5.0, 20.0, 0.1);
        Coche coche2 = new Coche(330.0, 4.5, 22.0, 0.05);

        Escuderia escuderia1 = new Escuderia(Marca.Mercedes, coche1, 800, 1);
        Escuderia escuderia2 = new Escuderia(Marca.Red_Bull, coche2, 600, 2);

        Piloto piloto1 = new Piloto("Lewis", escuderia1, "Hamilton", LocalDate.of(1985, 1, 7), "Reino Unido", 0, 0);
        Piloto piloto2 = new Piloto("Max", escuderia2, "Verstappen", LocalDate.of(1997, 9, 30), "Países Bajos", 0, 0);

        Map<Integer, Double> puntosPorPosicion = new HashMap<>();
        puntosPorPosicion.put(1, 25.0);
        puntosPorPosicion.put(2, 18.0);
        puntosPorPosicion.put(3, 15.0);
        puntosPorPosicion.put(4, 12.0);
        puntosPorPosicion.put(5, 10.0);

        Map<Integer, Piloto> posiciones = new HashMap<>();
        posiciones.put(1, piloto1);
        posiciones.put(2, piloto2);

        Carrera carrera1 = new Carrera("Montecarlo", "Mónaco", posiciones, puntosPorPosicion);

        List<Carrera> carreras = new ArrayList<>();
        carreras.add(carrera1);

        Map<Piloto, Double> totalPuntuacion = UtilidadesF1.totalPuntuacion(carreras);

        // Verificar que el mapa de total de puntuación es el esperado
        assertEquals(2, totalPuntuacion.size());
        assertEquals(25.0, totalPuntuacion.get(piloto1));
        assertEquals(18.0, totalPuntuacion.get(piloto2));
    }

}
