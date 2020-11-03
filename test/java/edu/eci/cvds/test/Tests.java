package test.java.edu.eci.cvds.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Tests {
    
    private historialServicios services;
	@Test
	public void deberiaRegistrarUnNuevoUsuario(){
		Usuario user=new Usuario("Alfonso","Pumarejo","alfonsomejo@gmail.com");
		try {
		services.registrarUsuario(user);
		}
		catch(Exception ex) {
			System.out.println("No se pudó registar");
		}
	@Test	
	public void elUsuariodeberiaEstarRegistrado(){
		Usuario user = services.consultarUsuario("alfonsomejo@gmail.com");
		try {
			assertNotNull(user);
		}
		catch(Exception ex) {
			System.out.println("El usuario no se registro");
		}
			
		}
	@Test	
	public void deberiaRegistarEquipo(){
		qt().forAll(Generators.equipo()).check(equipo->
		{
		try {
			services.registrarEquipo(equipo);
		}
		catch(Exception ex) {
			System.out.println("El equipo no se pudo registrar");
		}
			
		});
	
	}
	
	@Test	
	public void deberiaRegistarElemento(){
		qt().forAll(Generators.elemento()).check(elemento->
		{
		try {
			services.registrarElemento(elemento);
		}
		catch(Exception ex) {
			System.out.println("El elemento no se pudo registrar");
		}
			
		});
		
	

}
