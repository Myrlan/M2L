package m2l;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDDLogin {
	
	public BDDLogin(){
		
		
		
	};
	static Connection conn ;
	public static void connexionBD()
	{
		String myDriver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost/m2l?autoReconnect=true&useSSL=false"; 
	    try {
	    	if(conn==null){
			 conn = DriverManager.getConnection(url,"root","root");
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Connexion BDD echouée");
			e.printStackTrace();
		} 

	}

	public static void  select(){
		 connexionBD();
		try { 
	    Statement st = conn.createStatement();
	    
	    String query = "SELECT * FROM utilisateur";
	    
	    // execute the query, and get a java resultset
	    ResultSet rs = st.executeQuery(query);
	    
	    // iterate through the java resultset
	    while (rs.next())
	    {
	      int num_user = rs.getInt("Num_User");
	      String nom = rs.getString("Nom_User");
	      String prenom = rs.getString("Prenom_User");
	      String adresse = rs.getString("Adresse");
	      String email = rs.getString("Email");
	      int tel = rs.getInt("Telephone");
	      
	      // print the results
	      System.out.format("%s, %s, %s, %s, %s, %s\n", num_user, nom, prenom, adresse, email, tel);
	    }
	    st.close();
	    rs.close();
	    conn.close();
	    
		} catch (Exception e) { 
		    System.err.println("Selection echouée "); 
		    System.err.println(e.getMessage()); 
		}
			
		}
	
	public static void  Modifier(){
		
		 select();
		
	}
	
}

