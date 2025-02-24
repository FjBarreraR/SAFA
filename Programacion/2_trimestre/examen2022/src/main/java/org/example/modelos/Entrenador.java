package org.example.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Entrenador {
    private Integer id;
    private String nombre;
    private String apellidos;
    private LocalDate nacimiento;
    private List<TipoPokemon> tiposPreferidos;
    private List<Pokemon> equipoPokemon;
}
