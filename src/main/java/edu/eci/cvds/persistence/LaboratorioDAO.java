package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;


import edu.eci.cvds.samples.entities.Laboratorio;

public interface LaboratorioDAO {

   public void save(Laboratorio e) throws PersistenceException ;

}