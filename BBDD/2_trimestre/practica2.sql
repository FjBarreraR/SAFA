/* Ejercicio 1 */
select j.nombre asesinado, j2.nombre asesino, j.habilidad_principal habilidad_asesinado, j2.habilidad_principal habilidad_asesino, m.causa 
from muertes m
left join jugadores j on j.id = m.id_jugador
left join jugadores j2 on j2.id = m.id_asesino
where m.causa = 'emboscada'
order by j2.habilidad_principal desc;

/* Ejercicio 2 */
select a.nombre arma, case when (j.tipo in ("futbolista")) then concat(j.nombre,' (',e.nombre, ')') else j.nombre  end jugador
from armas a
left join armas_ganadas ag on a.id = ag.id_arma 
left join jugadores j on ag.id_jugador = j.id
left join equipos e on j.id_equipo = e.id;

/* Ejercicio 3 */
select e.nombre
from equipos e
left join jugadores j on e.id = j.id_equipo 
left join parejas p on j.id = p.id_futbolista
where p.id_futbolista is null and p.id_tributo is null;

/* Ejercicio 4 */
select upper(substr(j.nombre, 1, char_length(j.nombre))) futbolista, concat('<', e.nombre, '>') equipo_del_futbolista, j.nombre tributo, jp.nombre ganadores_del_juego 
from jugadores j
left join equipos e on e.id = j.id_equipo
left join parejas p on j.id = p.id_futbolista
left join partidas par on p.id = par.id_pareja_ganadora 
left join juegos_poki jp on par.id = jp.nombre 
order by j.nombre asc;

/* Ejercicio 5 */
select j.nombre asesinado_despues, j2.nombre nombre_asesinado_antes, timediff(m.hora_muerte, m2.hora_muerte) intervalo 
from muertes m 
join muertes m2 on m.id != m2.id and m.hora_muerte > m2.hora_muerte
left join jugadores j on m.id_jugador = j.id 
left join jugadores j2 on m2.id_jugador = j2.id
order by intervalo asc
limit 1;