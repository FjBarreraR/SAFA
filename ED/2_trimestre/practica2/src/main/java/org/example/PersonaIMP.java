package org.example;

public class PersonaIMP implements Persona {
    // Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;
    private String dni;

    // Constructor
    public PersonaIMP(String nom, String ap1, String ap2, String dni, Integer ed) {
        nombre = nom;
        apellido1 = ap1;
        apellido2 = ap2;
        edad = ed;
        this.dni = dni;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String ap1) {
        apellido1 = ap1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String ap2) {
        apellido2 = ap2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer ed) {
        edad = ed;
    }

    public String getDni() {
        return dni;
    }

    // To String
    public String toString(){
        return nombre + " " + apellido1 + " " + apellido2 + ", " + dni + ", " + edad;
    }
}
