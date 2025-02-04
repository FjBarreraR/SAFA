package modelos;

import lombok.*;

import java.time.LocalDate;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Caseta {
    private String nombre;
    private LocalDate fechaFundacion;
    private Integer aforo;
    private Catering catering;
    private String ubicacion;
    private Integer numCaseta;

}
