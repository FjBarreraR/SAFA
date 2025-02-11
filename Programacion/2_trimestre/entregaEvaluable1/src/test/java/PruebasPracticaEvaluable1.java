import org.example.MODELOS.Alumno;
import org.example.MODELOS.Colegio;
import org.example.MODELOS.Curso;
import org.example.UTILIDADES.UtilidadesColegio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PruebasPracticaEvaluable1 {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        Alumno alumno = new Alumno(1, "30267111P","Fran", "Barrera Román", LocalDate.of(2004, 12, 21), Curso.CICLOS);
        alumnos.add(alumno);
        Colegio colegio = new Colegio(1, "Safa Reyes", "Calle Calatrava", LocalDate.of(1980, 10, 10), alumnos);
        System.out.println(colegio);
        System.out.println(alumno);
        List<Colegio> colegios = new ArrayList<>();
        colegios.add(colegio);

        UtilidadesColegio utilidades = new UtilidadesColegio();
        System.out.println(UtilidadesColegio.totalAlumnos(colegios));

        System.out.println(UtilidadesColegio.mayoresEdad(colegio));

        System.out.println(UtilidadesColegio.totalAlumnosPorColegio(colegios));

        System.out.println(UtilidadesColegio.alumnosPorCurso(colegio));
    }
}