import java.util.ArrayList;
import java.util.List;

public class EnfrentamientoIMP implements Enfrentamiento{
    private EquipoIMP equipo1;
    private EquipoIMP equipo2;

    public EnfrentamientoIMP(EquipoIMP equipo1, EquipoIMP equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public EquipoIMP getEquipo1() {
        return equipo1;
    }

    public EquipoIMP getEquipo2() {
        return equipo2;
    }

    public EquipoIMP simularEnfrentamiento(EquipoIMP equipo1, EquipoIMP equipo2) {
        List<personajesMarvelIMP> listaEquipo1 = equipo1.getMiembros();
        List<personajesMarvelIMP> listaEquipo2 = equipo2.getMiembros();

        Double poderEquipo1 = 0.0;
        Double poderEquipo2 = 0.0;

        EquipoIMP ganador = equipo1;

        for (personajesMarvelIMP personaje : listaEquipo1) {
            poderEquipo1 += personaje.getPoder();
        }
        for (personajesMarvelIMP personaje : listaEquipo2) {
            poderEquipo2 += personaje.getPoder();
        }

        if (poderEquipo1 > poderEquipo2) {
            ganador = equipo1;
        } else if (poderEquipo1 < poderEquipo2) {
            ganador = equipo2;
        }

        return ganador;
    }

    @Override
    public String toString() {
        return "EnfrentamientoIMP{" +
                "equipo1=" + equipo1 +
                ", equipo2=" + equipo2 +
                '}';
    }
}
