package edu.eci.cvds.persistence.dao.mybatis;

import edu.eci.cvds.persistence.dao.LaboratorioDAO;
import edu.eci.cvds.persistence.dao.mybatis.mappers.LaboratorioMapper;

import com.google.inject.Inject;

public class MyBatisLaboratorioDAO implements LaboratorioDAO {

	@Inject
	private LaboratorioMapper labMap;
	
	
}
