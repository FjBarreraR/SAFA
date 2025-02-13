import java.util.List;

public interface Equipo {
    public String getNombreEquipo();
    public void setNombreEquipo(String nombreEquipo);
    public List<personajesMarvelIMP> getMiembros();
    public void setMiembros(List<personajesMarvelIMP> miembros);
    public void agregarMiembro(personajesMarvelIMP nuevoPersonaje);
    public void quitarMiembro(personajesMarvelIMP personaje);
    public Double poderDelEquipo();
}
