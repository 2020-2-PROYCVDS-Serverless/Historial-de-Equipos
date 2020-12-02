package edu.eci.cvds.persistence.dao.mybatis;

import edu.eci.cvds.persistence.dao.NovedadDAO;
import edu.eci.cvds.persistence.dao.mybatis.mappers.NovedadMapper;
import edu.eci.cvds.persistence.service.adapter.entities.NovedadAdapter;

import java.util.List;

import com.google.inject.Inject;

public class MyBatisNovedadDAO implements NovedadDAO {
	
	@Inject
	private NovedadMapper novedadMap;

	public void save(String identificador, String titulo, String responsable, String detalle) {
		novedadMap.save(identificador, titulo, responsable, detalle);
	}

	public List<NovedadAdapter> get(String id) {
		return novedadMap.get(id);
	}

	public List<NovedadAdapter> getAll() {
		return novedadMap.getAll();
	}
	

}
