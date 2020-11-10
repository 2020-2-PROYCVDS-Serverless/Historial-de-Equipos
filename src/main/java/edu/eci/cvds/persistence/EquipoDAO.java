package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;


import edu.eci.cvds.samples.entities.Equipo;

public interface EquipoDAO {

   public void save(Equipo e) throws PersistenceException ;

}