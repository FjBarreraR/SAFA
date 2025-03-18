package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proyeccion {
    private Long id;
    private Pelicula pelicula;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Sala sala;
    private List<Entrada> entradas;
}
