package org.example;

public class Main {
    public static void main(String[] args) {
        Persona pe = new PersonaIMP("Fran", "Barrera", "Román", "20502548A", 20);
        Fecha f = new Fecha_practica(16, 1, 2025);
        seg_practica segp= new segunda_practica("CD6969", "Sevilla", 599.69, 69, 126, f, pe);
        System.out.println(segp);
    }
}