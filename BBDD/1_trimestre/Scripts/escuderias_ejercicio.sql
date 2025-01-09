drop database escuderias_ejercicio
create database escuderias_ejercicio

create table escuderia (
	id int(10) auto_increment primary key,
	nombre varchar(100) not null,
	fecha_fundacion date not null
);

create table gran_premio (
	id int(10) auto_increment primary key,
	fecha date not null,
	ubicacion varchar(255) not null
);

create table piloto (
	id int(10) auto_increment primary key,
	nombre varchar(100) not null,
	apellidos varchar(100) not null,
	dni varchar(9) not null,
	fecha_nacimiento date not null
);

create table coche (
	id int(10) auto_increment primary key,
	modelo varchar(255) not null,
	motor varchar(255) not null,
	id_escuderia int(10),
	foreign key (id_escuderia) references escuderias.escuderia(id)
);

create table contrato (
	id_piloto int(10),
	id_escuderia int(10),
	id_coche int(10),
	temporada int(4) not null,
	salario double not null,
	foreign key (id_piloto) references escuderias.piloto(id),
	foreign key (id_escuderia) references escuderias.escuderia(id),
	foreign key (id_coche) references escuderias.coche(id)
);

create table clasificacion (
	id_gran_premio int(10),
	id_piloto int(10),
	posicion int(2) not null,
	puntos int(2) not null,
	foreign key (id_gran_premio) references escuderias.gran_premio(id),
	foreign key (id_piloto) references escuderias.piloto(id),
)