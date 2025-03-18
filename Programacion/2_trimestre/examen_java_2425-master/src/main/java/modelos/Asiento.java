package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asiento {
    private Long id;
    private Integer fila;
    private Integer butaca;
    private boolean disponible;
}
