package org.example.MODELOS;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Colegio {
    private Integer identificador;
    private String nombre;
    private String direccion;
    private LocalDate fechaFundacion;
    private List <Alumno> alumnos;

    public Colegio() {
    }

    public Colegio(Integer identificador, String nombre, String direccion, LocalDate fechaFundacion, List<Alumno> alumnos) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaFundacion = fechaFundacion;
        this.alumnos = alumnos;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Colegio colegio = (Colegio) o;
        return Objects.equals(identificador, colegio.identificador) && Objects.equals(nombre, colegio.nombre) && Objects.equals(direccion, colegio.direccion) && Objects.equals(fechaFundacion, colegio.fechaFundacion) && Objects.equals(alumnos, colegio.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, nombre, direccion, fechaFundacion, alumnos);
    }

    @Override
    public String toString() {
        return "Colegio{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", alumnos=" + alumnos +
                '}';
    }
}
