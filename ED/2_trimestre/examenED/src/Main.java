import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        personajesMarvelIMP p1 = new personajesMarvelIMP("Peter Parker", "Spider-Man", true, "Sentido arácnido", "Avengers", 8.5);
        personajesMarvelIMP p2 = new personajesMarvelIMP("Tony Stark", "Iron Man", true, "Genio inventor con armadura avanzada", "Avengers", 9.2);
        personajesMarvelIMP p3 = new personajesMarvelIMP("Loki Laufeyson", "Loki", false, "Ilusionismo, manipulación mágica", "N/A", 8.7);

        System.out.println(p1.toString());

        List<personajesMarvelIMP> equipo1 = new ArrayList<>();
        List<personajesMarvelIMP> equipo2 = new ArrayList<>();

        equipo1.add(p1);
        equipo1.add(p2);
        equipo2.add(p3);

        EquipoIMP e1 = new EquipoIMP("Avengers", equipo1);
        EquipoIMP e2 = new EquipoIMP("", equipo2);

        EnfrentamientoIMP enfrentamiento = new EnfrentamientoIMP(e1, e2);

        System.out.println(e1.toString());
        System.out.println(e1.poderDelEquipo());
        System.out.println(enfrentamiento.simularEnfrentamiento(e1, e2));
    }
}