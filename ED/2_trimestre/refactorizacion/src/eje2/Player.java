package eje2;

/**
 * Clase Game
 * @version 1.0
 * author: Fran
 */

public class Player {
    int x, y;

    /**
     * Constructor
     * @param x
     * @param y
     */

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor
     * VACIO
     */

    public Player() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
