package org.example.MODELOS;

import java.util.Objects;

public class Habilidad {
    private Integer id;
    private String nombre;
    private Double danyoBase;
    private Double danyo;
    private Double costeMana;
    private TipoHabilidad tipoHabilidad;

    public Habilidad() {
    }

    public Habilidad(Integer id, String nombre, Double danyoBase, Double danyo, Double costeMana, TipoHabilidad tipoHabilidad) {
        this.id = id;
        this.nombre = nombre;
        this.danyoBase = danyoBase;
        this.danyo = danyo;
        this.costeMana = costeMana;
        this.tipoHabilidad = tipoHabilidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDanyoBase() {
        return danyoBase;
    }

    public void setDanyoBase(Double danyoBase) {
        this.danyoBase = danyoBase;
    }

    public Double getDanyo() {
        return danyo;
    }

    public void setDanyo(Double danyo) {
        this.danyo = danyo;
    }

    public Double getCosteMana() {
        return costeMana;
    }

    public void setCosteMana(Double costeMana) {
        this.costeMana = costeMana;
    }

    public TipoHabilidad getTipoHabilidad() {
        return tipoHabilidad;
    }

    public void setTipoHabilidad(TipoHabilidad tipoHabilidad) {
        this.tipoHabilidad = tipoHabilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Habilidad habilidad = (Habilidad) o;
        return Objects.equals(id, habilidad.id) && Objects.equals(nombre, habilidad.nombre) && Objects.equals(danyoBase, habilidad.danyoBase) && Objects.equals(danyo, habilidad.danyo) && Objects.equals(costeMana, habilidad.costeMana) && tipoHabilidad == habilidad.tipoHabilidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, danyoBase, danyo, costeMana, tipoHabilidad);
    }

    @Override
    public String toString() {
        return "Habilidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", danyoBase=" + danyoBase +
                ", danyo=" + danyo +
                ", costeMana=" + costeMana +
                ", tipoHabilidad=" + tipoHabilidad +
                '}';
    }
}
