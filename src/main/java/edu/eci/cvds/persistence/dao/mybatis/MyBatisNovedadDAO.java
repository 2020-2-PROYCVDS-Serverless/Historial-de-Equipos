package edu.eci.cvds.persistence.dao.mybatis;

import edu.eci.cvds.persistence.dao.NovedadDAO;
import edu.eci.cvds.persistence.dao.mybatis.mappers.NovedadMapper;

import com.google.inject.Inject;

public class MyBatisNovedadDAO implements NovedadDAO {
	
	@Inject
	private NovedadMapper novedadMap;
	

}
