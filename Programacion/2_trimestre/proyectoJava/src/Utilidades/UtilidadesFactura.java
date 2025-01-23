package Utilidades;

import Modelos.Cliente;
import Modelos.Factura;
import Modelos.LineaFactura;
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

    public Double calcularBaseFactura(Factura factura) {
        Double baseImporte = 0.00;
        for (LineaFactura producto : factura.getLineaFacturas()){
            Double ImporteProducto = producto.getProducto().getPrecio();
            Integer cantidad = producto.getCantidad();
            baseImporte += ImporteProducto*cantidad;
        }
        return baseImporte;
    }

    public Double calcularTotalAPagar(Factura factura) {
        Double impBase = factura.getImporteBase();
        Double desc = factura.getDescuento();
        Double iva = factura.getIva();

        return (impBase - desc) * iva;
    }

}
