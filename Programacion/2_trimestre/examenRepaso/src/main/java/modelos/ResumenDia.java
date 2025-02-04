package modelos;

import lombok.*;

import java.util.Map;


@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResumenDia {
    private Asistente asistente;
    private Map<Producto, Integer> cantidadProductos;
    private Map<TipoProducto, Double> totalGastadoPorTipoProducto;
    private Map<Atraccion, Integer> viajesPorAtraccion;
    private Map<Atraccion ,Double> totalGastadoPorAtraccion;
    private Double totalGastado;
}
