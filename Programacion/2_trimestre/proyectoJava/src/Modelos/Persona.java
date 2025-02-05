package Modelos;

import java.util.Objects;

public class Persona {
    private Integer identificador;
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(Integer identificador, String dni, String nombre, String apellido, String direccion) {
        this.identificador = identificador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Persona() {
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(identificador, persona.identificador) && Objects.equals(dni, persona.dni) && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(direccion, persona.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, dni, nombre, apellido, direccion);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "identificador=" + identificador +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
