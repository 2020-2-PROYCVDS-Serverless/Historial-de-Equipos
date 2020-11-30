package edu.eci.cvds.persistence.dao.mybatis.mappers;

import java.util.List;

import edu.eci.cvds.entities.concreteEntities.Novedad;

public interface NovedadMapper {

	void save(String identificador, String titulo, String responsable, String detalle);

	List<Novedad> get(String id);

	List<Novedad> getAll();

}
