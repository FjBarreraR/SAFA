package org.example.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Stats {
    private Integer id;
    private Integer ps;
    private Integer at;
    private Integer df;
    private Integer spa;
    private Integer spdf;
    private Integer spd;
}
