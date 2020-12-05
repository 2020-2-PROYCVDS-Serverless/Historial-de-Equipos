package edu.eci.cvds.managedbeans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.jsf.crud.db.operations.DatabaseOperation;

@ManagedBean @RequestScoped
public class ElementosBean {

	private String id;  
	private String EquipoID;
	private String tipo;  	


	public ArrayList<ElementosBean>elementosListFromDB;

	public String getId() {
		return id;	
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getlabID() {
		return labID;
	}

	public void setlabId(String labId) {
		this.labID = labId;
	}

	
	
	/* Method Will Avoid Multiple Calls To DB For Fetching The elementos Records. If This Is Not Used & Data Is Fetched From Getter Method, JSF DataTable Will Make Multiple Calls To DB*/
	@PostConstruct
	public void init() {
		elementosListFromDB = DatabaseOperation.getElementossListFromDB();
	}

	/* Method Used To Fetch All Records From The Database */
	public ArrayList<ElementosBean> ElementosList() {
		return ElementosListFromDB;
	}
	
	public String saveElementoDetails(ElementosBean newElementoObj) {
		return DatabaseOperation.saveElementoDetailsInDB(newElementoObj);
	}
	

	public String editElementoRecord(String ElementoId) {
		return DatabaseOperation.editElementoRecordInDB(ElementoId);
	}

	public String updateElementoDetails(ElementosBean updateElementoObj) {
		return DatabaseOperation.updateElementoDetailsInDB(updateElementoObj);
	}
	
	public String deleteElementoRecord(String ElementoId) {
		return DatabaseOperation.deleteElementoRecordInDB(ElementoId);
	}
}