-- Ejercicio 1
select apellidos || ', '|| nombre nombre_alumno, max_nota 
from 
	(select a.apellidos, a.nombre, max(aa.nota) max_nota from 
	alumnos a 
	join alumnos_asignaturas aa ON (aa.id_alumno = a.id)
	group by a.apellidos, a.nombre) 
order by max_nota desc 
FETCH FIRST 5 ROWS ONLY;

-- Ejercicio 2a
SELECT UPPER(nombre) NOMBRE, LOWER(APELLIDOS) APELLIDOS, TRUNC(MONTHS_BETWEEN(SYSDATE, FECHA_NACIMIENTO)/12) || ' ' || 'años' edad 
FROM ALUMNOS a
ORDER BY APELLIDOS asc;

/* Ejercicio 2b
 * SELECT upper(nombre) NOMBRE, lower(apellidos) APELLIDOS, concat(datediff(CURRENT_DATE, fecha_nacimiento), ' ', 'años') EDAD
FROM ALUMNOS a 
ORDER BY APELLIDOS asc; 
*/

-- Ejercicio 3
SELECT c.titulo, REPLACE(REPLACE(REPLACE(REPLACE(REPLACE(c.ARTISTA, 'a', 'A'), 'e', 'E'), 'i', 'I'), 'o', 'O'), 'u', 'U') ARTISTA
FROM CANCIONES c 
LEFT JOIN ALUMNOS_CANCIONES ac ON ac.ID_CANCION = c.ID 
WHERE ac.ID_ALUMNO IS NULL
ORDER BY REVERSE(c.TITULO) asc;

-- Ejercicio 4
SELECT p.NOMBRE, REPLACE(p.TITULACION, ' ', '_') TITULACION, a.NOMBRE
FROM PROFESORES p
INNER JOIN PROFESORES_CENTROS_ASIGNATURAS pca ON pca.ID_PROFESOR = p.ID 
INNER JOIN ASIGNATURAS a ON a.ID  = pca.ID_ASIGNATURA
INNER JOIN CENTROS c ON c.ID = pca.ID_CENTRO 
ORDER BY p.NOMBRE ASC;

-- Ejercicio 5
CREATE OR REPLACE VIEW vista_profesor AS 
SELECT p.nombre, p.titulacion 
FROM PROFESORES p 
WHERE p.titulacion LIKE 'Doctor%'
EXCEPT 
SELECT p.nombre, p.titulacion 
FROM PROFESORES p 
INNER JOIN PROFESORES_CENTROS_ASIGNATURAS pca ON pca.id_profesor = p.id
INNER JOIN CENTROS c ON pca.id_centro = c.id
WHERE c.localidad LIKE 'Madrid'
ORDER BY 1 ASC;

SELECT * FROM vista_profesor;

-- Ejercicio 6
SELECT a.NOMBRE || ' ' || a.APELLIDOS ALUMNO, CASE WHEN aa.NOTA < 5 THEN listagg(a2.NOMBRE, ', ') ELSE '<NINGUNA>' END SUSPENDIDAS
FROM ALUMNOS a
INNER JOIN ALUMNOS_ASIGNATURAS aa ON aa.ID_ALUMNO = a.ID 
INNER JOIN ASIGNATURAS a2 ON aa.ID_ASIGNATURA = a2.ID
GROUP BY a.NOMBRE, a.APELLIDOS, aa.NOTA 
ORDER BY ALUMNO;
