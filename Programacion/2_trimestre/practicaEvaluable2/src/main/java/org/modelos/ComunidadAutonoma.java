package com.sl.modelos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"ciudades", "capital", "pais"})
@ToString(exclude = {"ciudades", "capital", "pais"})
@AllArgsConstructor
@NoArgsConstructor
public class ComunidadAutonoma {
    private String nombre;
    private Pais pais;
    private List<Ciudad> ciudades;
    private Long poblacion;
    private Ciudad capital;
}
