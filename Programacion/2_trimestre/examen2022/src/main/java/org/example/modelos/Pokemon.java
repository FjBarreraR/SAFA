package org.example.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pokemon {
    private Integer numPokedex;
    private Integer generacion;
    private String nombre;
    private Integer nivel;
    private List<TipoPokemon> tipos;
    private Stats stats;
    private List<LineaEvolutiva> linenaEvolutiva;
    private List<Movimiento> movimientos;
}
