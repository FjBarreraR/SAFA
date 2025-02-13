select concat(ifnull(p.nick,p.nombre),
 case when p.apellido is null then '' else concat(' ',p.apellido) end)nombre,
 c.caracteristicas,
 a.nombre asignatura_favorita,
 per2.nombre profesor_asignatura_odiada
from personaje p
join casa c on (p.id_casa = c.id)
join alumno al on (p.id = al.id)
join asignatura a on (a.id = al.id_asignatura_fav)
join asignatura a2 on (a2.id = al.id_asignatura_odiada)
join profesor_asignatura pa on (pa.id_asignatura = a2.id)
join profesor p2 on (pa.id_profesor = p2.id)
join personaje per2 on (p2.id = per2.id)
where p.fecha_nacimiento < '1980-08-01'
order by 1, 4;


SELECT 
    concat(UPPER(p.nombre),' (',p.sexo ,')') AS personaje, 
    c.nombre AS casa, 
    case when (r.nombre in ('Humano','Elfo') and p.sexo = 'Femenino')
    then concat(substring(r.nombre,1,char_length(r.nombre)-1),'a')
    else r.nombre end raza, 
    cat.nombre AS categoria, 
    YEAR(p.fecha_nacimiento) AS anio_nacimiento,
    timestampdiff(year, p.fecha_nacimiento, '2000-01-01') edad_en_2000_01_01
FROM personaje p
JOIN casa c ON p.id_casa = c.id
JOIN raza r ON p.id_raza = r.id
JOIN categoria cat ON p.id_categoria = cat.id
-- where substring(p.apellido,1,1) in ('G','H','L','M');
where p.apellido > 'G'
ORDER BY anio_nacimiento;

SELECT 
    CONCAT(UPPER(p.nombre), ' ', LOWER(p.apellido)) AS nombre_profesor,
    a.nombre AS asignatura,
	concat(upper(substring(c.fundador,1,4)),'...',right(c.nombre,4)) AS funda_casa,
    timestampdiff(year, p.fecha_nacimiento, now()) AS anyos_si_vivo
FROM profesor pr
JOIN personaje p ON pr.id = p.id
JOIN profesor_asignatura pa ON pr.id = pa.id_profesor
JOIN asignatura a ON pa.id_asignatura = a.id
JOIN casa c ON p.id_casa = c.id
ORDER BY anyos_si_vivo DESC;

select ifnull(p.nick,p.nombre) nombre, 
reverse(r.nombre) raza,
ifnull(p.fecha_nacimiento,'Desconocida') fecha_nacimiento
from personaje p 
join raza r on (p.id_raza = r.id)
where r.nombre != 'Humano';

SELECT 
    CONCAT(UPPER(p.nombre), ' ', LOWER(p.apellido)) AS nombre_completo,
    concat(left(c.fundador,5),c.anio_fundacion) AS fund,
    a.nombre AS asignatura_fav,
    DATE_FORMAT(p.fecha_nacimiento, '%d/%m/%Y') AS fnac,
    DATEDIFF((select fecha_nacimiento from personaje where nombre ='Harry'),
    p.fecha_nacimiento) dif_dias_Harry_Potter
FROM personaje p
JOIN casa c ON p.id_casa = c.id
JOIN alumno al ON p.id = al.id
JOIN asignatura a ON al.id_asignatura_fav = a.id
ORDER BY p.fecha_nacimiento;

