package org.example;

public class Main {
    public static void main(String[] args) {
        // Para llamar al metodo de otro fichero
        // NombreInterface nombre = new nombreClase();
        expli e = new explicacion(2,3);
        e.setX(26);
        e.setY(7);
        System.out.println(e);
    }
}