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

       return new ArrayList<>();
    }


    /**
     * Agrupa los productos del catering de una caseta por  tipo (1 punto)
     *
     * @param caseta
     * @return
     */
    public static Map<TipoProducto, List<Producto>> getProductosPorTipo(Caseta caseta){

        return new HashMap<>();

    }


    /**
     * Filtra los asistentes obteniendo los mayores de edad , es decir los que tienen más de 18 años,
     * agrupándolos por año de nacimiento (2 puntos)
     *
     * @param asistentes
     * @return
     */
    public static Map<Integer, List<Asistente>> getMayoresDeEdadPorAnyoNacimiento(List<Asistente> asistentes){
        return new HashMap<>();
    }


    /**
     * Devuelve la lista de asistentes de la feria que son de alguno de los tipos pasados,
     * y que son socios de más de una caseta. (1.5 puntos)
     *
     * @param feria
     * @return
     */
    public static List<Asistente> getPorTipoYSocios(Feria feria, List<TipoAsistente> tipoAsistentes){
        return new HashMap<>();
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
