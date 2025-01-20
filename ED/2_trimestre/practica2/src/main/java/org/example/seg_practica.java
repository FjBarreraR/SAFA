package org.example;

public interface seg_practica {
    public String getCodigo_vuelo();
    public String getDestino();
    public Double getPrecio();
    public void setPrecio(Double p);
    public Integer getNum_plazas();
    public Integer getNum_pasajeros();
    public void setNum_pasajeros(Integer pasajeros);
    public Fecha getFecha();
    public Persona getPiloto();
    public void setPiloto(Persona pil);
}
