package modelos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sala {
    private Long id;
    private String nombre;
    private List<Asiento> asientos;
    private List<Proyeccion> funciones;
}
