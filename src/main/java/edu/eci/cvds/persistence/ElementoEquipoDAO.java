package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;
import edu.eci.cvds.samples.entities.ElementoEquipo;
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
public interface ElementoEquipoDAO {

   public void save(ElementoEquipo e) throws PersistenceException ;

}