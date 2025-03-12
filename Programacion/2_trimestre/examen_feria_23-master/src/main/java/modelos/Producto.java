package modelos;


import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {

    private String nombre;
    private Double precio;
    private TipoProducto producto;

}
