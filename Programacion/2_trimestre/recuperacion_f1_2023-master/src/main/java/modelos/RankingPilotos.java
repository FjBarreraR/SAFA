package modelos;

import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RankingPilotos {
    private Integer temporada;
    private List<Piloto> pilotos;
}
