package modelos;

import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Escuderia {
    private Marca marca;
    private Coche coche;
    private Integer puntosRanking;
    private Integer posicionEnRanking;


}
