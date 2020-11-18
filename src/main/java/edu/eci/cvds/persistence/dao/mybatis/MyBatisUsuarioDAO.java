package edu.eci.cvds.persistence.dao.mybatis;

import edu.eci.cvds.persistence.dao.UsuarioDAO;
import edu.eci.cvds.persistence.dao.mybatis.mappers.UsuarioMapper;

import com.google.inject.Inject;

public class MyBatisUsuarioDAO implements UsuarioDAO {
	
	@Inject
	private UsuarioMapper userMap;
	

}
