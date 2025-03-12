package modelos;

import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Atraccion {
    private String nombre;
    private Double precioPorViaje;
}
