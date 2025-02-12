package org.example.MODELOS;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Partida {
    private Integer id;
    private String codigo;
    private Double server;
    private Map<Jugador, Personaje> elecciones;
    private Map<Integer, Set<Jugador>> jugadoresPorEquipo;
    private LocalDateTime inicioPartida;
    private LocalDateTime finPartida;
    private Integer duracionPartida;
    private Integer equipoVencedor;

    public Partida() {
    }

    public Partida(Integer id, String codigo, Double server, Map<Jugador, Personaje> elecciones, Map<Integer, Set<Jugador>> jugadoresPorEquipo, LocalDateTime inicioPartida, LocalDateTime finPartida, Integer duracionPartida, Integer equipoVencedor) {
        this.id = id;
        this.codigo = codigo;
        this.server = server;
        this.elecciones = elecciones;
        this.jugadoresPorEquipo = jugadoresPorEquipo;
        this.inicioPartida = inicioPartida;
        this.finPartida = finPartida;
        this.duracionPartida = duracionPartida;
        this.equipoVencedor = equipoVencedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getServer() {
        return server;
    }

    public void setServer(Double server) {
        this.server = server;
    }

    public Map<Jugador, Personaje> getElecciones() {
        return elecciones;
    }

    public void setElecciones(Map<Jugador, Personaje> elecciones) {
        this.elecciones = elecciones;
    }

    public Map<Integer, Set<Jugador>> getJugadoresPorEquipo() {
        return jugadoresPorEquipo;
    }

    public void setJugadoresPorEquipo(Map<Integer, Set<Jugador>> jugadoresPorEquipo) {
        this.jugadoresPorEquipo = jugadoresPorEquipo;
    }

    public LocalDateTime getInicioPartida() {
        return inicioPartida;
    }

    public void setInicioPartida(LocalDateTime inicioPartida) {
        this.inicioPartida = inicioPartida;
    }

    public LocalDateTime getFinPartida() {
        return finPartida;
    }

    public void setFinPartida(LocalDateTime finPartida) {
        this.finPartida = finPartida;
    }

    public Integer getDuracionPartida() {
        return duracionPartida;
    }

    public void setDuracionPartida(Integer duracionPartida) {
        this.duracionPartida = duracionPartida;
    }

    public Integer getEquipoVencedor() {
        return equipoVencedor;
    }

    public void setEquipoVencedor(Integer equipoVencedor) {
        this.equipoVencedor = equipoVencedor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Partida partida = (Partida) o;
        return Objects.equals(id, partida.id) && Objects.equals(codigo, partida.codigo) && Objects.equals(server, partida.server) && Objects.equals(elecciones, partida.elecciones) && Objects.equals(jugadoresPorEquipo, partida.jugadoresPorEquipo) && Objects.equals(inicioPartida, partida.inicioPartida) && Objects.equals(finPartida, partida.finPartida) && Objects.equals(duracionPartida, partida.duracionPartida) && Objects.equals(equipoVencedor, partida.equipoVencedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, server, elecciones, jugadoresPorEquipo, inicioPartida, finPartida, duracionPartida, equipoVencedor);
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", server=" + server +
                ", elecciones=" + elecciones +
                ", jugadoresPorEquipo=" + jugadoresPorEquipo +
                ", inicioPartida=" + inicioPartida +
                ", finPartida=" + finPartida +
                ", duracionPartida=" + duracionPartida +
                ", equipoVencedor=" + equipoVencedor +
                '}';
    }
}
