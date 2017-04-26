package modele;

import java.sql.ResultSet;
import java.sql.Statement;

public class modeleSalle {
	
	
	public static void select(){
		
		SQLUtilisateur[] user_list;
	    
		BDDConnexion.connexionBD();
		try { 
	    Statement st = BDDConnexion.conn.createStatement();
	    
	    String query = "SELECT * FROM salle ";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    

	    while (rs.next())
	    {
	    	
	    	SQLSalle.setNum_salle(rs.getInt("Num_Salle"));
	    	SQLSalle.setNum_bat(rs.getInt("Num_Bat"));
	    	SQLSalle.setEtage(rs.getInt("Etage"));
	    	SQLSalle.setNom_salle(rs.getString("Nom_Salle"));
	    	SQLSalle.setPlaces(rs.getInt("Places"));
	      
	      // print the results
	      System.out.println(
	    		  "Num_Salle " + SQLSalle.getNum_salle() + 
	    		  ", Nom_Bat " + SQLSalle.getNum_bat() +
	    		  ", Etage " + SQLSalle.getEtage() +
	    		  ", Nom_Salle " + SQLSalle.getNom_salle() + 
	      		  " ,Places " + SQLSalle.getPlaces() 
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
