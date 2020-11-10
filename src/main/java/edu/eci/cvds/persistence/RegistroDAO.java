package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;


import edu.eci.cvds.samples.entities.Registro;

public interface RegistroDAO {

   public void save(Registro e) throws PersistenceException ;

}