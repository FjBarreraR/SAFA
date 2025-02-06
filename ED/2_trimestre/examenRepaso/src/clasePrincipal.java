public class clasePrincipal {
    public static void main(String[] args) {
        String cadena = "a";
        System.out.println(cadena);
        do{
            cadena = cadena + "e";
        } while(cadena.length() < 5);
        System.out.println(cadena);
        do{
            cadena = cadena + "i";
        } while (cadena.length() < 3);
        System.out.println(cadena);
    }
}
