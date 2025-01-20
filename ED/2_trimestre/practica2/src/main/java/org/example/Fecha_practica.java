package org.example;

import java.util.Scanner;

public class Fecha_practica implements Fecha {

    // Atributos
    private Integer dia;
    private Integer mes;
    private Integer anyo;

    // Constructor
    public Fecha_practica(Integer dia, Integer mes, Integer anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    // Métodos
    // Get

    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAnyo() {
        return anyo;
    }

    // To String
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAnyo();
    }
}
