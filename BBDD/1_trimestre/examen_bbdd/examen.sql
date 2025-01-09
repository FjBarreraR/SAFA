create database hoteles;
use hoteles;
create table cliente(
	id int(10) auto_increment primary key,
	nombre varchar(150) not null,
	apellido1 varchar(150) not null,
	apellido2 varchar(150) not null,
	NIF varchar(50) not null,
	email varchar(100),
	movil int(20),
	fec_nacimiento date not null,
	nacionalidad varchar(50)
);

create table medio_transporte( -- creamos la tabla medios de transporte --
	id int(10) auto_increment primary key, -- creamos la clave primaria --
	tipo varchar(100) not null, -- creamos una columna nueva -- 
	company varchar(150) not null -- creamos otra columna --
);
create table lugar(
	id int(10) auto_increment primary key,
	nombre varchar(150) not null,
	pais varchar(100) not null,
	coste_dia_promedio int(50) not null
);
create table viaje(
	id int(10) auto_increment primary key,
	id_cliente int(10),
	fecha_salida date not null,
	fecha_llegada date not null,
	foreign key (id_cliente) references hoteles.cliente(id)
);
create table hotel(
	id int(10) auto_increment primary key,
	nombre varchar(150) not null,
	cadena varchar(150) not null,
	estrellas int(10),
	hora_entrada time not null,
	hora_salida time not null,
	id_lugar int(10),
	foreign key (id_lugar) references hoteles.lugar(id)
);
create table estancia(
	id int(10) auto_increment primary key,
	id_hotel int(10),
	id_viaje int(10),
	fecha_llegada date not null,
	fecha_salida date not null,
	coste int(10) not null,
	foreign key (id_hotel) references hoteles.hotel(id),
	foreign key (id_viaje) references hoteles.viaje(id)
);
create table transporte(
	id int(10) auto_increment primary key,
	id_origen int(10),
	id_destino int(10),
	id_medio_transporte int(10),
	id_viaje int(10),
	coste int(10) not null,
	fecha_salida datetime not null,
	fecha_entrada datetime not null,
	lugar_salida varchar(100) not null,
	lugar_llegada varchar(100) not null,
	foreign key (id_origen) references hoteles.lugar(id),
	foreign key (id_destino) references hoteles.lugar(id),
	foreign key (id_medio_transporte) references hoteles.medio_transporte(id),
	foreign key (id_viaje) references hoteles.viaje(id)
);

insert into cliente(nombre, apellido1, apellido2, NIF, fec_nacimiento) values
('fran', 'barrera', 'roman', '123456789A', '2004-12-21'),
('antonio', 'rodriguez', 'roman', '987654321B', '2005-10-02'),
('ivan', 'ramos', 'villegas', '789123456Y', '2004-11-11');

insert into medio_transporte(tipo, company) values
('autobus', 'tussam'),
('coche', 'uber'),
('furgoneta', 'taxi');

insert into lugar(nombre, pais, coste_dia_promedio) values
('fran', 'italia', '50'),
('antonio', 'marruecos', '25'),
('ivan', 'estados unidos', '200');

insert into viaje(fecha_salida, fecha_llegada) values
('2024-05-25', '2024-06-23'),
('2024-04-26', '2024-07-26'),
('2024-12-21', '2025-01-26');

insert into hotel(nombre, cadena, hora_entrada, hora_salida) values
('fran', 'NH', '09:00', '12:00'),
('antonio', 'Mellia', '09:00', '12:00'),
('ivan', 'NH', '09:00', '12:00');

insert into estancia(fecha_llegada, fecha_salida, coste) values
('2024-06-23', '2024-05-25','1250'),
('2024-07-26', '2024-04-26','2000'),
('2024-12-21', '2025-01-26','3326');

insert into transporte(coste, fecha_salida, fecha_entrada, lugar_salida, lugar_llegada) values
('1250', '2024-06-23', '2024-05-25', 'italia', 'españa'),
('2000', '2024-07-26', '2024-04-26', 'marruecos', 'españa'),
('3326', '2025-01-26', '2024-12-21', 'estados unidos', 'españa');

-- drop table cliente --