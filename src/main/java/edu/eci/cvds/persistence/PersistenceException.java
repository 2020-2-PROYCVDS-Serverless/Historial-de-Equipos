package edu.eci.cvds.persistencia;

public class PersistenceException extends Exception {
	
	public static final String ITEM = "Error al registrar el item";

	public PersistenceException(String msg) {
        super(msg);
    }
}
