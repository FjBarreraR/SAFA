package eje1;

import java.util.List;

public class Profesor extends Persona {
    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono) {
        super(numeroDeTelefono);
    }

    public void printInformacionPersonal() {
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
    }

    public void printTodaLaInformacion() {
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + this.numeroDeTelefono);
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}
