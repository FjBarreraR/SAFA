/* Ejercicio 1 */
select titulo , char_length(titulo) longitud_caracteres, length(titulo) longitud_bytes
from libros;

/* Ejercicio 2 */
select upper(titulo)
from libros;

/* Ejercicio 3 */
select substr(titulo, 1, 10)
from libros;

/* Ejercicio 4 */
select concat(titulo, " ", "-", " ",autor)
from libros;

/* Ejercicio 5 */
select round(precio, 1)
from libros;

/* Ejercicio 6 */
select ltrim(titulo)
from libros;

/* Ejercicio 7 */
select replace(titulo, "El", "La")
from libros;

/* Ejercicio 8 */
select abs(precio - 20)
from libros;

/* Ejercicio 9 */
SET lc_time_names = 'es_ES';
select date_format(fecha_publicacion,'%d/%m/%Y')
from libros;

/* Ejercicio 10 */
select extract(year from fecha_publicacion)
from libros;

/* Ejercicio 11 */
select titulo
from libros
having titulo = "%de%";

/* Ejercicio 12 */
SELECT titulo, LENGTH(titulo) longitud, concat(upper(substr(titulo, 1, 6)), lower(substr(titulo, 7, char_length(titulo))))
FROM libros;

/* Ejercicio 13 */
select avg(precio)
from libros;

select * from libros where precio > (select avg(precio) from libros);

/* Ejercicio 14 */
select concat(datediff(current_date(), fecha_publicacion))
from libros;

/* Ejercicio 15 */
select round(power(precio, 2)) 
from libros;

/* Ejercicio 16 */


/* Ejercicio 17 */
select current_date() , titulo
from libros
where date_add(current_date(), interval -50 year);

