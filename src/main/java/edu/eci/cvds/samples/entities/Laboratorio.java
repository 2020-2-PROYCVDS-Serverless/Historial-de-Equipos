package edu.eci.cvds.samples.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
*		------------------------------------------------------------------------
*		------------------------ PROYECTO CVDS ------------------------------------------
*		------------------------------------------------------------------------
*
* CLASE: Laboratorio  	
*
* @author : Santiago Buitrago
* @author : Eduard Arias
* @author : Andres Cubillos
* @author : Felipe Marin
*
* @version 1.1 
*
*/

public class Laboratorio implements Serializable{

	private String id;
	private DateTime fechaCreacion;
	private ArrayList<Equipo> equipos;
	private ArrayList<Registro> registros;
	private ArrayList<Administrador> administradores;
	
	public Laboratorio(String id,DateTime fechaCreacion){
		equipos= new ArrayList<Equipo>();
		registros= new ArrayList<Registro>();
		administradores= new ArrayList<Administrador>();
		this.fechaCreacion=fechaCreacion;
		this.id=id;
	}
	
	public String getId(){
		return id;
	}
	public void setId(String nuevoId){
		id=nuevoId;
	}
	
	public DateTime getFechaCreacion(){
		return fechaCreacion;
	}
	public void setId(String nuevoId){
		id= nuevoId;
	}
	
	public void setFechaCreacion(DateTime nuevaFechaCreacion){
		fechaCreacion= nuevaFechaCreacion;
	}
	public ArrayList<Equipo> getEquipos(){
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> nuevosEquipos){
		equipos=nuevosEquipos;
	}
	public ArrayList<Registro> getRegistros(){
		return registros;
	}
	public void setRegistros(ArrayList<Registro> nuevosRegistros){
		registros=nuevosRegistros;
	}
	public ArrayList<Administrador> getAdministradores(){
		return administradores;
	}
	public void setAdministradores(ArrayList<Administrador> nuevosAdministradores){
		administradores=nuevosAdministradores;
	}
}
