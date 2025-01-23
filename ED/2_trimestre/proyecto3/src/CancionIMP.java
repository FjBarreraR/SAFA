public class CancionIMP implements Cancion{

    private String nombre;
    private String interprete;
    private Integer duracion;
    private Fecha fechaLanzamiento;
    private String genero;
    private Integer numReproducciones;
    private Double calificacion;
    private Boolean reproducir;

    public String getNombre() {
        return nombre;
    }

    public String getInterprete() {
        return interprete;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Fecha getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getNumReproducciones() {
        return numReproducciones;
    }

    public void setNumReproducciones(Integer numReproducciones) {
        this.numReproducciones = numReproducciones;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean getReproducir() {
        return reproducir;
    }

    public void setReproducir(Boolean reproducir) {
        this.reproducir = reproducir;
    }

    public CancionIMP(String nombre, String interprete, Integer duracion, Fecha fechaLanzamiento, String genero, Integer numReproducciones, Double calificacion, Boolean reproducir) {
        this.nombre = nombre;
        this.interprete = interprete;
        this.duracion = duracion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.numReproducciones = numReproducciones;
        this.calificacion = calificacion;
        this.reproducir = reproducir;
    }

    @Override
    public String toString() {
        return nombre + "," + interprete;
    }
}
