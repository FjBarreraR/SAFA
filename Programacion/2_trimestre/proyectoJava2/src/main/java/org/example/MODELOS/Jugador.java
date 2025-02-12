package org.example.MODELOS;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Jugador {
    private Integer identificador;
    private String nickname;
    private Set<Personaje> personajes;
    private Map<Personaje, Integer> partidasGanadas;

    public Jugador() {
    }

    public Jugador(Integer identificador, String nickname, Set<Personaje> personajes, Map<Personaje, Integer> partidasGanadas) {
        this.identificador = identificador;
        this.nickname = nickname;
        this.personajes = personajes;
        this.partidasGanadas = partidasGanadas;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Set<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Set<Personaje> personajes) {
        this.personajes = personajes;
    }

    public Map<Personaje, Integer> getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(Map<Personaje, Integer> partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(identificador, jugador.identificador) && Objects.equals(nickname, jugador.nickname) && Objects.equals(personajes, jugador.personajes) && Objects.equals(partidasGanadas, jugador.partidasGanadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, nickname, personajes, partidasGanadas);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "identificador=" + identificador +
                ", nickname='" + nickname + '\'' +
                ", personajes=" + personajes +
                ", partidasGanadas=" + partidasGanadas +
                '}';
    }
}
