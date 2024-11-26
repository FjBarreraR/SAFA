drop database autobuses;
create database autobuses;

use autobuses;

create table parada (
	id int(10) auto_increment primary key,
	ubicacion varchar(150) not null,
	codigo varchar(150) not null
);

create table ciudad (
	id int(10) auto_increment primary key,
	nombre varchar(150) not null,
	comunidad varchar(150) not null,
	codigo_postal int(1) not null
);

create table conductor (
	id int(10) auto_increment primary key,
	nombre varchar(150) not null,
	apellidos varchar(150) not null,
	codigo_carnet varchar(150) not null,
	fecha_nacimiento date not null
);

create table linea (
	id int(10) auto_increment primary key,
	nombre varchar(150) not null,
	id_ciudad int(10),
	foreign key (id_ciudad) references autobuses.ciudad(id)
);

create table autobus (
	id int(10) auto_increment primary key,
	codigo varchar(150) not null,
	nombre varchar(150) not null,
	tipo int(1) not null,
	id_linea int(10),
	foreign key (id_linea) references autobuses.linea(id)
);

create table itinerario (
	id_parada int(10),
	id_autobus int(10),
	orden int(10) not null,
	primary key (id_parada, id_autobus)
);

create table autobus_conductor (
	id_autobus int(10),
	id_conductor int(10),
	foreign key (id_autobus) references autobuses.autobus(id),
	foreign key (id_conductor) references autobuses.conductor(id)
);



