public interface Cancion {
    public String getNombre();
    public String getInterprete();
    public Integer getDuracion();
    public Fecha getFechaLanzamiento();
    public String getGenero();
    public Integer getNumReproducciones();
    public void setNumReproducciones(Integer numReproducciones);
    public Double getCalificacion();
    public void setCalificacion(Double calificacion);
    public Boolean getReproducir();
    public void setReproducir(Boolean reproducir);
}
