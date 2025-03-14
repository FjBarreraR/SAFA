ALTER SESSION SET CURRENT_SCHEMA = C##FUTJDH;

-- Ejercicio 1
select nombre, id_equipo, habilidad_principal
from jugadores;

-- Ejercicio 2
select nombre
from jugadores
where tipo = 'futbolista';

-- Ejercicio 3
select nombre
from equipos
order by nombre;

-- Ejercicio 4
select habilidad_principal
from jugadores
group by habilidad_principal;

-- Ejercicio 5
select nombre, TRUNC(MONTHS_BETWEEN(SYSDATE, fecha_nacimiento)/12) edad
from jugadores;

-- Ejercicio 6
select nombre, decode(id_equipo,null,'no tiene', id_equipo) id_equipo
from jugadores;

-- Ejercicio 7
select nombre || ' ' || habilidad_principal
from jugadores;

-- Ejercicio 8
select nombre, to_char(fecha_nacimiento, '"Lunes" DD "de enero de " YYYY') fecha_nacimiento
from jugadores;

-- Ejercicio 9
select TRUNC(MONTHS_BETWEEN(SYSDATE, fecha_nacimiento)/12) anyos_pasados
from jugadores;

-- Ejercicio 10
select nombre, Case when TRUNC(MONTHS_BETWEEN(SYSDATE, fecha_nacimiento)/12)<25 then 'Menor de edad' else 'Mayor de edad' end mayor_mejor_de_edad
from jugadores;

-- Ejercicio 11
