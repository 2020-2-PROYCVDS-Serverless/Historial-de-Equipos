package edu.eci.cvds.persistence.dao.mybatis;

import edu.eci.cvds.entities.concreteEntities.Equipo;
import edu.eci.cvds.entities.concreteEntities.Laboratorio;
import edu.eci.cvds.persistence.dao.LaboratorioDAO;
import edu.eci.cvds.persistence.dao.mybatis.mappers.LaboratorioMapper;

import java.util.List;

import com.google.inject.Inject;

public class MyBatisLaboratorioDAO implements LaboratorioDAO {

	@Inject
	private LaboratorioMapper labMap;

	public void save(Laboratorio lab) {
		labMap.save(lab);
	}

	public Laboratorio get(String id) {
		return labMap.get(id);
	}

	public List<Laboratorio> getAll() {
		return labMap.getAll();
	}

	public void asociar(Laboratorio lab, Equipo equipo) {
		labMap.asociar(lab, equipo);
	}

	public void cerrar(Laboratorio lab) {
		labMap.cerrar(lab);
	}
	
	
}
