package edu.eci.cvds.entities.abstractEntities;

import java.util.List;

import edu.eci.cvds.entities.concreteEntities.Equipo;
import edu.eci.cvds.entities.concreteEntities.Novedad;

public abstract class ElementoEquipo extends Elemento{
	
	private Equipo equipo;
	private List<Novedad> novedades;
	
}
