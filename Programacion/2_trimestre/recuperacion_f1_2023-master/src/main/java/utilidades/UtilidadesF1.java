package utilidades;

import modelos.*;

import java.util.*;
import java.util.stream.Collectors;

public class UtilidadesF1 {

    public UtilidadesF1() {
    }





    /**
     * Devuelve la lista de pilotos cuya escudería tiene la marca que se pasa como parámetro.
     *
     * @param pilotos
     * @param marca
     * @return
     */
    public static List<Piloto> getPilotosPorMarcaEscuderia(List<Piloto> pilotos, Marca marca){
        List<Piloto> pilotoSolucion = new ArrayList<>();

        for (Piloto p : pilotos){
            if (p.getEscuderia().getMarca().equals(marca)){
                pilotoSolucion.add(p);
            }
        }
        return pilotoSolucion;
    }


    /**
     * Devuelve los pilotos agrupados por escudería
     *
     * @param pilotos
     * @return
     */
    public static Map<Escuderia, List<Piloto>>  pilotosPorEscuderia(List<Piloto> pilotos){
//        Map<Escuderia, List<Piloto>> pilotosPorEscuderiaSolucion = new HashMap<>();
//
//        for (Piloto p : pilotos){
//            if (pilotosPorEscuderiaSolucion.containsKey(p.getEscuderia())){
//                pilotosPorEscuderiaSolucion.get(p.getEscuderia()).add(p);
//            }else{
//                List<Piloto> pilotosEscuderia = new ArrayList<>();
//                pilotosEscuderia.add(p);
//                pilotosPorEscuderiaSolucion.put(p.getEscuderia(), pilotosEscuderia);
//            }
//        }
//
//        return pilotosPorEscuderiaSolucion;


        // Con JAVA 8
        return pilotos.stream().collect(Collectors.groupingBy(Piloto::getEscuderia));
    }


    /**
     * Devuelvo los coches cuya suma de puntuacion -> (velocidadPunta + aceleracion - tiempoMedioParadaBoxes - probabilidadAveria )
     * es mayor a la que se pasa , ORDENADOR POR PUNTUACIÓN DE MAYOR A MENOR
     *
     * @param coches
     * @param minimoPuntuacionRequerida
     * @return
     */
    public static List<Coche> topMejoresCoches(List<Coche> coches, Double minimoPuntuacionRequerida){
        List<Coche> cochesSolucion = new ArrayList<>();

        for (Coche c : coches){
            if (c.puntuacionCoche() > minimoPuntuacionRequerida){
                cochesSolucion.add(c);
            }
        }

        cochesSolucion.sort(Comparator.comparing(Coche::puntuacionCoche).reversed());


        return cochesSolucion;
    }




    /**
     * Devuelve el porcentaje de victoria de un piloto , que se calcula con la siguiente fórmula:
     *
     * -> puntuación total coche del su escuderia  (velocidadPunta + aceleracion - tiempoMedioParadaBoxes - probabilidadAveria)
     * -> +
     * -> puntosRanking de su escuderia
     * -> +
     * -> puntosRanking piloto
     *
     * @param piloto
     * @return
     */
    public static Double porcentajeVictoriaPiloto(Piloto piloto){
        Double puntuacionTotal = (
                piloto.getEscuderia().getCoche().getAceleracion()
                        + piloto.getEscuderia().getCoche().getVelocidadPunta()
                        - piloto.getEscuderia().getCoche().getTiempoMedioParadaBoxes()
                        - piloto.getEscuderia().getCoche().getProbabilidadAveria())
                + piloto.getEscuderia().getPuntosRanking()
                + piloto.getPuntosRanking();

        return puntuacionTotal;
    }


    /**
     * Devuelve el piloto con mayor porcentaje de victoria de los dos que se pasa,
     * el porcentaje de victoria se calcula del ejercicio anterior.
     *
     */
     public static Piloto getMejorPiloto(Piloto piloto1, Piloto piloto2){
         Piloto mejorPiloto = null;

        if (porcentajeVictoriaPiloto(piloto1) > porcentajeVictoriaPiloto(piloto2)){
            mejorPiloto = piloto1;
        } else {
            mejorPiloto = piloto2;
        }

        return mejorPiloto;
    }


    /**
     * Devuelve el mapa de las posiciones obtenidas por las escuderías del ranking de la temporada que se pasa como parámetro,
     * teniendo en cuenta que sólo hay un ranking por temporada.
     *
     * Las claves del mapa son el orden obtenido de mayor a menor , tras ordenar las temporadas del ranking por su "posicionEnRanking"
     *
     * @param rankingEscuderias
     * @param temporada
     * @return
     */
    public static Map<Integer,Escuderia> getRankigPorEscuderias(List<RankingEscuderias> rankingEscuderias, Integer temporada){
        Map<Integer, Escuderia> rankigPorEscuderias = new HashMap<>();

        for (RankingEscuderias r : rankingEscuderias){
            if (r.getTemporada().equals(temporada)){
                for (Escuderia e : r.getEscuderias()){
                    rankigPorEscuderias.put(e.getPosicionEnRanking(), e);
                }
            }
        }

        return rankigPorEscuderias;

    }


    /**
     * Devuelve un mapa de los pilotos con la suma de puntos que tengan de las carreras que se pasa como parámetro.
     * Los puntos se obtienen sacando la posición en la que queda el piloto del mapa de "posiciones" y de los puntos
     * que correspondan a esa posición en el mapa "puntosPorPosicion"
     *
     * @param carreras
     * @return
     */
    public static Map<Piloto, Double> totalPuntuacion(List<Carrera> carreras){
        Map<Piloto, Double> puntuaciones = new HashMap<>();

        for (Carrera c : carreras){
            for(Integer posicion : c.getPosiciones().keySet()){
                puntuaciones.put(c.getPosiciones().get(posicion), c.getPuntosPorPosicion().get(posicion));
            }
        }

        return puntuaciones;
        
    }

}
