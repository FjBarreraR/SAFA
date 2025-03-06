package com.sl.modelos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"paises"})
@ToString(exclude = {"paises"})
@AllArgsConstructor
@NoArgsConstructor
public class Continente {
    private String nombre;
    private List<Pais> paises;
}
