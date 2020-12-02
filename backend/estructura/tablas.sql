create table Laboratorio (
	id varchar primary key,
	disponible bool not null default true,
	creacion date not null default current_date,
	cierre date default null
);

create table Registrable (
	id varchar primary key,
	descripcion text,
	disponible bool not null default true,
	condicion bool not null,
	nombre varchar
);

create table Equipo (
	id varchar primary key references Registrable(id),
	labID varchar references Laboratorio(id) default null
);

create table ElementoEquipo (
	id varchar primary key references Registrable(id),
	equipoID varchar references Equipo(id) default null,
	tipo char not null
);

create table Inventario (
	fechaRegistro date default current_date,
	registrableID varchar references Registrable(id),
	detalle text,
	primary key (fechaRegistro, registrableID)
);

create table Novedad (
	registrableID varchar references Registrable(id),
	fechaHora timestamp default now(),
	titulo varchar not null,
	responsable varchar not null,
	detalle text,
	primary key (registrableID, fechaHora)
);