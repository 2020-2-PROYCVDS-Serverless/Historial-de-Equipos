package edu.eci.cvds.persistence.dao.mybatis;

import edu.eci.cvds.persistence.dao.EquipoDAO;
import edu.eci.cvds.persistence.dao.mybatis.mappers.EquipoMapper;

import com.google.inject.Inject;

public class MyBatisEquipoDAO implements EquipoDAO {
	
	@Inject
	private EquipoMapper equipoMap;
	

}
