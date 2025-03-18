package utilidades;


import modelos.*;

import java.time.Duration;
import java.time.Period;
import java.util.*;

public class UtilidadesCine {



    public static List<Cine> ejercicio1(List<Cine> cines){
        List<Cine> solucion = new ArrayList<>();
        for (Cine cine : cines) {
            for (Sala sala : cine.getSalas()) {
                if (sala.getAsientos().size() > 20){
                    solucion.add(cine);
                }
            }
        }
        return solucion;
    }



    public static Map<Sala, Integer> ejercicio2(Cine cine){
        Map<Sala, Integer> solucion = new HashMap<>();
        for (Sala sala : cine.getSalas()) {
            if (!solucion.containsKey(sala)){
                solucion.put(sala, sala.getAsientos().size());
            }
        }
        return solucion;
    }


    public static Pelicula ejercicio3(Cine cine){
        Pelicula peliculaFinal = null;
        Double ratingPelicula = 0.0;
        for (Sala sala : cine.getSalas()){
            for (Proyeccion p : sala.getFunciones()){
                if (p.getPelicula().getRating() > ratingPelicula){
                    ratingPelicula = p.getPelicula().getRating();
                    peliculaFinal = p.getPelicula();
                }
            }
        }
        return peliculaFinal;
    }



    public static Map<Proyeccion,Long> ejercicio4(Sala sala){
        Map<Proyeccion,Long> solucion = new HashMap<>();
        for (Proyeccion p : sala.getFunciones()){
            Long periodo = Duration.between(p.getFechaInicio(), p.getFechaFin()).getSeconds();
            solucion.put(p, periodo);
        }
        return solucion;
    }



    public static Double ejercicio5(Cine cine){
        Double recaudacion = 0.0;
        for (Sala sala : cine.getSalas()){
            for (Proyeccion p : sala.getFunciones()){
                for (Entrada entrada : p.getEntradas()){
                    recaudacion += entrada.getPrecio();
                }
            }
        }
        return recaudacion;
    }



    public static InformeProyeccion ejercicio6(Proyeccion proyeccion){
        InformeProyeccion solucion = new InformeProyeccion();
        // Apartado 1
        solucion.setPelicula(proyeccion.getPelicula());
        // Apartado 2
        solucion.setAsientosOcupados(proyeccion.getEntradas().size());
        // Apartado 3
        solucion.setAsientosDisponibles(proyeccion.getSala().getAsientos().size() - proyeccion.getEntradas().size());
        // Apartado 4
        Double recaudacion = 0.0;
        for (Entrada entrada : proyeccion.getEntradas()){
            recaudacion += entrada.getPrecio();
        }
        solucion.setRecaudacionSala(recaudacion);
        // Apartado 5
        solucion.setPorcentajeOcupacionSala(((double)proyeccion.getEntradas().size() / (double)proyeccion.getSala().getAsientos().size()));
        // Apartado 6
        List<Entrada> entradasFraudulentas = new ArrayList<>();
        for (Entrada entrada : proyeccion.getEntradas()){
            if (!entrada.getAsiento().isDisponible()){
                entradasFraudulentas.add(entrada);
            }
        }
        solucion.setEntradasFraudulentas(entradasFraudulentas);
        //Apartado 7
        Map<Asiento, Boolean> disponibilidadAsientos = new HashMap<>();
        for (Asiento asiento : proyeccion.getSala().getAsientos()){
            if (!disponibilidadAsientos.containsKey(asiento)){
                if (!asiento.isDisponible()){
                    disponibilidadAsientos.put(asiento, true);
                } else {
                    disponibilidadAsientos.put(asiento, false);
                }
            }
        }
        solucion.setDisponibilidadAsientos(disponibilidadAsientos);

        return solucion;
    }








}
