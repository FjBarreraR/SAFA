package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entrada {
    private Long id;
    private Proyeccion proyeccion;
    private Asiento asiento;
    private Double precio;
}
