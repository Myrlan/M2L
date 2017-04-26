package m2l;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class BDDChargeBuilding {
	
	public static List<Building> chargerBatiments(){
		
		BDDLogin.connexionBD();
		
		ArrayList<Building> batiments = new ArrayList<Building>();
		
		try{

		Statement st = BDDLogin.conn.createStatement();
		ResultSet rs = st.executeQuery("Select * FROM batiment");
    
    // iterate through the java resultset
    while (rs.next())
    {
      //batiments.add(new Building(rs.getInt("Num_Bat"), rs.getString("Nom_Bat")));
      
      // print the results
      for(Building elem: batiments){
    	   System.out.println(elem);
      }
     
    }
   
}catch (Exception e) { 
    System.err.println("Selection echouée "); 
    System.err.println(e.getMessage()); 
}
 return batiments;
}

}
