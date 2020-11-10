package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;
import edu.eci.cvds.samples.entities.Registro;
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
public interface RegistroDAO {

   public void save(Registro e) throws PersistenceException ;

}