package edu.eci.cvds.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import edu.eci.cvds.samples.entities.Equipo;
import edu.eci.cvds.services.ServicesException;
import edu.eci.cvds.samples.services.registrarEquipo;



@ManagedBean(name = "EquipoBean")
@SessionScoped 
public class EquipoBean extends BasePageBean  {

	@Inject
    private registrarEquipo equipoS;
	
    private Equipo equipo;

    public AgregarEquipoEquipo(){
    	equipo= new Equipo();
    }

    public Equipo getEquipo) {
        return equipo;
    }

    public void setEquipoEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void registrarEquipo() {
            equipo.setPantalla(equipoS.getPantalla());
            equipo.setTorre(equipoS.getTorre());
            equipo.setMouse(equipoS.getMouse());
            equipo.setTeclado(equipoS.getTeclado());
            equipoS.registrar(equipo);
       
    }
	

}