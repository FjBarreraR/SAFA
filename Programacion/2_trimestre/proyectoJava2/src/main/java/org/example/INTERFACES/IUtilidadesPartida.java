package org.example.INTERFACES;

import org.example.MODELOS.Jugador;
import org.example.MODELOS.Partida;
import org.example.MODELOS.Personaje;

import java.util.List;

public interface IUtilidadesPartida {
    public void inicializarPartida(Partida partida, List<Jugador> participantes, List<Personaje> personajesDisponibles);
    public void finalizarPartida(Partida partida, Integer equipoVencedor);
}
