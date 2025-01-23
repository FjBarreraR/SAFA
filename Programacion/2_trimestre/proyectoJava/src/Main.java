import Modelos.*;
import Utilidades.UtilidadesFactura;
import Utilidades.UtilidadesProductos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LineaFactura> lf = new ArrayList<LineaFactura>();
        Cliente cliente = new Cliente(1, "12345678P", "Fran", "Barrera", "San Pablo", tipoCliente.empresa);
        Factura factura = new Factura(1, "001", 10.00, 5.00, 21.00, 100.00, LocalDate.of(2025, 10, 26), LocalDate.of(2025, 01, 24), true, lf, cliente);
        Almacen almacen = new Almacen(3, "spaghetti", 26);
        Producto producto = new Producto(2, "macarron", "muy bueno", LocalDate.of(2025, 01, 24), tipoProducto.alimentacion, almacen, 25.00);
        LineaFactura lineaFactura = new LineaFactura(1, factura, producto, 10);
        lf.add(lineaFactura);

        // UTILIDADES FACTURA
        UtilidadesFactura util1 = new UtilidadesFactura();
        System.out.println(util1.esFacturaVencida(factura));

        UtilidadesFactura util2 = new UtilidadesFactura();
        System.out.println(util2.calcularBaseFactura(factura));

        UtilidadesFactura util3 = new UtilidadesFactura();
        System.out.println(util3.calcularTotalAPagar(factura));
    }
}