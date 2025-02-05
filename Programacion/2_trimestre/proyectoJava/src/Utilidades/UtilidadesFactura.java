package Utilidades;

import Modelos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesFactura {
    public Boolean esFacturaVencida(Factura factura) {
        if (factura.getFechaVencimiento().equals(LocalDate.now()) || factura.getFechaVencimiento().isBefore(LocalDate.now())) {
            return true;
        } else {
            return false;
        }
    }

    public Double calcularBaseFactura(Factura factura) {
        Double baseImporte = 0.00;
        for (LineaFactura producto : factura.getLineaFacturas()) {
            Double ImporteProducto = producto.getProducto().getPrecio();
            Integer cantidad = producto.getCantidad();
            baseImporte += ImporteProducto * cantidad;
        }
        return baseImporte;
    }

    public Double calcularTotalAPagar(Factura factura) {
        Double impBase = factura.getImporteBase();
        Double desc = factura.getDescuento();
        Double iva = factura.getIva();

        return (impBase - desc) * iva;
    }

    public Double gastoTotalCliente(List<Factura> facturas, Cliente cliente) {
        Double totalCliente = 0.0;
        for (Factura factura : facturas) {
            if (factura.getCliente().equals(cliente)) {
                totalCliente += factura.getImporteBase();
            }
        }
        return totalCliente;
    }

    public Double totalFacturadoPeriodo(List<Factura> facturas, LocalDate fechaInicio, LocalDate fechaFin) {
        Double totalFacturado = 0.0;
        for (Factura factura : facturas) {
            if (fechaInicio.isAfter(factura.getFechaEmision()) && fechaFin.isBefore(factura.getFechaEmision())) {
                totalFacturado += factura.getImporteBase();
            }
        }
        return totalFacturado;
    }
}
