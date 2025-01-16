use espanya;

/* 1º Ejercicio */
SELECT nombre_es
FROM comunidades_autonomas
WHERE nombre_es LIKE '%Comunidad%';


/* 2º Ejercicio */
select p.nombre
from comunidades_autonomas ca
join provincias p on (p.id_com_auto = ca.id)
where ca.nombre = 'Andalucía';

/* 3º Ejercicio */
select nombre
from provincias 
where nombre LIKE 'C%';

/* 4º Ejercicio */
select nombre 
from comunidades_autonomas ca
order by 1 asc;

/* 5º Ejercicio */
select nombre
from provincias p
order by length(p.nombre) desc
limit 5;

/* 6º Ejercicio */
SELECT nombre
FROM municipios
WHERE nombre LIKE '%San%';

/* 7º Ejercicio */
SELECT nombre
FROM municipios
WHERE nombre LIKE 'Vill%o';

/* 8º Ejercicio */
select * from 
(select p.nombre, count(1) numero
from provincias p
join municipios m on p.id = m.id_provincia
group by p.id)aux1
where numero > 50;

/* 9º Ejercicio */
select m.nombre
from municipios m
join provincias p on (p.id = m.id_provincia)
where m.nombre = p.nombre;

/* 10º Ejercicio */
select nombre
from municipios
group by nombre having count(1)>1;

/* 11º Ejercicio */
select p.nombre
from provincias p
join comunidades_autonomas ca on (p.id_com_auto = ca.id)
where ca.nombre like 'C%';

/* 12º Ejercicio */
select p.nombre
from provincias p
join municipios m on (p.id = m.id_provincia)
where m.nombre like '%Real%'
group by p.nombre;

/* 13º Ejercicio */
select p.nombre
from municipios m
join provincias p on (p.id = m.id_provincia)
where length(m.nombre) < 10 
group by p.nombre;

/* 14º Ejercicio */
select nombre_es
from comunidades_autonomas
where nombre_es not like '%Comunidad%';

/* 15º Ejercicio */
select m.nombre
from municipios m
join provincias p on (p.id = m.id_provincia)
where p.nombre like '%a';

/* 16º Ejercicio */
select p.nombre
from provincias p
join municipios m on (p.id = m.id_provincia)
where m.nombre like '%Santa%'
group by p.nombre having count(1) > 10;

/* 17º Ejercicio */
select m.nombre
from municipios m
join provincias p on (p.id = m.id_provincia)
join comunidades_autonomas ca on (p.id = m.id_provincia)
where m.nombre = ca.nombre;

/* 18º Ejercicio */
select ca.nombre, count(1) num_prov
from comunidades_autonomas ca
join provincias p on (ca.id = p.id_com_auto)
group by ca.nombre
order by 2 desc;




