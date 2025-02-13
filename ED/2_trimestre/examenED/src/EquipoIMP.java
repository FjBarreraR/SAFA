import java.util.ArrayList;
import java.util.List;

public class EquipoIMP implements Equipo{
    private String nombreEquipo;
    private List<personajesMarvelIMP> miembros;

    public EquipoIMP(String nombreEquipo, List<personajesMarvelIMP> miembros) {
        this.nombreEquipo = nombreEquipo;
        this.miembros = miembros;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<personajesMarvelIMP> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<personajesMarvelIMP> miembros) {
        this.miembros = miembros;
    }

    public void agregarMiembro(personajesMarvelIMP nuevoPersonaje) {
        this.miembros.add(nuevoPersonaje);
    }

    public void quitarMiembro(personajesMarvelIMP personaje) {
        this.miembros.remove(personaje);
    }

    public Double poderDelEquipo() {
        Double sumaPoderes = 0.0;
        for (personajesMarvelIMP p : miembros) {
            sumaPoderes += p.getPoder();
        }
        return sumaPoderes/miembros.size();
    }

    @Override
    public String toString() {
        List<String> nombreMiembros = new ArrayList<>();
        for (personajesMarvelIMP p : miembros) {
            nombreMiembros.add(p.getNombre());
        }
        return "Equipo " + nombreEquipo + ", miembros: " + nombreMiembros;
    }
}
