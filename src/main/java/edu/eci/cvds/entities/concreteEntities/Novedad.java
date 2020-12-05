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


public class Novedad implements Serializable{

	private DateTime fecha;

	private String computador;

	private String detalle;
	
	public Novedad (DateTime fecha, String computador, String detalle){
		this.fecha=fecha;
		this.computador=computador;
		this.detalle= detalle;
		
	}
	
	public DateTime getFecha(){
		return fecha;
	}
	public void setFecha(DateTime nuevaFecha){
		fecha= nuevaFecha;
	}
	public String getComputador(){
		return computador;
	}
	
	public void setComputador(String nuevoComputador){
		computador=nuevoComputador
	}
	public String getDetalle(){
		return detalle;
	}
	
	public void setDetalle(String nuevoDetalle){
		detalle=nuevoDetalle;
	}
}
