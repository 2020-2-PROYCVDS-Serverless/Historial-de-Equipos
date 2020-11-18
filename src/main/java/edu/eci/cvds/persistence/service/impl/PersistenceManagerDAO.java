package edu.eci.cvds.persistence.service.impl;

import edu.eci.cvds.persistence.service.PersistenceManager;
import edu.eci.cvds.persistence.dao.*;

import com.google.inject.Inject;

public class PersistenceManagerDAO implements PersistenceManager {

	@Inject
	private AdministradorDAO adminDAO;
	
	@Inject
	private ElementoEquipoDAO elemDAO;
	
	@Inject
	private EquipoDAO equipoDAO;
	
	@Inject 
	private LaboratorioDAO labDAO;
	
	@Inject 
	private NovedadDAO novDAO;
	
	@Inject
	private RegistroDAO regisDAO;
	
	@Inject 
	private UsuarioDAO userDAO;
	
	
}
