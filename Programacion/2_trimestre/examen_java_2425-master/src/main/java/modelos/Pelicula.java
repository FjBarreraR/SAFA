package modelos;

import enumerados.Genero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pelicula {
    private Long id;
    private String titulo;
    private Genero genero;
    private int duracionMinutos;
    private Double rating;
}
