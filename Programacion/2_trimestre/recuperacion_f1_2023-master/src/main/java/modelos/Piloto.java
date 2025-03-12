package modelos;

import lombok.*;

import java.time.LocalDate;


@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Piloto {
    private String nombre;
    private Escuderia escuderia;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String pais;
    private Integer puntosRanking;
    private Integer posicionEnRanking;


}
