import Modelos.Cliente;
import Modelos.Factura;
import Modelos.tipoCliente;
import Utilidades.UtilidadesFactura;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "12345678P", "Fran", "Barrera", "San Pablo", tipoCliente.empresa);
        List<Cliente> l = new ArrayList<Cliente>();
        l.add(cliente);
        Factura factura = new Factura(1, "001", 10.00, 5.00, 21.00, 100.00, LocalDate.of(2025, 10, 26), LocalDate.of(2025, 01, 24), true, l);
        UtilidadesFactura util = new UtilidadesFactura();
        System.out.println(util.esFacturaVencida(factura));
    }
}