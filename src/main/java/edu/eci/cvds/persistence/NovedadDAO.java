package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;


import edu.eci.cvds.samples.entities.Novedad;

public interface NovedadDAO {

   public void save(Novedad e) throws PersistenceException ;

}