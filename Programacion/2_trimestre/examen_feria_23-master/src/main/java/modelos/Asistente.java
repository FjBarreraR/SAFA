package modelos;

import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Asistente {
    private String nombre;
    private String apellidos;
    private String dni;
    private TipoAsistente tipoAsistente;
    private LocalDate fechaNacimiento;
    private List<Caseta> casetasMiembro;
}
