package eje2;

/**
 * Clase Game
 * @version 1.0
 * author: Fran
 */

public class Game {

    /**
     * Variable de tipo Player que antes se llamaba p y ahora se llama jugador para que sea más descriptiva
     */

    Player jugador;

    /**
     * Constructor
     * @return
     */

    public Game(Player p) {
        this.jugador = p;
    }

    /**
     * Getter
     * @return devuelve la variable p, cuidado, no es una copia, es la misma variable
     */

    public Player getJugador() {
        return jugador;
    }

    /**
     * Setter
     * @param jugador variable de tipo Player
     */

    public void setJugador(Player jugador) {
        this.jugador = jugador;
    }

    public void movement(String m){
        if (m.equalsIgnoreCase("Derecha")) {
            jugador.setX(jugador.getX()+1);
        } else if (m.equalsIgnoreCase("Izquierda")) {
            jugador.setX(jugador.getX()-1);
        } else if (m.equalsIgnoreCase("Arriba")) {
            jugador.setY(jugador.getY() -1);
        } else if (m.equalsIgnoreCase("Abajo")) {
            jugador.setY(jugador.getY()+1);
        }
    }
}
