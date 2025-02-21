# 1.Obtén el nombre de los usuarios y el nombre de los intereses que siguen. 
select u.nombre, i.nombre 
from usuarios u 
inner join intereses i 
on u.id = i.id;

# 2.Muestra todos los usuarios, junto con los eventos a los que están participando. Si un usuario no participa en ningún evento, igual debe aparecer en el resultado. 
select u.nombre, e.nombre 
from usuarios u 
left join eventos e 
on u.id = e.id;

# 3. Obtén todos usuarios que siguen intereses.Igualmente, muestra los intereses no seguidos por usuarios (si los hubiera). 
select u.nombre, i.nombre 
from usuarios u 
right join intereses i 
on u.id = i.id;

# 4.Muestra todas las comunidades y los usuarios relacionados con ellas (como moderadores). Si alguna comunidad no tiene moderadores o si algún moderador no está asociado a ninguna comunidad, también deben aparecer. 
select c.nombre, u.nombre
from comunidades c
right join moderacion m on c.id = m.id_comunidad 
right join usuarios u on u.id = m.id_usuario 
union
select c.nombre, u.nombre
from comunidades c
left join moderacion m on c.id = m.id_comunidad 
left join usuarios u on u.id = m.id_usuario;

# 5.Genera todas las combinaciones posibles de usuarios e intereses. 
select u.nombre , i.nombre 
from usuarios u
cross join intereses i;

# 6. Lista los nombres de los usuarios que han participado en el evento "Concierto Rock". 
select u.nombre, e.nombre 
from usuarios u 
inner join eventos e 
on u.id = e.id
where e.nombre like 'Concierto Rock';

# 7.Muestra los eventos y las comunidades que tienen la misma ubicación (considera que en este caso ubicacion puede estar en ambas tablas). 
select e.nombre, c.nombre 
from eventos e
inner join comunidades c 
on e.id = c.id;

# 8. Obtén los nombres de los usuarios y las comunidades que moderan. 
select c.nombre ,u.nombre
from comunidades c 
inner join moderacion m  on c.id = m.id_comunidad 
inner join usuarios u on u.id= m.id_usuario;

# 9. Muestra todos los usuarios y los eventos en los que no han participado. 
select u.nombre, e.ubicacion 
from usuarios u 
right join participaciones p on u.id = p.id_usuario 
right join eventos e on p.id_evento = e.id;

# 10. Obtén los usuarios que siguen tanto "Música" como "Videojuegos". 
select u.nombre, i.nombre 
from usuarios u 
inner join seguimientos s on u.id = s.id_usuario 
inner join intereses i  on s.id_interes = i.id 
where i.nombre like 'Música' or i.nombre like 'Videojuegos';

# 11. Lista todos los usuarios que no siguen ningún interés. 
select u.nombre, i.nombre 
from usuarios u 
inner join seguimientos s on u.id = s.id_usuario 
inner join intereses i  on s.id_interes = i.id 
where i.nombre like null ;

# 12. Encuentra las comunidades creadas en 2024 y los usuarios que son moderadores en dichas comunidades. 
select c.nombre, u.nombre, c.nombre 
from comunidades c 
inner join moderacion m ON c.id = m.id_comunidad 
inner join usuarios u on m.id_usuario = u.id  
where extract(year from c.fecha_creacion) = 2024;

# 13. Muestra los eventos con la descripción "Torneo nacional de videojuegos" y los usuarios que participan en ellos. 
select u.nombre, e.nombre , e.descripcion 
from eventos e 
inner join participaciones p on e.id = p.id_evento
inner join usuarios u on p.id_usuario = u.id 
where e.descripcion like 'Torneo nacional de videojuegos';

# 14. Obtén los usuarios que no moderan ninguna comunidad. 
select u.nombre , c.nombre 
from usuarios u 
left join moderacion m on u.id = m.id_usuario
left join comunidades c on m.id_comunidad = c.id
where c.nombre is null;

# 15. Lista las combinaciones de usuarios y eventos, mostrando el nombre de cada usuario y el nombre de cada evento
select u.nombre, e.nombre 
from usuarios u 
cross join eventos e; 

# 16. Muestra los intereses que no son seguidos por ningún usuario
select i.nombre intereses
from intereses i 
left join seguimientos s on i.id = s.id_interes 
left join usuarios u  on s.id_usuario = u.id
where u.nombre is null;


# 17. Encuentra los eventos que no tienen participaciones.
select e.nombre 
from eventos e 
left join participaciones p on e.id = p.id_evento
left join usuarios u on p.id_usuario = u.id
where u.nombre is null;

# 18. Muestra las comunidades junto con el rol que desempeñan los usuarios en ellas.
select c.nombre, u.nombre, m.rol 
from comunidades c 
inner join moderacion m on c.id = m.id_comunidad
inner join usuarios u on m.id_usuario = u.id;

# 19. Lista los usuarios que siguen intereses pero no han participado en ningún evento.
select u.nombre
from intereses i 
inner join seguimientos s on i.id = s.id_interes 
inner join usuarios u on s.id_usuario = u.id 
inner join participaciones p on u.id = p.id_usuario 
inner join eventos e on p.id_evento = e.id
where p.id_evento is null;

# 20. Encuentra las relaciones entre usuarios y comunidades que moderan, mostrando tanto el nombre del usuario como el rol en la comunidad.
select u.nombre, c.nombre, m.rol 
from usuarios u 
inner join moderacion m on u.id = m.id_usuario
inner join comunidades c on m.id_comunidad = c.id;

