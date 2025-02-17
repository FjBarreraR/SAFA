package org.example.UTILIDADES;

import org.example.INTERFACES.IUtilidadesPartida;
import org.example.MODELOS.Jugador;
import org.example.MODELOS.Partida;
import org.example.MODELOS.Personaje;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesPartida implements IUtilidadesPartida {
    public void inicializarPartida(Partida partida, List<Jugador> participantes, List<Personaje> personajesDisponibles){
        Map<Jugador, Personaje> repartirPersonajes= new HashMap<>();
        for (Jugador j : participantes) {
            for (Personaje pD : personajesDisponibles) {
                if (j.getPersonajesFavoritos().contains(pD)){
                       repartirPersonajes.put(j, pD);
                } else {
                    repartirPersonajes.put(j, pD);
                }
            }
        }
    }


    public void finalizarPartida(Partida partida, Integer equipoVencedor) {

    }
}
