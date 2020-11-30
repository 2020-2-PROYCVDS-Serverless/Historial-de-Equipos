package edu.eci.cvds.persistence.dao.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.concreteEntities.Equipo;
import edu.eci.cvds.entities.concreteEntities.Laboratorio;

public interface LaboratorioMapper {

	void save(@Param("lab") Laboratorio lab);

	Laboratorio get(@Param("labID") String id);

	List<Laboratorio> getAll();

	void asociar(@Param("lab") Laboratorio lab, 
			@Param("equipo") Equipo equipo);

	void cerrar(@Param("lab") Laboratorio lab);

}
