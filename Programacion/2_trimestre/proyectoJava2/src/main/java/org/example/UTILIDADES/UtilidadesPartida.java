package org.example.UTILIDADES;

import org.example.INTERFACES.IUtilidadesPartida;
import org.example.MODELOS.Jugador;
import org.example.MODELOS.Partida;
import org.example.MODELOS.Personaje;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class UtilidadesPartida implements IUtilidadesPartida {
    public void inicializarPartida(Partida partida, List<Jugador> participantes, List<Personaje> personajesDisponibles){
        Collections.shuffle(personajesDisponibles);
        Collections.shuffle(participantes);

        // ii
        Map<Jugador, Personaje> repartirPersonajes= new HashMap<>();
        for (Jugador j : participantes) {
            for (Personaje pD : personajesDisponibles) {
                if (j.getPersonajesFavoritos().contains(pD)){
                       repartirPersonajes.put(j, pD);
                       personajesDisponibles.remove(pD);
                } else {
                    repartirPersonajes.put(j, personajesDisponibles.getFirst());
                    personajesDisponibles.removeFirst();
                }
            }
        }

        // iii
        Map<Integer, Set<Jugador>> jugadoresPorEquipo = new HashMap<>();
        Set<Jugador> Equipo1 = new HashSet<>();
        Set<Jugador> Equipo2 = new HashSet<>();

        int jugadores = participantes.size();
        if (jugadores % 2 == 0){
            for (int i=0; i<jugadores; i++) {
                if (i<(jugadores/2)) {
                    Equipo1.add(participantes.get(i));
                } else {
                    Equipo2.add(participantes.get(i));
                }
            }
        }

        jugadoresPorEquipo.put(1, Equipo1);
        jugadoresPorEquipo.put(2, Equipo2);

        // iv
        partida.setInicioPartida(LocalDateTime.now());
    }


    public void finalizarPartida(Partida partida, Integer equipoVencedor) {
        // ii
        partida.setFinPartida(LocalDateTime.now());

        // iii
        partida.setDuracionPartida((int) Duration.between(partida.getFinPartida(), partida.getFinPartida()).getSeconds());

        // iv
        partida.setEquipoVencedor(equipoVencedor);

        //v
        Set<Jugador> jugadoresGanados = partida.getJugadoresPorEquipo().get(equipoVencedor);

        for (Jugador j : jugadoresGanados) {
            Personaje personajeElegido = partida.getElecciones().get(j);
            if (j.getPartidasGanadas().containsKey(personajeElegido)){
                j.getPartidasGanadas().put(personajeElegido, j.getPartidasGanadas().get(personajeElegido) + 1);
            } else {
                j.getPartidasGanadas().put(personajeElegido, 1);
            }
        }
    }
}
