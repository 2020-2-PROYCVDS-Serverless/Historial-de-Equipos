create or replace procedure registrarUsuario(ID varchar, nombres varchar, mail varchar, nombreUsuario varchar, passwd varchar)
language plpgsql
as $body$
begin
	insert into usuario (carnet, nombre, email) values (ID, nombres, mail);
	insert into credencial (username, pass, usuarioid) values (nombreUsuario, passwd, ID);
end; $body$


create or replace procedure iniciarSesion(nombreUsuario varchar, passwd varchar)
language plpgsql
as $body$
declare 
	verification int;
begin 
	select count(c.username) into verification from credencial c
		where c.username = nombreUsuario and c.pass = passwd;
	if verification = 0 then
		raise exception 'User or password incorrect';
	end if;
end; $body$


create or replace procedure registrarEquipo(nombre varchar, labID varchar(10), regisID varchar(5))
language plpgsql
as $body$
begin
	insert into equipo (nombre, laboratorioid, registroid) values (nombre, labID, regisID);
	call registrarNovedad(now, nombre, 'Se registró el equipo'::text);
end; $body$


create or replace procedure registrarElemento(description text, cond char, regisID varchar(5), compuID varchar)
language plpgsql
as $body$
begin 
	insert into elementoequipo (descripcion , condicion , registroid , equipoid ) values (description, cond, regisID, compuID);
end; $body$


create or replace procedure crearLaboratorio(labID varchar(10), creacion date)
language plpgsql
as $body$
begin 
	insert into laboratorio (id , fechacreacion ) values (labID, creacion);
end; $body$


create or replace procedure registrarAdmin (ID varchar, nombres varchar, mail varchar, nombreUsuario varchar, passwd varchar)
language plpgsql
as $body$
begin 
	call registrarUsuario(ID, nombres, mail, nombreUsuario, passwd);
	insert into administrador (usuarioid ) values (ID);
end; $body$


create or replace procedure crearRegistro (regisID varchar(5), creacion timestamp, detail text, labID varchar(10), administrator varchar)
language plpgsql
as $body$
begin 
	insert into registro (id , fecharegistro , detalles , laboratorioid , adminid ) values (regisID, creacion, detail, labID, administrator);
end; $body$


create or replace procedure registrarNovedad (creacion timestamp, compID varchar, detail text)
language plpgsql
as $body$
begin 
	insert into novedad (fecha , computador , detalle ) values (creacion, compID, detail);
end; $body$



----- Sprint 2


create or replace procedure asociarElemento (elemID int, equipoID varchar)
language plpgsql
as $body$
begin
	update elementoequipo eleq
		set eleq.equipoid = equipoID
		where eleq.id = elemID;
	call registrarNovedad(now, equipoID, concat('Se asoció el elemento ',elemID::text,' al equipo'));
end; $body$



create or replace procedure asociarEquipo (labID varchar(10), equipoID varchar)
language plpgsql
as $body$
begin 
	update equipo eq
		set eq.laboratorioid = labID
		where eq.nombre = equipoID;
	call registrarNovedad(now, equipoID, concat('Se asoció el equipo al laboratorio ',labID));
end; $body$


create or replace procedure cerrarLaboratorio (labID varchar(10))
language plpgsql
as $body$
begin 
	update equipo eq
		set eq.laboratorioid = null
		where eq.laboratorioid = labID; 
end; $body$


create or replace procedure borrarElemento (elemID int)
language plpgsql
as $body$
begin
	delete from elementoequipo eleq
		where eleq.id = elemID and eleq.equipoid = null;
end; $body$


create or replace procedure borrarEquipo (equipoID varchar)
language plpgsql
as $body$
begin 
	update elementoequipo eleq
		set eleq.equipoid = null
		where eleq.equipoid = equipoID;
	delete from equipo e2 
		where e2.nombre = equipoID;
	call registrarNovedad(now, equipoID, 'Se dió de baja al equipo');
end; $body$