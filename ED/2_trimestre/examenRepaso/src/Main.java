//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FestivoIMP festivo = new FestivoIMP("Feria de Sevilla", "Abril");
        tipoPoblacionIMP tp = new tipoPoblacionIMP("Sevilla", 1942389, 14036.0, 387200, 830000, festivo);
        System.out.println(tp.toString());
    }
}