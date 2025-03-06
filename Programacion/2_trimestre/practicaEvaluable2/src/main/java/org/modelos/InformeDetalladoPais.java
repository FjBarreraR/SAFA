package com.sl.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InformeDetalladoPais {
    private Map<ComunidadAutonoma,Long> extensionComunidades;
    private Map<ComunidadAutonoma,Long> poblacionComunidades;
    private ComunidadAutonoma comunidadMasGrande;
    private ComunidadAutonoma comunidadMasPoblada;
    private ComunidadAutonoma comunidadDeLaCapital;

}
