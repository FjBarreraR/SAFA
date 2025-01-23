package Utilidades;

import Modelos.Cliente;
import Modelos.Factura;
import Modelos.tipoCliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesFactura {
    public Boolean esFacturaVencida(Factura factura){
        if (factura.getFechaVencimiento().equals(LocalDate.now())||factura.getFechaVencimiento().isBefore(LocalDate.now())){
            return true;
        } else {
            return false;
        }
    }


}
