package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;

import edu.eci.cvds.entities.actor.Usuario;
import edu.eci.cvds.exception.PersistenceException;
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
public interface UsuarioDAO {

   public void save(Usuario e) throws PersistenceException ;

}