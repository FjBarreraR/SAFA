package modelos;

import lombok.*;

import java.util.List;


@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RankingEscuderias {
    private Integer temporada;
    private List<Escuderia> escuderias;
}
