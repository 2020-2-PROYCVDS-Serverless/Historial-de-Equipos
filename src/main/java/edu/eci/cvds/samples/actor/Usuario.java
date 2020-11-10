package edu.eci.cvds.samples.actor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
public class Usuario implements Serializable{
	
	public String carnet;
	public String nombre;
	public String email;
	public String userName;
	public String password;
	
	public Usuario(String carnet, String nombre, String email, String userName, String password){
		this.carnet=carnet;
		this.nombre=nombre;
		this.email=email;
		this.userName=userName;
		this.password=password;
		
	}
	
	public String getCarnet(){
		return carnet;
	}
	public void setCarnet(String nuevoCarnet){
		carnet=nuevoCarnet;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nuevoNombre){
		nombre=nuevoNombre;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String nuevoEmail){
		email=nuevoEmail;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String nuevoUserName){
		userName=nuevoUserName;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String nuevaPassword){
		password=nuevaPassword;
	}
}
