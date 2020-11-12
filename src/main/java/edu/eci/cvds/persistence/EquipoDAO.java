package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;
import edu.eci.cvds.samples.entities.Equipo;

/**
*		------------------------------------------------------------------------
*		------------------------ PROYECTO CVDS ------------------------------------------
*		------------------------------------------------------------------------
*
* CLASE:   	
*
* @author : Santiago Buitrago
* @author : Eduard Arias
* @author : Andres Cubillos
* @author : Felipe Marin
*
* @version 1.1 
*
*/
public interface EquipoDAO {

   public void save(Equipo e) throws PersistenceException ;

}