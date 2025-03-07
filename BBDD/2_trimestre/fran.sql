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
select nombre, fecha_nacimiento
from jugadores;