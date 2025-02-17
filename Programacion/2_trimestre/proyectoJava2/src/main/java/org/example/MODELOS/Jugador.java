package org.example.MODELOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Jugador {
    private Integer identificador;
    private String nickname;
    private Set<Personaje> personajesFavoritos;
    private Map<Personaje, Integer> partidasGanadas;
}
