package controller;

import modele.modeleUtilisateur;

import java.sql.*;
import java.util.*;

import modele.BDDConnexion;
import modele.SQLUtilisateur;

public class contUtilisateur extends modeleUtilisateur{
	static ArrayList<SQLUtilisateur> user_list;
	static String test;
	static int i=0;

	SQLUtilisateur gs = new SQLUtilisateur();
	
	public static void selectInfo(){
		 BDDConnexion.connexionBD();
		try { 
	    Statement st = BDDConnexion.conn.createStatement();
	    
	    String query = "SELECT * FROM utilisateur";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    
	    // iterate through the java resultset
	   while (rs.next())
	    {int num_user = rs.getInt("Num_User");
	      test=rs.getString("Nom_User");
	      
	      String prenom = rs.getString("Prenom_User");
	      String adresse = rs.getString("Adresse");
	      String email = rs.getString("Email");
	      int tel = rs.getInt("Telephone");

	    }
	   System.out.println(SQLUtilisateur.getNom());
	    st.close();
	    rs.close();
	    BDDConnexion.conn.close();
	    
		} catch (Exception e) { 
		    System.err.println("Selection echouée "); 
		    System.err.println(e.getMessage()); 
		}
		System.out.println(test);
			
	}
	
	private static String nom = SQLUtilisateur.getNom();
	public void setNom(String nom) {
		this.nom  = test;
		
	}

}
