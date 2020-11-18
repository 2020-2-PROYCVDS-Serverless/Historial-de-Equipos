package edu.eci.cvds.persistence.dao.mybatis;

import edu.eci.cvds.persistence.dao.RegistroDAO;
import edu.eci.cvds.persistence.dao.mybatis.mappers.RegistroMapper;

import com.google.inject.Inject;

public class MyBatisRegistroDAO implements RegistroDAO {
	
	@Inject
	private RegistroMapper regisMap;
	

}
