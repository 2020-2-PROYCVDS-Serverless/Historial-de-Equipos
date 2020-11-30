package edu.eci.cvds.persistence.dao.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.abstractEntities.ElementoEquipo;

public interface ElementoEquipoMapper {
	
	void save(@Param("elem") ElementoEquipo elem);

	ElementoEquipo get(@Param("elemID") String id);

	List<ElementoEquipo> getAll();

	void inhabilitar(@Param("elem") ElementoEquipo elem);

}
