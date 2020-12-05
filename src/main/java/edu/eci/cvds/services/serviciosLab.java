package edu.eci.cvds.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import edu.eci.cvds.entities.abstractEntities.*;
import edu.eci.cvds.concrete.concreteEntities.*;


public class serviciosLab implements servicios{
	//@Inject
	//private UsuarioDAO usuario;
	@Inject
	private EquipoDAO equipo;
	@Inject
	private LaboratorioDAO laboratorio;
	@Inject
	private NovedadDAO novedad;
	@Inject
	private ElementoEquipoDAO elemento;
	
	public serviciosLab(){
		
	}
	public void agregarEquipoExterno(int id,Date fechaInicioActividad,Date fechafinactividad,Date fechaAdquisicion) throws ECILabException {
		if(fechaInicioActividad==null || fechaAdquisicion==null) throw new ECILabException("Error: La fecha de adquisicion o la fecha de fin de actividad no pueden ser vacias o nulas.");
		if(fechaInicioActividad.before(fechaAdquisicion)) throw new ECILabException("Error: Un equipo no puede iniciar actividad antes de su adquisicion.");
		equipo.agregarEquipoExterno(id, fechaInicioActividad, fechafinactividad, fechaAdquisicion);
	}	
	
}


