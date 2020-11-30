package edu.eci.cvds.persistence.service.impl;

import edu.eci.cvds.persistence.service.PersistenceManager;
import edu.eci.cvds.entities.abstractEntities.ElementoEquipo;
import edu.eci.cvds.entities.concreteEntities.Equipo;
import edu.eci.cvds.entities.concreteEntities.Laboratorio;
import edu.eci.cvds.exception.PersistenceException;
import edu.eci.cvds.persistence.dao.*;

import java.util.List;

import com.google.inject.Inject;

public class PersistenceManagerDAO implements PersistenceManager {
	
	@Inject
	private ElementoEquipoDAO elemDAO;
	
	@Inject
	private EquipoDAO equipoDAO;
	
	@Inject 
	private LaboratorioDAO labDAO;
	
	@Inject 
	private NovedadDAO novDAO;

	public void registrarEquipo(Equipo equipo) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void registrarNuevoEquipo(Equipo equipo, List<ElementoEquipo> elems) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void registrarElemento(ElementoEquipo elem) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void registrarNovedad(String identificador, String titulo, String responsable, String detalle) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void crearLaboratorio(Laboratorio lab) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void crearNuevoLaboratorio(Laboratorio lab, List<Equipo> equipos) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void asociarEquipo(Laboratorio lab, Equipo equipo) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void asociarEquipos(Laboratorio lab, List<Equipo> equipos) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void asociarElemento(Equipo equipo, ElementoEquipo elem) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void asociarElementos(Equipo equipo, List<ElementoEquipo> elems) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void cerrarLaboratorio(Laboratorio laboratorio) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void inhabilitarEquipo(Equipo equipo) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public void inhabilitarElemento(ElementoEquipo elem) throws PersistenceException {
		// TODO Auto-generated method stub
		
	}

	public List<Equipo> reporteEquipos() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ElementoEquipo> reporteElementos() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Laboratorio> reporteLaboratorios() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
