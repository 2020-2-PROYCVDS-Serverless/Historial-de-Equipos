package edu.eci.cvds.persistence.dao;

import java.util.List;

import edu.eci.cvds.entities.abstractEntities.ElementoEquipo;

public interface ElementoEquipoDAO {

	/**
	 * Inserta un objeto de tipo ElementoEquipo en la base de datos.
	 * 
	 * @param elem objeto de tipo ElementoEquipo con la informaci�n a guardar.
	 */
	void save(ElementoEquipo elem);
	
	/**
	 * Obtiene un elemento de tipo ElementoEquipo de la base de datos por su ID.
	 * 
	 * @param id identificador del elemento.
	 * @return un objeto de tipo ElementoEquipo
	 */
	ElementoEquipo get(String id);
	
	/**
	 * Obtiene todos los objetos de tipo ElementoEquipo de la base de datos.
	 * 
	 * @return Lista con los elementos obtenidos. Si no hay elementos, retorna una lista vac�a.
	 */
	List<ElementoEquipo> getAll();
	
	/**
	 * Cambia el estado de un objeto ElementoEquipo a "inhabilitado" o "Dado de baja".
	 * 
	 * @param elem objeto que contiene la informaci�n respectiva de la relaci�n en la base de datos.
	 */
	void inhabilitar(ElementoEquipo elem);
	
}
