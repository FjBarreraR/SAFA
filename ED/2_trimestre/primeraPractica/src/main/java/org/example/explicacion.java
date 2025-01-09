package org.example;

/*
x, consultable y modificable, Entero.
y, consultable y modificable. Entero.

representación: (x,y)
*/

public class explicacion implements expli{
    // 1º Atributos
    // El private hace que no se pueda modificar su valor fuera del entorno (afecta a la visibilidad).
    private Integer x;
    private Integer y;
    // 2º Constructor
    public explicacion(Integer x1, Integer y1) {
        x=x1;
        y=y1;
    }

    // 3º consultables y modificables
    // Métodos getters y setters
    // get- consultable
    public Integer getX() {
        return x;
    }
    // set- modificable
    public void setX(Integer x1) {
        x=x1;
    }

    // get- consultable
    public Integer getY() {
        return y;
    }
    // set- modificable
    public void setY(Integer y1) {
        y=y1;
    }

    // 4º toString()
    public String toString() {
        return "(" +getX()+","+getY()+")";
    }











}
