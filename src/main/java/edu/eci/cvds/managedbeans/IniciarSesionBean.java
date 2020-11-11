package edu.eci.cvds.managedbeans;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.authc.usuarionamecontraseñaToken;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.mgt.SecurityManager;



import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;


@ManagedBean(name = "iniciar sesion bean")
@SessionScoped
public class IniciarSesionBean extends BasePageBean implements Serializable {
    private String usuario,contraseña;
	
	public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    } 

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void iniciarSesion(){
       
        Subject usuarioactual = SecurityUtils.getSubject();              
        UsernamePasswordToken token = new UsernamePasswordToken(usuario, contraseña);             
        try{            
            usuarioactual.login(token);    
            FacesContext.getCurrentInstance().getExternalContext().redirect("Login and Registrer/index.xhtml");
        }catch(AuthenticationException ax){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Datos Incorrectos", ""));
        } catch (IOException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Fallo", ""));
        }
        
        
    }
     
}