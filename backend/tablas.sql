create table Usuario (
	carnet varchar primary key,
	nombre varchar not null,
	email varchar not null
);

create table Credencial (
	username varchar primary key,
	pass varchar not null,
	usuarioID varchar not null references Usuario(carnet) on delete cascade
);

create table Administrador (
	usuarioID varchar primary key references Usuario(carnet) on delete cascade
);

create table Laboratorio (
	id varchar(10) primary key,
	fechaCreacion date not null
);

create table EncargadoLaboratorio (
	adminID varchar references Administrador(usuarioID) on delete cascade,
	labID varchar(10) references Laboratorio(id) on delete cascade,
	primary key (adminID, labID)
);

create table Registro (
	id varchar(5) primary key,
	fechaRegistro timestamp not null,
	detalles text,
	cantidadSolicitada int not null,
	laboratorioID varchar(10) not null references Laboratorio(id) on delete cascade,
	adminID varchar references Administrador(usuarioID)
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

create table Prestamo (
	fechaInicio timestamp,
	fechaFin timestamp,
	usuarioID varchar not null references Usuario(carnet),
	labID varchar(10) primary key references Laboratorio(id)
);

create table Novedad (
	fecha timestamp,
	computador varchar references Equipo(nombre) on delete cascade,
	detalle text,
	primary key (fecha, computador)
);