package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import edu.eci.cvds.samples.entities.elemento;
import edu.eci.cvds.services.ServicesException;
import edu.eci.cvds.samples.services.registrarElemento;



@ManagedBean(name = "elementoBean")
@SessionScoped 
public class ElementoBean extends BasePageBean  {

	@Inject
    private registrarElemento elementoS;
	
    private Elemento elemento;

    public Agregarelementoelemento(){
    	elemento= new elemento();
    }

    public elemento getelemento) {
        return elemento;
    }

    public void setelementoelemento(elemento elemento) {
        this.elemento = elemento;
    }

    public void registrarelemento() {
            elementoS.registrar(elemento);
       
    }
	

}