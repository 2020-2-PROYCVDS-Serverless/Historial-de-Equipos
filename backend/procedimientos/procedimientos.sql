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