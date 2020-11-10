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

public class Registro implements Serializable{

	private String id;
	private DateTime fechaRegistro;
	private String detalle;
	private int cantidadSolicitada;
	private ArrayList<Administrador> administradores;
	private ArrayList<ElementoEquipo> elementos;
	
	public Registro (String id, DateTime fechaRegistro, String detalle, int cantidadSolicitada){
		this.id=id;
		this.fechaRegistro=fechaRegistro;
		this.cantidadSolicitada=cantidadSolicitada;
		administradores= new ArrayList<Administrador>();
		elementos= new ArrayList<ElementoEquipo>();
	}
	
	public String getId(){
		return id;
	}
	public void setId(String nuevoId){
		id=nuevoId;
	}
	
	public DateTime getFechaRegistro(){
		return fechaRegistro;
	}
	
	public void setFechaRegistro(DateTime nuevaFechaRegistro){
		fechaRegistro=nuevaFechaRegistro;
	}
	
	public String getDetalle(){
		return detalle;
	}
	public void setDetalle(String nuevoDetalle){
		detalle=nuevoDetalle;
	}
		public ArrayList<Administrador> getAdministradores(){
		return administradores;
	}
	public void setAdministradores(ArrayList<Administrador> nuevosAdministradores){
		administradores=nuevosAdministradores;
	}
	public ArrayList<ElementoEquipo> getElementos(){
		return elementos;
	}
	public void setElementos(ArrayList<ElementoEquipo> nuevosElementos){
		elementos=nuevosElementos;
	}
}
