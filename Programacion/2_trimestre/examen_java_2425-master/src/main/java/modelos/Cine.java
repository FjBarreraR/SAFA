package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cine {
    private Long id;
    private String nombre;
    private String direccion;
    private List<Sala> salas;
}