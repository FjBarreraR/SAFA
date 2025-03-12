package modelos;

import lombok.*;
import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Feria {
    private List<Atraccion> atracciones;
    private List<Caseta> casetas;
    private List<Asistente> asistentes;
}
