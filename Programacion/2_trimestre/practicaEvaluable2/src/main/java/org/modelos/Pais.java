package com.sl.modelos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"comunidadesAutonomas", "paisesVecinos"})
@ToString(exclude = {"comunidadesAutonomas", "paisesVecinos"})
@AllArgsConstructor
@NoArgsConstructor
public class Pais {
    private String nombre;
    private Ciudad capital;
    private List<ComunidadAutonoma> comunidadesAutonomas;
    private List<Pais> paisesVecinos;

}
