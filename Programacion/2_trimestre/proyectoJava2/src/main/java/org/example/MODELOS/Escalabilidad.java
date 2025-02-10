package org.example.MODELOS;

import java.util.Objects;

public class Escalabilidad {
    private Integer id;
    private Double incrementoDanyoNivel;
    private Double incrementoDefensaNivel;
    private Double incrementoSaludNivel;
    private Double incrementoManaNivel;

    public Escalabilidad() {
    }

    public Escalabilidad(Integer id, Double incrementoDanyoNivel, Double incrementoDefensaNivel, Double incrementoSaludNivel, Double incrementoManaNivel) {
        this.id = id;
        this.incrementoDanyoNivel = incrementoDanyoNivel;
        this.incrementoDefensaNivel = incrementoDefensaNivel;
        this.incrementoSaludNivel = incrementoSaludNivel;
        this.incrementoManaNivel = incrementoManaNivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getIncrementoDanyoNivel() {
        return incrementoDanyoNivel;
    }

    public void setIncrementoDanyoNivel(Double incrementoDanyoNivel) {
        this.incrementoDanyoNivel = incrementoDanyoNivel;
    }

    public Double getIncrementoDefensaNivel() {
        return incrementoDefensaNivel;
    }

    public void setIncrementoDefensaNivel(Double incrementoDefensaNivel) {
        this.incrementoDefensaNivel = incrementoDefensaNivel;
    }

    public Double getIncrementoSaludNivel() {
        return incrementoSaludNivel;
    }

    public void setIncrementoSaludNivel(Double incrementoSaludNivel) {
        this.incrementoSaludNivel = incrementoSaludNivel;
    }

    public Double getIncrementoManaNivel() {
        return incrementoManaNivel;
    }

    public void setIncrementoManaNivel(Double incrementoManaNivel) {
        this.incrementoManaNivel = incrementoManaNivel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Escalabilidad that = (Escalabilidad) o;
        return Objects.equals(id, that.id) && Objects.equals(incrementoDanyoNivel, that.incrementoDanyoNivel) && Objects.equals(incrementoDefensaNivel, that.incrementoDefensaNivel) && Objects.equals(incrementoSaludNivel, that.incrementoSaludNivel) && Objects.equals(incrementoManaNivel, that.incrementoManaNivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, incrementoDanyoNivel, incrementoDefensaNivel, incrementoSaludNivel, incrementoManaNivel);
    }

    @Override
    public String toString() {
        return "Escalabilidad{" +
                "id=" + id +
                ", incrementoDanyoNivel=" + incrementoDanyoNivel +
                ", incrementoDefensaNivel=" + incrementoDefensaNivel +
                ", incrementoSaludNivel=" + incrementoSaludNivel +
                ", incrementoManaNivel=" + incrementoManaNivel +
                '}';
    }
}
