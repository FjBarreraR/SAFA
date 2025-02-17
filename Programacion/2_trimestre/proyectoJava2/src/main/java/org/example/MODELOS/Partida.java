package org.example.MODELOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Partida {
    private Integer id;
    private String codigo;
    private Double server;
    private Map<Jugador, Personaje> elecciones;
    private Map<Integer, Set<Jugador>> jugadoresPorEquipo;
    private LocalDateTime inicioPartida;
    private LocalDateTime finPartida;
    private Integer duracionPartida;
    private Integer equipoVencedor;
}
