package org.example;

public class segunda_practica implements seg_practica {
    // Atributos
    private String codigo_vuelo;
    private String destino;
    private Double precio;
    private Integer num_plazas;
    private Integer num_pasajeros;
    private Fecha fecha;
    private Persona piloto;

    // Constructor
    public segunda_practica(String cv, String dest, Double p, Integer plazas, Integer pasaj, Fecha fecha, Persona pil) {
        codigo_vuelo = cv;
        destino = dest;
        precio = p;
        num_plazas = plazas;
        num_pasajeros = pasaj;
        this.fecha = fecha;
        piloto = pil;
    }

    // Métodos
    // Get
    public String getCodigo_vuelo() {
        return codigo_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getNum_plazas() {
        return num_plazas;
    }

    public Integer getNum_pasajeros() {
        return num_pasajeros;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Persona getPiloto(){
        return piloto;
    }

    // Set

    public void setPrecio(Double p) {
        precio = p;
    }

    public void setNum_pasajeros(Integer pasajeros) {
        num_pasajeros = pasajeros;
    }

    public void setPiloto(Persona pil){
        piloto = pil;
    }

    public Double recaudacion(){
        return num_pasajeros * precio;
    }

    // To String
    public String toString(){
        return getCodigo_vuelo() + " " + "(" + getDestino() + ")" + " - " + getPiloto() + " años "  + " -" + getFecha();
    }
}
