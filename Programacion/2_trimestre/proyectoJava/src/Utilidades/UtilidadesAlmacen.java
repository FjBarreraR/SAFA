package Utilidades;

import Modelos.Almacen;
import Modelos.Producto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesAlmacen {
    public boolean validarAlmacenes(List<Producto> productos){
        Map<Almacen, Integer> mapProductos = new HashMap<>();
        for (Producto producto: productos){
            if (mapProductos.containsKey(producto.getAlmacen())){
                mapProductos.put(producto.getAlmacen(), mapProductos.get(producto.getAlmacen()) + 1);
            } else {
                mapProductos.put(producto.getAlmacen(), 1);
            }
        }
        Boolean validado = false;
        for(Almacen almacen : mapProductos.keySet()){
            if (almacen.getCapacidad()> mapProductos.get(almacen)){
                validado = true;
            } else {
                validado = false;
            }
        }
        return validado;
    }
}
