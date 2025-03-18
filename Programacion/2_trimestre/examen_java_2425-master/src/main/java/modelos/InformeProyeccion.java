package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformeProyeccion {
    private Pelicula pelicula;
    private Double recaudacionSala;
    private Integer asientosOcupados;
    private Integer asientosDisponibles;
    private Double porcentajeOcupacionSala;
    private List<Entrada> entradasFraudulentas;
    private Map<Asiento, Boolean> disponibilidadAsientos;

}
