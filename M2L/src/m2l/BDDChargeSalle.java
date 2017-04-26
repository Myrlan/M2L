package m2l;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class BDDChargeSalle {
	
	public static List<Salle> chargerSalle(){
		
			BDDLogin.connexionBD();
			
			ArrayList<Salle> salles = new ArrayList<Salle>();
			
			try{

			Statement st = BDDLogin.conn.createStatement();
			ResultSet rs = st.executeQuery("Select * FROM Salle");
	    
	    // iterate through the java resultset
	    while (rs.next())
	    {
	      salles.add(new Salle(rs.getString("Num_Salle"), rs.getInt("Num_Bat"), rs.getString("Nom_Salle"), rs.getInt("Places") ));
	      
	      // print the results
	      for(Salle elem: salles){
	    	   System.out.println(elem);
	      }
	     
	    }
	   
	}catch (Exception e) { 
	    System.err.println("Selection echouée "); 
	    System.err.println(e.getMessage()); 
	}
	 return salles;
	}
		
}
