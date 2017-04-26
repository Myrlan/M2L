package modele;

import java.sql.ResultSet;
import java.sql.Statement;

public class modeleBatiment {
	
public static void select(){
		
		SQLUtilisateur[] user_list;
	    
		BDDConnexion.connexionBD();
		try { 
	    Statement st = BDDConnexion.conn.createStatement();
	    
	    String query = "SELECT * FROM utilisateur WHERE mdp='admin'";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    

	    while (rs.next())
	    {
	    	
	    	SQLUtilisateur.setNum_user(rs.getInt("Num_User"));
		    SQLUtilisateur.setNom(rs.getString("Nom_User"));
		    SQLUtilisateur.setPrenom(rs.getString("Prenom_User"));
		    SQLUtilisateur.setAdresse(rs.getString("Adresse"));
		    SQLUtilisateur.setEmail(rs.getString("Email"));
		    SQLUtilisateur.setTel(rs.getInt("Telephone"));
		    SQLUtilisateur.setMdp(rs.getString("Mdp"));
	      
	      // print the results
	      System.out.println(
	    		  "Num_User " + SQLUtilisateur.getNum_user() + 
	    		  ", Nom " + SQLUtilisateur.getNom() +
	    		  ", Prenom " + SQLUtilisateur.getPrenom() +
	    		  ", Address " + SQLUtilisateur.getAdresse() + 
	      		  " ,Email " + SQLUtilisateur.getEmail() +
	      		  " ,Telephone " + SQLUtilisateur.getTel() +
	      		  " ,Mdp " + SQLUtilisateur.getMdp()
	      )
	      ;
	    }
	    st.close();
	    rs.close();
	    BDDConnexion.conn.close();
	    
		} catch (Exception e) { 
		    System.err.println("Selection echouée "); 
		    System.err.println(e.getMessage()); 
		}
			
	}
	

}
