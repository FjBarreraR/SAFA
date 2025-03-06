package com.sl.modelos;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"comunidadAutonoma", "pais"})
@ToString(exclude = {"comunidadAutonoma", "pais"})
@AllArgsConstructor
@NoArgsConstructor
public class Ciudad {
    private String nombre;
    private Long poblacion;
    private ComunidadAutonoma comunidadAutonoma;
    private Pais pais;
    private Long extension;
}
