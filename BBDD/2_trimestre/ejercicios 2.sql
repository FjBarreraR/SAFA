use musica;


/* Ejercicios Cantantes */

/* 1º Ejercicio */
select sum(escuchas_mensuales) escuchas_totales
from cantantes;

/* 2º Ejercicio */
select avg(escuchas_mensuales) escuchas_totales
from cantantes;

/* 3º Ejercicio */
select nombre, escuchas_mensuales
from cantantes
order by escuchas_mensuales desc
limit 1;

/* 4º Ejercicio */
select nombre, seguidores_redes
from cantantes
order by seguidores_redes asc
limit 1;

/* 5º Ejercicio */
select nombre, seguidores_redes
from cantantes
where seguidores_redes > 100000000;

/* 6º Ejercicio */
select avg(seguidores_redes) seguidores
from cantantes;

/* 7º Ejercicio */
select sum(albums_lanzados)
from cantantes;

/* 8º Ejercicio */
select nombre, albums_lanzados
from cantantes
order by albums_lanzados desc
limit 1;

/* 9º Ejercicio */
select nombre, albums_lanzados
from cantantes
where albums_lanzados > 5;

/* 10º Ejercicio */
select avg(seguidores_redes), pais_origen
from cantantes
where pais_origen = 'Colombia';

/* 11º Ejercicio */
select nombre, fecha_nacimiento
from cantantes
order by fecha_nacimiento desc
limit 1;

/* 12º Ejercicio */
select nombre, abs(escuchas_mensuales - seguidores_redes)
from cantantes
order by 2 desc
limit 1;

/* 13º Ejercicio */
select count(genero)
from cantantes
where genero = 'Pop';

/* 14º Ejercicio */
select avg(escuchas_mensuales), genero
from cantantes
where genero = 'Reggaetón';

/* 15º Ejercicio */
select nombre, fecha_nacimiento
from cantantes
where fecha_nacimiento > '1990-01-01';

/* 16º Ejercicio */
select sum(escuchas_mensuales), genero
from cantantes
where genero = 'Reggaetón';

/* 17º Ejercicio */
select nombre, albums_lanzados, escuchas_mensuales
from cantantes
where escuchas_mensuales > 500000000
order by albums_lanzados asc 
limit 1;

/* 18º Ejercicio */
select abs(avg(timestampdiff(year,current_date(), fecha_nacimiento)))
from cantantes;
/*
select avg(datediff(current_date(), fecha_nacimiento)/365)
from cantantes; 
*/

/* 19º Ejercicio */
select count(nombre)
from cantantes
where albums_lanzados > 7;

/* 20º Ejercicio */
select nombre, escuchas_mensuales, seguidores_redes
from cantantes
where escuchas_mensuales > 600000000 and seguidores_redes > 200000000;

/* 21º Ejercicio */
select count(nombre), genero, pais_origen
from cantantes
where genero = 'Pop' and pais_origen = 'España';

/* 22º Ejercicio */
select avg(escuchas_mensuales), pais_origen
from cantantes
where pais_origen = 'España';

/* 23º Ejercicio */
select nombre, albums_lanzados, genero
from cantantes
where genero = 'Reggaetón'
order by albums_lanzados desc
limit 1;

/* 24º Ejercicio */
select sum(seguidores_redes), pais_origen
from cantantes
where pais_origen = 'Colombia';

/* 25º Ejercicio */
select nombre, escuchas_mensuales, pais_origen
from cantantes
where escuchas_mensuales > 600000000 and pais_origen = 'España';

/* 26º Ejercicio */
select count(nombre)
from cantantes
where genero = 'Flamenco/Pop' or genero = 'Pop/Rap';

/* 27º Ejercicio */
select avg(albums_lanzados)
from cantantes
where genero = 'Reggaetón';

/* 28º Ejercicio */
select nombre, escuchas_mensuales, albums_lanzados
from cantantes
where escuchas_mensuales > 500000000 and albums_lanzados > 8;

/* 29º Ejercicio */
select nombre, seguidores_redes, genero
from cantantes
where genero = 'Reggaetón' or genero = 'Pop'
order by seguidores_redes desc
limit 1;

/* 30º Ejercicio */
select sum(escuchas_mensuales)
from cantantes
where fecha_nacimiento > '1990-01-01';

/* 31º Ejercicio */
select count(nombre)
from cantantes
where albums_lanzados > 10;

/* 32º Ejercicio */
select avg(seguidores_redes)
from cantantes
where pais_origen = 'Colombia';

/* 33º Ejercicio */
select nombre, escuchas_mensuales, seguidores_redes
from cantantes
where escuchas_mensuales < 300000000 and seguidores_redes >= 100000000;

/* 34º Ejercicio */
WITH PromediosGenero AS (
    SELECT 
        genero,
        AVG(escuchas_mensuales) AS promedio_escuchas
    FROM 
        cantantes
    WHERE 
        genero IN ('Reggaetón', 'Pop')
    GROUP BY 
        genero
)
SELECT 
    ABS(
        (SELECT promedio_escuchas FROM PromediosGenero WHERE genero = 'Reggaetón') -
        (SELECT promedio_escuchas FROM PromediosGenero WHERE genero = 'Pop')
    ) AS diferencia_promedio;
   
/* 35º Ejercicio */
select nombre, abs(timestampdiff(year,current_date(), fecha_nacimiento))
from cantantes
order by fecha_nacimiento asc 
limit 1;

/* 36º Ejercicio */
select count(nombre)
from cantantes
where albums_lanzados > 5;

/* 37º Ejercicio */
select sum(seguidores_redes)
from cantantes
where genero = 'R&B';

/* 38º Ejercicio */
select nombre, seguidores_redes, escuchas_mensuales
from cantantes
where seguidores_redes > 200000000 and escuchas_mensuales > 500000000;

/* 39º Ejercicio */
select avg(escuchas_mensuales)
from cantantes
where albums_lanzados > 5;

/* 40º Ejercicio */
select nombre, albums_lanzados, seguidores_redes
from cantantes
where albums_lanzados > 5 and seguidores_redes > 200000000;