# 21. Encuentra las combinaciones de usuarios e intereses, pero solo muestra los casos en que el usuario sigue el interés.
select u.nombre, i.nombre
from usuarios u 
inner join seguimientos s on u.id = s.id_usuario
inner join intereses i on s.id_interes = i.id
where s.id_usuario is not null;

# 22. Muestra las combinaciones de usuarios y edades permitidas, comparando sexo y rangos de edad.
select u.*
from usuarios u
inner join edades_permitidas ep on ep.sexo = u.sexo 
where datediff(now(), u.fecha_nacimiento) > ep.edad_minima and datediff(now(), u.fecha_nacimiento) < ep.edad_maxima; 


# 23. Lista las comunidades y los usuarios que son administradores en ellas.
select u.nombre, c.nombre, m.rol
from comunidades c 
inner join moderacion m on c.id = m.id_comunidad
inner join usuarios u on m.id_usuario = u.id
where m.rol like 'administrador';

# 24. Encuentra los eventos y los usuarios que participan en ellos, pero solo muestra los eventos con más de un participante.
select *
from (select e.nombre, u.nombre nombre_e, count(1) contador
from eventos e 
inner join participaciones p on e.id = p.id_evento 
inner join usuarios u on p.id_usuario = u.id
group by e.nombre)aux
where aux.contador > 1;

# 25. Muestra los usuarios que no han seguido ningún interés ni participado en ningún evento. 
select u.nombre 
from intereses i 
inner join seguimientos s on i.id = s.id_interes 
inner join usuarios u on s.id_usuario = u.id 
inner join participaciones p on u.id = p.id_usuario 
inner join eventos e on p.id_evento = e.id 
where s.id_usuario is null and p.id_usuario is null;

# 26. Lista las comunidades sin ningún moderador. 
select c.nombre , m.rol
from usuarios u  
right join moderacion m on u.id = m.id_usuario 
right join comunidades c on m.id_comunidad = c.id
where u.nombre is null;

# 27. Encuentra los usuarios mayores de 20 años que han participado en eventos. 
select  u.nombre 
from usuarios u 
inner join participaciones p on u.id = p.id_usuario 
inner join eventos e on p.id_evento = e.id
where datediff(current_date(), u.fecha_nacimiento) > 7.300;

# 28. Muestra los intereses seguidos por al menos dos usuarios. 
select *
from (select i.nombre, count(1) contador
from intereses i 
inner join seguimientos s on i.id = s.id_interes 
inner join usuarios u on s.id_usuario = u.id
group by i.nombre)aux
where aux.contador > 1;

# 29. Encuentra los eventos programados para abril de 2025 y los usuarios que los han confirmado. 
select u.nombre, e.nombre , e.fecha 
from eventos e 
inner join participaciones p on e.id = p.id_evento 
inner join usuarios u on p.id_usuario = u.id
where extract(year from e.fecha) = 2025 and extract(month from e.fecha) = 4;

# 30. Lista las comunidades y el número de moderadores que tienen. 
select *
from (
select c.nombre, count(1) contador
from comunidades c  
left join moderacion m on c.id = m.id_comunidad 
left join usuarios u on m.id_usuario = u.id
group by c.nombre) aux;

# 31. Muestra los usuarios que siguen intereses relacionados con "Música" pero no han participado en el "Concierto Rock"
select u.nombre 
from intereses i 
inner join seguimientos s on i.id = s.id_interes 
inner join usuarios u on s.id_usuario = u.id 
inner join participaciones p on u.id = p.id_usuario 
inner join eventos e on p.id_evento = e.id 
where i.nombre like 'Música' and e.nombre not like 'Concierto Rock';

# 32. Lista los eventos que tienen el mismo nombre que alguna comunidad. 
select e.nombre 
from eventos e 
inner join participaciones p on e.id = p.id_evento 
inner join usuarios u on p.id_usuario = u.id
inner join moderacion m on  u.id = m.id_usuario 
inner join comunidades c on m.id_comunidad = c.id 
where e.nombre = c.nombre;

# 33. Encuentra los usuarios que son administradores en más de una comunidad. 
select *
from (select u.nombre, count(1) contador
from usuarios u
inner join moderacion m on u.id = m.id_usuario
inner join comunidades c on m.id_comunidad = c.id
where m.rol like 'administrador'
group by m.rol)aux
where aux.contador > 1;

# 34. Muestra los usuarios que moderan comunidades creadas en 2024. 
select u.nombre, c.nombre, c.fecha_creacion 
from usuarios u 
inner join moderacion m on u.id = m.id_usuario 
inner join comunidades c on m.id_comunidad = c.id 
where extract(year from c.fecha_creacion) = 2024;

# 35. Lista los eventos sin usuarios participantes y las comunidades sin moderadores, en una misma consulta. 
select e.nombre, c.nombre 
from eventos e 
inner join participaciones p on e.id = p.id_evento 
inner join usuarios u on p.id_usuario = u.id 
inner join moderacion m on u.id = m.id_usuario 
inner join comunidades c on m.id_comunidad = c.id 
where u.nombre is null;

# 36. Encuentra los usuarios y las comunidades que moderan, pero incluye también a los usuarios que no moderan ninguna comunidad. 
select u.nombre, c.nombre 
from usuarios u 
left join moderacion m on u.id = m.id_usuario 
left join comunidades c on m.id_comunidad = c.id;

# 37. Muestra los eventos a los que no ha asistido ningún usuario con más de 20 años. 
select * from (select u.nombre, e.nombre e_nombre, abs(timestampdiff(year, now(), u.fecha_nacimiento))edad
from usuarios u
join participaciones p on u.id = p.id_usuario 
join eventos e on e.id = p.id_evento)aux
where  edad > 20;