package Utilidades;

import Modelos.Cliente;

public class UtilidadesCliente {
    public Boolean esDniValido(Cliente cliente) {
        String dni = cliente.getDni();
        if (dni.length() == 9) {
            Integer contador = 1;

            for (char letra: cliente.getDni().toCharArray()) {
                if (!Character.isDigit(letra) && contador <= 0) {
                    return false;
                }

                if (Character.isDigit(letra) && contador > 0) {
                    return false;
                }

                contador ++;
            }
            return true;
        }else return false;
    }
}
