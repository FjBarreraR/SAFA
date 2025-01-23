//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fecha fecha = new FechaIMP(26, 01, 2025);
        Cancion cancion = new CancionIMP("ADN", "JC Reyes", 2, fecha, "trap", 1000000, 10.0, true);
        System.out.println(fecha);
        System.out.println(cancion);
    }
}