package utilidades;

import modelos.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesFeria {


    /**
     * Devuelve los productos que devuelve los productos comunes entre todos los caterings pasados (1.5 puntos)
     *
     * @param caterings
     * @return
     */
    public static List<Producto> getProductosCoincidente(List<Catering> caterings){
        List<Producto> productosCoincidentes = new ArrayList<>();
        List<Producto> productosNuevos = new ArrayList<>();
        for (Catering catering : caterings){
            for (Producto producto : catering.getProductos()){
                if (!productosNuevos.contains(producto)){
                    productosNuevos.add(producto);
                } else {
                    if(!productosCoincidentes.contains(producto)){
                        productosCoincidentes.add(producto);
                    }
                }
            }
        }
       return productosCoincidentes;
    }


    /**
     * Agrupa los productos del catering de una caseta por tipo (1 punto)
     *
     * @param caseta
     * @return
     */
    public static Map<TipoProducto, List<Producto>> getProductosPorTipo(Caseta caseta){
        Map<TipoProducto, List<Producto>> productosPorTipo = new HashMap<>();
        for ( Producto producto : caseta.getCatering().getProductos() ){
            if (!productosPorTipo.containsKey(producto.getProducto())){
                productosPorTipo.put(producto.getProducto(), new ArrayList<>(List.of(producto)));
            } else {
                productosPorTipo.get(producto.getProducto()).add(producto);
            }
        }
        return productosPorTipo;

    }


    /**
     * Filtra los asistentes obteniendo los mayores de edad , es decir los que tienen más de 18 años,
     * agrupándolos por año de nacimiento (2 puntos)
     *
     * @param asistentes
     * @return
     */
    public static Map<Integer, List<Asistente>> getMayoresDeEdadPorAnyoNacimiento(List<Asistente> asistentes){
        Map<Integer, List<Asistente>> mayoresDeEdadPorAnyoNacimiento = new HashMap<>();
        for (Asistente asistente : asistentes){

            if ((Period.between(LocalDate.now(), asistente.getFechaNacimiento()).getYears()>18)){
                if (!mayoresDeEdadPorAnyoNacimiento.containsKey(Period.between(LocalDate.now(), asistente.getFechaNacimiento()).getYears())){
                mayoresDeEdadPorAnyoNacimiento.put(asistente.getFechaNacimiento().getYear(), new ArrayList<>(List.of(asistente)));
                }else {
                mayoresDeEdadPorAnyoNacimiento.get(Period.between(LocalDate.now(), asistente.getFechaNacimiento()).getYears()).add(asistente);
            }}



        }

        return mayoresDeEdadPorAnyoNacimiento;
    }


    /**
     * Devuelve la lista de asistentes de la feria que son de alguno de los tipos pasados,
     * y que son socios de más de una caseta. (1.5 puntos)
     *
     * @param feria
     * @return
     */
    public static List<Asistente> getPorTipoYSocios(Feria feria, List<TipoAsistente> tipoAsistentes){
            List<Asistente> asistentes = new ArrayList<>();
            for (Asistente asistente : feria.getAsistentes()){
                if (asistente.getCasetasMiembro().size() > 1 && tipoAsistentes.contains(asistente.getTipoAsistente())){
                    asistentes.add(asistente);
                }
            }
        return asistentes;
    }


    /**
     * Devuelve el total de la suma de productos por cada Catering (1 punto)
     *
     * @param caterings
     * @return
     */
    public static Map<Catering, Double> sumImporteProductosCaterind(List<Catering> caterings){
        return new HashMap<>();
    }


    /**
     * Rellena los datos del resumen del día del asistente (3 puntos)
     *
     * @param asistente
     * @param consumo
     * @param viajesAtraccion
     * @return
     */
    public static  ResumenDia obtenerResumenDia(Asistente asistente, Map<Producto, Integer> consumo, Map<Atraccion, Integer> viajesAtraccion){

          return null;

    }



}
