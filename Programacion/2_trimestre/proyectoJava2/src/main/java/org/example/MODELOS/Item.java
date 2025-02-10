package org.example.MODELOS;

import java.util.Objects;

public class Item {
    private Integer id;
    private String nombre;
    private Double aumentoDanyo;
    private Double aumentoDefensa;
    private Double aumentoSalud;
    private Double aumentoMana;

    public Item() {
    }

    public Item(Integer id, String nombre, Double aumentoDanyo, Double aumentoDefensa, Double aumentoSalud, Double aumentoMana) {
        this.id = id;
        this.nombre = nombre;
        this.aumentoDanyo = aumentoDanyo;
        this.aumentoDefensa = aumentoDefensa;
        this.aumentoSalud = aumentoSalud;
        this.aumentoMana = aumentoMana;
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

    public Double getAumentoDanyo() {
        return aumentoDanyo;
    }

    public void setAumentoDanyo(Double aumentoDanyo) {
        this.aumentoDanyo = aumentoDanyo;
    }

    public Double getAumentoDefensa() {
        return aumentoDefensa;
    }

    public void setAumentoDefensa(Double aumentoDefensa) {
        this.aumentoDefensa = aumentoDefensa;
    }

    public Double getAumentoSalud() {
        return aumentoSalud;
    }

    public void setAumentoSalud(Double aumentoSalud) {
        this.aumentoSalud = aumentoSalud;
    }

    public Double getAumentoMana() {
        return aumentoMana;
    }

    public void setAumentoMana(Double aumentoMana) {
        this.aumentoMana = aumentoMana;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) && Objects.equals(nombre, item.nombre) && Objects.equals(aumentoDanyo, item.aumentoDanyo) && Objects.equals(aumentoDefensa, item.aumentoDefensa) && Objects.equals(aumentoSalud, item.aumentoSalud) && Objects.equals(aumentoMana, item.aumentoMana);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, aumentoDanyo, aumentoDefensa, aumentoSalud, aumentoMana);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", aumentoDanyo=" + aumentoDanyo +
                ", aumentoDefensa=" + aumentoDefensa +
                ", aumentoSalud=" + aumentoSalud +
                ", aumentoMana=" + aumentoMana +
                '}';
    }
}
