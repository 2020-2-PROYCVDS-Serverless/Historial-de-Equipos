package edu.eci.cvds.samples.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;

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

public class ElementoEquipo implements Serializable {

	private int id;
	private String descripcion;
	private char condicion;
	
	public void ElementoEquipo(int id, String descripcion, char condicion){
		this.id=id;
		this.descripcion=descripcion;
		this.condicion=condicion;
		
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setDescripcion(String nuevaDescripcion){
		descripcion=nuevaDescripcion;
	}
	
	public void setCondicion(char nuevaCondicion){
		condicion=nuevaCondicion;
	}
	public char getCondicion(){
		return condicion;
	}
	
	public int getId(){
		return id
	}
	
	public void setId(int nuevoId){
		id= nuevoId;
	}
}
