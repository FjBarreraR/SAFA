package Utilidades;
import Modelos.Almacen;
import Modelos.Producto;
import Modelos.tipoProducto;

import java.util.List;

public class UtilidadesProductos {
    List<Producto> productos;

    public List<Producto> getPorTipo(List<Producto> productos, tipoProducto tipo) {
        for (Producto producto : productos) {
            if (producto.getTipoProducto() == tipo){
                this.productos.add(producto);
            }
        }
        return productos;
    }

    public List<Producto> getPorAlmacen(List<Producto> productos, Almacen almacen){
        for (Producto producto : productos) {
            if (producto.getAlmacen() == almacen){
                this.productos.add(producto);
            }
        }
        return productos;
    }

}
