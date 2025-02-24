package org.example.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class Movimiento {
    private Integer id;
    private String nombre;
    private TipoPokemon tipo;
    private TipoAtaque tipoAtaque;
    private Integer potencia;
}
