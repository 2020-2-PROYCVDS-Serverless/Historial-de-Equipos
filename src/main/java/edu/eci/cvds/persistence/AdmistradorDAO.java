package edu.eci.cvds.persistence;

import java.util.List;
import java.util.Date;


import edu.eci.cvds.samples.actor.Admistrador;

public interface AdmistradorDAO {

   public void save(Admistrador e) throws PersistenceException ;

}