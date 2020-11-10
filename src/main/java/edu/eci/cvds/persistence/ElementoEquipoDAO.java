package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;


import edu.eci.cvds.samples.entities.ElementoEquipo;

public interface ElementoEquipoDAO {

   public void save(ElementoEquipo e) throws PersistenceException ;

}