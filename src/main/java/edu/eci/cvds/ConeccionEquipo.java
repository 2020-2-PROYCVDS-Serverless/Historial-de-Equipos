

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import javax.faces.context.FacesContext;

import edu.eci.cvds.managedbeans.EquiposBean;


public class ConeccionEquipo {

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

	/* Method To Fetch The Equipo Records From Database */
	public static ArrayList<EquiposBean> getEquiposListFromDB() {
		ArrayList<EquiposBean> equiposList = new ArrayList<EquiposBean>();  
		try {
			stmtObj = getConnection().createStatement();    
			resultSetObj = stmtObj.executeQuery("select * from Equipo");    
			while(resultSetObj.next()) {  
				EquiposBean stuObj = new EquiposBean(); 
				stuObj.setId(resultSetObj.getString("id"));  
				stuObj.setlabID(resultSetObj.getString("labID"));  
				  
				equiposList.add(stuObj);  
			}   
			System.out.println("Total Records Fetched: " + equiposList.size());
			connObj.close();
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		} 
		return equiposList;
	}

	public static String saveEquipoDetailsInDB(EquiposBean newEquipoObj) {
		int saveResult = 0;
		String navigationResult = "";
		try {      
			pstmt = getConnection().prepareStatement("insert into Equipo (id,labID) values (?, ?)");			
			pstmt.setString(1, newEquipoObj.getName());
			pstmt.setString(2, newEquipoObj.getEmail());
			saveResult = pstmt.executeUpdate();
			connObj.close();
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		if(saveResult !=0) {
			navigationResult = "equiposlista.xhtml?faces-redirect=true";
		} else {
			navigationResult = "agregarequipo.xhtml?faces-redirect=true";
		}
		return navigationResult;
	}

	public static String editEquipoRecordInDB(String equipoId) {
		EquiposBean editRecord = null;
		System.out.println("editEquipoRecordInDB() : Equipo Id: " + equipoId);

		/* Setting The Particular Equipo Details In Session */
		Map<String,Object> sessionMapObj = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

		try {
			stmtObj = getConnection().createStatement();    
			resultSetObj = stmtObj.executeQuery("select * from Equipo where id = "+id);    
			if(resultSetObj != null) {
				resultSetObj.next();
				editRecord = new EquiposBean(); 
				editRecord.setId(resultSetObj.getInt("id"));
				editRecord.setlabID(resultSetObj.getString("labID"));
			}
			sessionMapObj.put("editRecordObj", editRecord);
			connObj.close();
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		return "/editarEquipo.xhtml?faces-redirect=true";
	}

	public static String updateEquipoDetailsInDB(EquiposBean updateEquipoObj) {
		try {
			pstmt = getConnection().prepareStatement("update Equipo set id=?, labID=? where id=?");    
			pstmt.setString(1,updateStudentObj.getName());  
			pstmt.setString(2,updateStudentObj.getEmail()); 
			pstmt.executeUpdate();
			connObj.close();			
		} catch(Exception sqlException) {
			sqlException.printStackTrace();
		}
		return "/equipolista.xhtml?faces-redirect=true";
	}

	public static String deleteEquipoRecordInDB(String equipoId){
		System.out.println("deleteEquipoRecordInDB() : Equipo Id: " + equipoId);
		try {
			pstmt = getConnection().prepareStatement("delete from Equipo where id = "+id);  
			pstmt.executeUpdate();  
			connObj.close();
		} catch(Exception sqlException){
			sqlException.printStackTrace();
		}
		return "/equipolista.xhtml?faces-redirect=true";
	}
}