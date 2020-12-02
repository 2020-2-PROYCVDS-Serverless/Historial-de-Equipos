create or replace procedure registrarEquipo(equipoID varchar, descripcion text, condicion char, nombre varchar)
language plpgsql
as $body$
begin
	insert into Registrable values (equipoID, descripcion, true, condicion, nombre);
	insert into Equipo values (equipoID);
	commit;
	exception
		when others then
			rollback;
			raise exception 'Error al registrar equipo';
end; $body$


create or replace procedure registrarElemento(elementoID varchar, descripcion text, condicion char, nombre varchar, tipo char)
language plpgsql
as $body$
begin 
	insert into Registrable (id, descripcion, condicion, nombre) values (elementoID, descripcion, condicion, nombre);
	insert into ElementoEquipo values (elementoID, tipo);
	commit;
	exception
		when others then
			rollback;
			raise exception 'Error al registrar elemento de equipo';
end; $body$


create or replace procedure crearLaboratorio(labID varchar(10))
language plpgsql
as $body$
begin 
	insert into Laboratorio values (labID);
	commit;
	exception
		when others then
			rollback;
			raise exception 'Error al registrar/crear laboratorio';
end; $body$


create or replace procedure registrarNovedad (elementoID varchar, titulo varchar, responsable varchar, detalle text)
language plpgsql
as $body$
begin 
	insert into Novedad (registrableID, titulo, responsable, detalle) values (elementoID, titulo, responsable, detalle);
	commit;
	exception
		when others then
			rollback;
			raise exception 'Error al registrar novedad % para elemento %', titulo, elementoID;
end; $body$



----- Sprint 2


create or replace procedure asociarElemento (elementoID varchar, equipoID varchar)
language plpgsql
as $body$
declare 
	habilitado bool;
begin
	select disponible into habilitado from Registrable r
		where r.id = equipoID;
	
	if not disponible then
		raise exception 'El equipo % no esta disponible', equipoID;
	end if;
	
	update ElementoEquipo elem
		set elem.equipoID = equipoID
		where elem.id = elementoID;
	commit;
	exception
		when others then
			rollback;
			raise exception 'No se pudo asociar el elemento % al equipo %', elementoID, equipoID;
end; $body$


create or replace procedure asociarEquipo (labID varchar, equipoID varchar)
language plpgsql
as $body$
declare 
	habilitado bool;
begin
	select disponible into habilitado from Laboratorio l
		where l.id = labID;
	
	if not disponible then
		raise exception 'El laboratorio % no esta disponible', labID;
	end if;
	
	update Equipo eq
		set eq.labID = labID
		where eq.id = equipoID;
	commit;
	exception
		when others then
			rollback;
			raise exception 'No se pudo asociar el equipo % al laboratorio %', equipoID, labID;
end; $body$


create or replace procedure cerrarLaboratorio (labID varchar)
language plpgsql
as $body$
begin 
	update Laboratorio l
		set l.disponible = false
		where l.id = labID;
	update Equipo eq
		set eq.labID = null
		where eq.labID = labID;
	commit;
	exception
		when others then
			rollback;
			raise exception 'No se puede cerrar el laboratorio %', labID;
end; $body$


create or replace procedure inhabilitarElemento (elemID int)
language plpgsql
as $body$
declare
	eq varchar := null;
begin
	select elem.equipoID into eq from ElementoEquipo elem
		where elem.id = elemID;
	
	if eq != null then
		raise exception 'El elemento de equipo % esta asociado al equipo %', elemID, eq;
	end if;

	update Registrable r
		set r.disponible = false
		where r.id = elemID;
	
	commit;

	exception 
		when others then
			rollback;
			raise exception 'No se puede inhabilitar elemento de equipo %', elemID;
end; $body$


create or replace procedure inhabilitarEquipo (equipoID varchar)
language plpgsql
as $body$
begin 
	update Registrable r
		set r.disponible = false
		where r.id = equipoID;
	update ElementoEquipo elem
		set elem.equipoID = null
		where elem.equipoID = equipoID;
	commit;
	exception
		when others then
			rollback;
			raise exception 'No se puede inhabilitar equipo %', equipoID;
end; $body$


----- Sprint 3
----- Loas queries se bvan a dejar en los mappers.xml ya que son mas sencillos de manejar