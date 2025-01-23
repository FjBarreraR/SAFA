package Modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {
    private Integer identificador;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCaducidad;
    private tipoProducto TipoProducto;
    private Almacen almacen;
    private Double precio;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public tipoProducto getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(tipoProducto tipoProducto) {
        TipoProducto = tipoProducto;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Producto() {
    }

    public Producto(Integer identificador, String nombre, String descripcion, LocalDate fechaCaducidad, tipoProducto tipoProducto, Almacen almacen, Double precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCaducidad = fechaCaducidad;
        TipoProducto = tipoProducto;
        this.almacen = almacen;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(identificador, producto.identificador) && Objects.equals(nombre, producto.nombre) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(fechaCaducidad, producto.fechaCaducidad) && TipoProducto == producto.TipoProducto && Objects.equals(almacen, producto.almacen) && Objects.equals(precio, producto.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, nombre, descripcion, fechaCaducidad, TipoProducto, almacen, precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", TipoProducto=" + TipoProducto +
                ", almacen=" + almacen +
                ", precio=" + precio +
                '}';
    }
}
