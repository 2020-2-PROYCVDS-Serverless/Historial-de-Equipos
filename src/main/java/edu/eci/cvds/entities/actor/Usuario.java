package edu.eci.cvds.entities.actor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
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

@Data
@AllArgsConstructor
public class Usuario implements Serializable{
	
	public String carnet;
	public String nombre;
	public String email;
	public String userName;
	public String password;
	
}
