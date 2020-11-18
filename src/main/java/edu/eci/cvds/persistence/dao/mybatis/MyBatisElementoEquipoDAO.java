package edu.eci.cvds.persistence.dao.mybatis;

import edu.eci.cvds.persistence.dao.ElementoEquipoDAO;
import edu.eci.cvds.persistence.dao.mybatis.mappers.ElementoEquipoMapper;

import com.google.inject.Inject;

public class MyBatisElementoEquipoDAO implements ElementoEquipoDAO {

	@Inject
	private ElementoEquipoMapper elementoMap;
	
	
}
