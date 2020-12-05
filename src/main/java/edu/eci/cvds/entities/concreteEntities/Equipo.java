package edu.eci.cvds.samples.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;

/**
*		------------------------------------------------------------------------
*		------------------------ PROYECTO CVDS ------------------------------------------
*		------------------------------------------------------------------------
*
* CLASE: Equipo  	
*
* @author : Santiago Buitrago
* @author : Eduard Arias
* @author : Andres Cubillos
* @author : Felipe Marin
*
* @version 1.1 
*
*/
public class Equipo implements Serializable{

	private String nombre;
	private ArrayList<ElementoEquipo> elementos;
	private ArrayList<Novedad> novedades;
	
	public Equipo(String nuevoNombre){
		elementos= new ArraList<ElementoEquipo>();
		novedades= new ArraList<Novedad>();
		nombre=nuevoNombre;
	}
	
	public void setNombre(String nuevoNombre){
		nombre=nuevoNombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public ArrayList<ElementoEquipo> getElementos(){
		return elementos;
	}
	public void setElementos(ArrayList<ElementoEquipo> nuevosElementos){
		elementos=nuevosElementos;
	}
	
	public ArrayList<Novedad> getNovedades(){
		return novedades;
	}
	public void setNovedades(ArrayList<Novedad> nuevasNovedades){
		novedades=nuevasNovedades;
	}
}
