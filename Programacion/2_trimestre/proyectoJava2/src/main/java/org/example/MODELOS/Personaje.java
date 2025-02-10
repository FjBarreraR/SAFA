package org.example.MODELOS;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Personaje {
    private Integer id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCreacion;
    private Integer nivel;
    private Double vidaBase;
    private Double manaBase;
    private Double defensaBase;
    private Double defensa;
    private Double ataqueBase;
    private Double ataque;
    private Double vida;
    private Double mana;
    private Region region;
    private List<Habilidad> habilidades;
    private List<Item> equipamiento;
    private Escalabilidad escalabilidad;

    public Personaje() {
    }

    public Personaje(Integer id, String nombre, String descripcion, LocalDate fechaCreacion, Integer nivel, Double vidaBase, Double manaBase, Double defensaBase, Double defensa, Double ataqueBase, Double ataque, Double vida, Double mana, Region region, List<Habilidad> habilidades, List<Item> equipamiento, Escalabilidad escalabilidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.nivel = nivel;
        this.vidaBase = vidaBase;
        this.manaBase = manaBase;
        this.defensaBase = defensaBase;
        this.defensa = defensa;
        this.ataqueBase = ataqueBase;
        this.ataque = ataque;
        this.vida = vida;
        this.mana = mana;
        this.region = region;
        this.habilidades = habilidades;
        this.equipamiento = equipamiento;
        this.escalabilidad = escalabilidad;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(Double vidaBase) {
        this.vidaBase = vidaBase;
    }

    public Double getManaBase() {
        return manaBase;
    }

    public void setManaBase(Double manaBase) {
        this.manaBase = manaBase;
    }

    public Double getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(Double defensaBase) {
        this.defensaBase = defensaBase;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }

    public Double getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(Double ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public javax.swing.plaf.synth.Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Item> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<Item> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public Escalabilidad getEscalabilidad() {
        return escalabilidad;
    }

    public void setEscalabilidad(Escalabilidad escalabilidad) {
        this.escalabilidad = escalabilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id) && Objects.equals(nombre, personaje.nombre) && Objects.equals(descripcion, personaje.descripcion) && Objects.equals(fechaCreacion, personaje.fechaCreacion) && Objects.equals(nivel, personaje.nivel) && Objects.equals(vidaBase, personaje.vidaBase) && Objects.equals(manaBase, personaje.manaBase) && Objects.equals(defensaBase, personaje.defensaBase) && Objects.equals(defensa, personaje.defensa) && Objects.equals(ataqueBase, personaje.ataqueBase) && Objects.equals(ataque, personaje.ataque) && Objects.equals(vida, personaje.vida) && Objects.equals(mana, personaje.mana) && region == personaje.region && Objects.equals(habilidades, personaje.habilidades) && Objects.equals(equipamiento, personaje.equipamiento) && Objects.equals(escalabilidad, personaje.escalabilidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, fechaCreacion, nivel, vidaBase, manaBase, defensaBase, defensa, ataqueBase, ataque, vida, mana, region, habilidades, equipamiento, escalabilidad);
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", nivel=" + nivel +
                ", vidaBase=" + vidaBase +
                ", manaBase=" + manaBase +
                ", defensaBase=" + defensaBase +
                ", defensa=" + defensa +
                ", ataqueBase=" + ataqueBase +
                ", ataque=" + ataque +
                ", vida=" + vida +
                ", mana=" + mana +
                ", region=" + region +
                ", habilidades=" + habilidades +
                ", equipamiento=" + equipamiento +
                ", escalabilidad=" + escalabilidad +
                '}';
    }
}
