package edu.eci.cvds.persistence.dao.mybatis;

import edu.eci.cvds.persistence.dao.AdministradorDAO;
import edu.eci.cvds.persistence.dao.mybatis.mappers.AdministradorMapper;

import com.google.inject.Inject;

public class MyBatisAdministradorDAO implements AdministradorDAO {
	
	@Inject
	private AdministradorMapper adminMap;
	

}
