

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import javax.faces.context.FacesContext;

import edu.eci.cvds.managedbeans.ElementosBean;


public class ConeccionElemento {

	public static Statement stmtObj;
	public static Connection connObj;
	public static ResultSet resultSetObj;
	public static PreparedStatement pstmt;

	/* Method To Establish Database Connection */
	public static Connection getConnection(){  
		try{  
			Class.forName("org.postgresql.jdbc.Driver");     
			String db_url ="postgresql://ec2-50-17-178-87.compute-1.amazonaws.com:5432/d8vebtfu16rc9v?useSSL=false",
					db_userName = "uctdmrazraeqqa",
					db_password = "fe6b016148fdfa70e910a47664388c23c2f869ab018d4383020bccd2b5c45a4c";
			connObj = DriverManager.getConnection(db_url,db_userName,db_password);  
		} catch(Exception sqlException) {  
			sqlException.printStackTrace();
		}  
		return connObj;
	}

	/* Method To Fetch The Elemento Records From Database */
	public static ArrayList<ElementosBean> getElementosListFromDB() {
		ArrayList<ElementosBean> elementosList = new ArrayList<ElementosBean>();  
		try {
			stmtObj = getConnection().createStatement();    
			resultSetObj = stmtObj.executeQuery("select * from ElementoEquipo");    
			while(resultSetObj.next()) {  
				ElementosBean stuObj = new ElementosBean(); 
				stuObj.setId(resultSetObj.getString("id"));  
				stuObj.setEquipoID(resultSetObj.getString("EquipoID"));  
				stuObj.settipo(resultSetObj.getString("tipo"));  
				  
				elementosList.add(stuObj);  
			}   
			System.out.println("Total Records Fetched: " + elementosList.size());
			connObj.close();
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		} 
		return elementosList;
	}

	public static String saveElementoDetailsInDB(ElementosBean newElementoObj) {
		int saveResult = 0;
		String navigationResult = "";
		try {      
			pstmt = getConnection().prepareStatement("insert into ElementoEquipo (id,labID,tipo) values (?, ?, ?)");			
			pstmt.setString(1, newElementoObj.getId());
			pstmt.setString(2, newElementoObj.getlabID());
			saveResult = pstmt.executeUpdate();
			connObj.close();
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		if(saveResult !=0) {
			navigationResult = "elementolista.xhtml?faces-redirect=true";
		} else {
			navigationResult = "agregarelemento.xhtml?faces-redirect=true";
		}
		return navigationResult;
	}

	public static String editElementoRecordInDB(String elementoId) {
		ElementosBean editRecord = null;
		System.out.println("editElementoRecordInDB() : Elemento Id: " + elementoId);

		/* Setting The Particular elemento Details In Session */
		Map<String,Object> sessionMapObj = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

		try {
			stmtObj = getConnection().createStatement();    
			resultSetObj = stmtObj.executeQuery("select * from ElementoEquipo where id = "+id);    
			if(resultSetObj != null) {
				resultSetObj.next();
				editRecord = new ElementosBean(); 
				editRecord.setId(resultSetObj.getInt("id"));
				editRecord.setlabID(resultSetObj.getString("labID"));
			}
			sessionMapObj.put("editRecordObj", editRecord);
			connObj.close();
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		return "/editarElemento.xhtml?faces-redirect=true";
	}

	public static String updateElementoDetailsInDB(ElementosBean updateElementoObj) {
		try {
			pstmt = getConnection().prepareStatement("update ElementoEquipo set id=?, EquipoID=?, tipo=? where id=?");    
			pstmt.setString(1,updateStudentObj.getName());  
			pstmt.setString(2,updateStudentObj.getEmail()); 
			pstmt.executeUpdate();
			connObj.close();			
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		return "/elementolista.xhtml?faces-redirect=true";
	}

	public static String deleteElementoRecordInDB(String elementoId){
		System.out.println("deleteElementoRecordInDB() : Elemento Id: " + equipoId);
		try {
			pstmt = getConnection().prepareStatement("delete from ElementoEquipo where id = "+id);  
			pstmt.executeUpdate();  
			connObj.close();
		} catch(Exception sqlException){
			sqlException.printStackTrace();
		}
		return "/elementoolista.xhtml?faces-redirect=true";
	}
}