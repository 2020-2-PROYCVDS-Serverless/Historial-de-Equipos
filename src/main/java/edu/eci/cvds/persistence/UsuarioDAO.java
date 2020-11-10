package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;


import edu.eci.cvds.samples.actor.Usuario;

public interface UsuarioDAO {

   public void save(Usuario e) throws PersistenceException ;

}