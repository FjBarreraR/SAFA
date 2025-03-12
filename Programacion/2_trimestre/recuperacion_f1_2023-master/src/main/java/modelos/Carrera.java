package modelos;


import lombok.*;

import java.util.Map;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Carrera {
    private String nombreCircuito;
    private String ciudad;
    private Map<Integer, Piloto> posiciones;
    private Map<Integer, Double> puntosPorPosicion;
}
