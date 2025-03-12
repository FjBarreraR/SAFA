package utilidades;

import modelos.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PruebaMetodos {

    private Catering catering1;
    private Catering catering2;
    private Catering catering3;
    private Caseta caseta;

    @BeforeEach
    public void setUp() throws Exception {
        // Creamos algunos productos
        Producto producto1 = new Producto("Cerveza", 2.5, TipoProducto.BEBIDAS);
        Producto producto2 = new Producto("Jamón ibérico", 20.0, TipoProducto.RACIONES);
        Producto producto3 = new Producto("Refresco", 1.5, TipoProducto.BEBIDAS);
        Producto producto4 = new Producto("Tortilla", 8.0, TipoProducto.RACIONES);

        // Creamos algunos caterings con productos
        List<Producto> productos1 = new ArrayList<>();
        productos1.add(producto1);
        productos1.add(producto2);
        catering1 = new Catering("Bar Pepe", productos1);

        List<Producto> productos2 = new ArrayList<>();
        productos2.add(producto1);
        productos2.add(producto3);
        catering2 = new Catering("Cafetería Ana", productos2);

        List<Producto> productos3 = new ArrayList<>();
        productos3.add(producto1);
        productos3.add(producto4);
        catering3 = new Catering("Bar Paco", productos3);

        // Creamos un catering con los productos
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        Catering catering = new Catering("Bar Pepe", productos);

        // Creamos una caseta con el catering
        caseta = new Caseta("Caseta 1", null, 50, catering, "Calle Principal", 1);
    }

    @Test
    public void testGetProductosCoincidente() {
        // Creamos una lista con los tres caterings
        List<Catering> caterings = new ArrayList<>();
        caterings.add(catering1);
        caterings.add(catering2);
        caterings.add(catering3);

        // Ejecutamos el método que queremos probar
        List<Producto> productosCoincidentes = UtilidadesFeria.getProductosCoincidente(caterings);

        // Comprobamos que el resultado es el esperado
        assertEquals(1, productosCoincidentes.size());

        assertTrue(productosCoincidentes.contains(new Producto("Cerveza", 2.5, TipoProducto.BEBIDAS)));
    }


    @Test
    public void testGetProductosPorTipo() {
        // Ejecutamos el método que queremos probar
        Map<TipoProducto, List<Producto>> productosPorTipo = UtilidadesFeria.getProductosPorTipo(caseta);

        // Creamos el mapa esperado
        Map<TipoProducto, List<Producto>> productosPorTipoEsperado = new HashMap<>();
        List<Producto> bebidas = new ArrayList<>();
        bebidas.add(new Producto("Cerveza", 2.5, TipoProducto.BEBIDAS));
        bebidas.add(new Producto("Refresco", 1.5, TipoProducto.BEBIDAS));
        productosPorTipoEsperado.put(TipoProducto.BEBIDAS, bebidas);
        List<Producto> raciones = new ArrayList<>();
        raciones.add(new Producto("Jamón ibérico", 20.0, TipoProducto.RACIONES));
        raciones.add(new Producto("Tortilla", 8.0, TipoProducto.RACIONES));
        productosPorTipoEsperado.put(TipoProducto.RACIONES, raciones);

        // Comprobamos que el resultado es el esperado
        assertEquals(productosPorTipoEsperado.size(), productosPorTipo.size());
        for (TipoProducto tipo : productosPorTipoEsperado.keySet()) {
            assertTrue(productosPorTipo.containsKey(tipo));
            List<Producto> productosEsperados = productosPorTipoEsperado.get(tipo);
            List<Producto> productosObtenidos = productosPorTipo.get(tipo);
            assertEquals(productosEsperados.size(), productosObtenidos.size());
            for (Producto producto : productosEsperados) {
                assertTrue(productosObtenidos.contains(producto));
            }
        }
    }

    @Test
    public void testGetMayoresDeEdadPorAnyoNacimiento() {
        // Crear algunos asistentes
        Asistente asistente1 = new Asistente("Ana", "González", "12345678A", TipoAsistente.FERIANTE,LocalDate.of(2000,1,1), new ArrayList<>());
        Asistente asistente2 = new Asistente("Juan", "Pérez", "87654321B", TipoAsistente.FERIANTE, LocalDate.of(1999,2,28), new ArrayList<>());
        Asistente asistente3 = new Asistente("María", "García", "23456789C", TipoAsistente.FERIANTE, LocalDate.of(2006,6,15), new ArrayList<>());
        Asistente asistente4 = new Asistente("Pedro", "Martínez", "34567890D", TipoAsistente.FERIANTE, LocalDate.of(1998,12,24), new ArrayList<>());

        // Crear una lista de asistentes
        List<Asistente> asistentes = new ArrayList<>();
        asistentes.add(asistente1);
        asistentes.add(asistente2);
        asistentes.add(asistente3);
        asistentes.add(asistente4);

        // Obtener los mayores de edad por año de nacimiento
        Map<Integer, List<Asistente>> resultado = UtilidadesFeria.getMayoresDeEdadPorAnyoNacimiento(asistentes);

        // Comprobar el resultado
        assertEquals(3, resultado.size()); // Debería haber 3 años diferentes en el resultado
        assertTrue(resultado.containsKey(2000)); // Debería haber un asistente nacido en 2000
        assertEquals(1, resultado.get(2000).size()); // Debería haber un solo asistente nacido en 2000
        assertTrue(resultado.containsKey(1999)); // Debería haber un asistente nacido en 1999
        assertEquals(1, resultado.get(1999).size()); // Debería haber un solo asistente nacido en 1999
        assertTrue(resultado.containsKey(1998)); // Debería haber un asistente nacido en 1998
        assertEquals(1, resultado.get(1998).size()); // Debería haber un solo asistente nacido en 1998
    }


    @Test
    public void testGetPorTipoYSocios() {
        // Crear algunos objetos de prueba
        Catering catering1 = new Catering("Catering 1", new ArrayList<>());
        Catering catering2 = new Catering("Catering 2", new ArrayList<>());
        Catering catering3 = new Catering("Catering 3", new ArrayList<>());

        Caseta caseta1 = new Caseta("Caseta 1", null, null, catering1, "Ubicacion 1", 1);
        Caseta caseta2 = new Caseta("Caseta 2", null, null, catering2, "Ubicacion 2", 2);
        Caseta caseta3 = new Caseta("Caseta 3", null, null, catering3, "Ubicacion 3", 3);

        Asistente asistente1 = new Asistente("Juan", "Perez", "12345678A", TipoAsistente.FERIANTE, LocalDate.of(2000,1,1), Arrays.asList(caseta1, caseta2));
        Asistente asistente2 = new Asistente("Pedro", "Garcia", "87654321B", TipoAsistente.CONSUMIDOR,  LocalDate.of(2000,1,1), Arrays.asList(caseta1, caseta3));
        Asistente asistente3 = new Asistente("Maria", "Lopez", "11111111C", TipoAsistente.FERIANTE,  LocalDate.of(2000,1,1), Arrays.asList(caseta1, caseta2, caseta3));
        Asistente asistente4 = new Asistente("Laura", "Sanchez", "22222222D", TipoAsistente.CABALLISTA,  LocalDate.of(2000,1,1), Arrays.asList(caseta2));
        Asistente asistente5 = new Asistente("David", "Fernandez", "33333333E",  TipoAsistente.FERIANTE, LocalDate.of(2000,1,1), Arrays.asList(caseta3));

        Feria feria = new Feria(null, Arrays.asList(caseta1, caseta2, caseta3), Arrays.asList(asistente1, asistente2, asistente3, asistente4, asistente5));

        // Ejecutar el método a probar
        List<Asistente> result = UtilidadesFeria.getPorTipoYSocios(feria, Arrays.asList(TipoAsistente.CONSUMIDOR, TipoAsistente.CABALLISTA));

        // Comprobar el resultado
        assertEquals(1, result.size());
        assertTrue(result.contains(asistente2));
    }



    @Test
    public void testSumImporteProductosCaterind() {

        double DELTA = 1e-15;

        Catering catering1 = new Catering("Catering 1", Arrays.asList(
                new Producto("Producto 1", 5.0, TipoProducto.TAPAS),
                new Producto("Producto 2", 7.0, TipoProducto.BEBIDAS),
                new Producto("Producto 3", 3.0, TipoProducto.REBUJITO),
                new Producto("Producto 4", 2.0, TipoProducto.TAPAS),
                new Producto("Producto 5", 6.0, TipoProducto.BEBIDAS)));

        Catering catering2 = new Catering("Catering 2", Arrays.asList(
                new Producto("Producto 6", 8.0, TipoProducto.COPAS),
                new Producto("Producto 7", 10.0, TipoProducto.BEBIDAS),
                new Producto("Producto 8", 4.0, TipoProducto.RACIONES),
                new Producto("Producto 9", 3.5, TipoProducto.TAPAS)));

        Catering catering3 = new Catering("Catering 3", Arrays.asList(
                new Producto("Producto 10", 5.0, TipoProducto.TAPAS),
                new Producto("Producto 11", 7.0, TipoProducto.BEBIDAS),
                new Producto("Producto 12", 3.0, TipoProducto.REBUJITO)));

        List<Catering> caterings = Arrays.asList(catering1, catering2, catering3);

        Map<Catering, Double> expectedMap = new HashMap<>();
        expectedMap.put(catering1, 23.0);
        expectedMap.put(catering2, 25.5);
        expectedMap.put(catering3, 15.0);

        Map<Catering, Double> resultMap = UtilidadesFeria.sumImporteProductosCaterind(caterings);

        assertEquals(expectedMap.keySet(), resultMap.keySet());
        expectedMap.forEach((catering, expected) -> {
            assertEquals(expected, resultMap.get(catering), DELTA);
        });
    }

    @Test
    public void testObtenerResumenDia() {
        // Creamos los productos y atracciones
        Producto p1 = new Producto("Cerveza",2.5, TipoProducto.BEBIDAS);
        Producto p2 = new Producto("Tapa", 1.5,TipoProducto.TAPAS);
        Atraccion a1 = new Atraccion("Montaña rusa", 3.0);
        Atraccion a2 = new Atraccion("Casa del terror", 2.5);

        // Creamos el asistente y su consumo de productos y viajes en atracciones
        Asistente asistente = new Asistente("12345678A", "Juan", "García",TipoAsistente.CONSUMIDOR, LocalDate.of(2000,1,1), new ArrayList<>());
        Map<Producto, Integer> consumoProductos = new HashMap<>();
        consumoProductos.put(p1, 2);
        consumoProductos.put(p2, 3);
        Map<Atraccion, Integer> viajesAtraccion = new HashMap<>();
        viajesAtraccion.put(a1, 4);
        viajesAtraccion.put(a2, 1);

        // Calculamos el total gastado por producto por tipo
        Map<TipoProducto, Double> totalGastadoPorTipoProductoEsperado = new HashMap<>();
        totalGastadoPorTipoProductoEsperado.put(TipoProducto.BEBIDAS, 5.0);
        totalGastadoPorTipoProductoEsperado.put(TipoProducto.TAPAS, 4.5);

        // Calculamos el total gastado por atracción
        Map<Atraccion, Double> totalGastadoPorAtraccionEsperado = new HashMap<>();
        totalGastadoPorAtraccionEsperado.put(a1, 12.0);
        totalGastadoPorAtraccionEsperado.put(a2, 2.5);

        // Calculamos el total gastado en el día
        double totalGastadoEsperado = 24;

        // Creamos el resumen esperado
        ResumenDia resumenEsperado = new ResumenDia(asistente, consumoProductos, totalGastadoPorTipoProductoEsperado, viajesAtraccion, totalGastadoPorAtraccionEsperado, totalGastadoEsperado);

        // Obtenemos el resumen del día y comprobamos que es el esperado
        ResumenDia resumenObtenido = UtilidadesFeria.obtenerResumenDia(asistente, consumoProductos, viajesAtraccion);
        assertEquals(resumenEsperado.getAsistente(), resumenObtenido.getAsistente());
        assertEquals(resumenEsperado.getCantidadProductos(), resumenObtenido.getCantidadProductos());
        assertEquals(resumenEsperado.getViajesPorAtraccion(), resumenObtenido.getViajesPorAtraccion());
        assertEquals(resumenEsperado.getTotalGastadoPorTipoProducto(), resumenObtenido.getTotalGastadoPorTipoProducto());
        assertEquals(resumenEsperado.getTotalGastadoPorAtraccion(), resumenObtenido.getTotalGastadoPorAtraccion());
        assertEquals(resumenEsperado.getTotalGastado(), resumenObtenido.getTotalGastado());
    }



}
