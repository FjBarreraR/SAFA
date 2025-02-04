package modelos;

import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Catering {
    private String nombre;
    private List<Producto> productos;
}
