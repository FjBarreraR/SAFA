package modelos;

import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Coche {
    private Double velocidadPunta;
    private Double aceleracion;
    private Double tiempoMedioParadaBoxes;
    private Double probabilidadAveria;

    public Double puntuacionCoche(){
        return this.velocidadPunta + this.aceleracion - this.tiempoMedioParadaBoxes - this.probabilidadAveria;
    }


}
