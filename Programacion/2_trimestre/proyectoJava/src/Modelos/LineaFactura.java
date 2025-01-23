package Modelos;

import java.util.Objects;

public class LineaFactura {
    private Integer identificador;
    private Factura factura;
    private Producto producto;
    private Integer cantidad;

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LineaFactura() {
    }

    public LineaFactura(Integer identificador, Factura factura, Producto producto, Integer cantidad) {
        this.identificador = identificador;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LineaFactura that = (LineaFactura) o;
        return Objects.equals(identificador, that.identificador) && Objects.equals(factura, that.factura) && Objects.equals(producto, that.producto) && Objects.equals(cantidad, that.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, factura, producto, cantidad);
    }

    @Override
    public String toString() {
        return "LineaFactura{" +
                "identificador=" + identificador +
                ", factura=" + factura +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}
