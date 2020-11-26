create table Laboratorio (
	id varchar primary key,
	disponible bool not null,
	creacion date not null,
	cierre date
);

create table Registrable (
	id varchar primary key,
	descripcion text,
	disponible bool not null,
	condicion bool not null,
	nombre varchar
);

create table Equipo (
	id varchar primary key references Registrable(id),
	labID varchar references Laboratorio(id)
);

create table ElementoEquipo (
	id varchar primary key references Registrable(id),
	equipoID varchar references Equipo(id),
	tipo char not null
);

create table Inventario (
	fechaRegistro date,
	registrableID varchar references Registrable(id),
	detalle text,
	primary key (fechaRegistro, registrableID)
);

create table Novedad (
	registrableID varchar references Registrable(id),
	fechaHora timestamp,
	titulo varchar not null,
	responsable varchar not null,
	detalle text,
	primary key (registrableID, fechaHora)
);