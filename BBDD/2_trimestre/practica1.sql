SET lc_time_names = 'es_ES';
select id * 2, nombre_producto producto, categoria, date_format(fecha_caducidad,'%W, %d/%m/%Y') fecha_caducidad, abs(round(((precio * descuento)-precio), 2)) precio_con_descuento, pais_origen origen, stock, concat(categoria, pais_origen) detalle	
from productos_supermercado ps 
where categoria = "Lácteos";


select pais_origen pais, count(nombre_producto) total_productos, sum(precio * stock) valor_total, round(avg(precio), 2) precio_promedio, fecha_caducidad ultima_caducidad,  datediff(current_date(),date(min(fecha_registro))) primer_registro
from productos_supermercado ps
group by pais_origen
order by valor_total desc;
