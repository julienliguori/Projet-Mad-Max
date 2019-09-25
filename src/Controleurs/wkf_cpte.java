package Controleurs;

import java.sql.ResultSet;
import java.sql.SQLException;

import Modeles.CAD;
import Modeles.Map_P;

public class wkf_cpte {
	private Map_P map;
		
	private CAD cad;
	
	public wkf_cpte(CAD cad)
	{
		this.cad = cad;
		this.map = new Map_P(); 
		String sql = this.map.selectlDbyLoginPassword("yanis", "samah");
		ResultSet rs =  this.cad.GetRows(sql, "nul");
		try {
			
		
		if (rs.next()) {
			System.out.println("Ok");
		} else {
			System.out.println(" pas Ok");
			
		}
		 
	}catch(SQLException e) {
		e.printStackTrace();
		
	}
	} 
	
	
	
	Boolean pcs_authentifier(String login, String password) {
		return true; // Completer
	}
}
