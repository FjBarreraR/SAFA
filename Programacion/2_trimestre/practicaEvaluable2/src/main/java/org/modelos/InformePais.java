package com.sl.modelos;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"pais"})
@ToString(exclude = {"pais"})
@AllArgsConstructor
@NoArgsConstructor
public class InformePais {
    private  Pais pais;
    private  Long totalHabitantesPais;
    private Integer totalComunidadesAutonomasPais;
    private Integer totalCiudadesPais;

}
