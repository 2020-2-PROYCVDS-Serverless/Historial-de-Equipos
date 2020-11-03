create table Laboratorio (
	id varchar(10) primary key,
	fechaCreacion date not null
);

create table Registro (
	id varchar(5) primary key,
	fechaRegistro timestamp not null,
	detalles text,
	cantidadSolicitada int not null,
	laboratorioID varchar(10) not null references Laboratorio(id) on delete cascade
);

create table Equipo (
	nombre varchar primary key,
	laboratorioID varchar(10) not null references Laboratorio(id),
	registroID varchar(5) not null references Registro(id)
);

create table ElementoEquipo (
	id serial primary key,
	descripcion text,
	condicion char not null,
	registroID varchar(5) not null references Registro(id),
	equipoID varchar references Equipo(nombre)
);

create table Novedad (
	fecha timestamp,
	computador varchar references Equipo(nombre) on delete cascade,
	detalle text,
	primary key (fecha, computador)
);