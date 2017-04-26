package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class modeleUtilisateur {
	
	public static void main(String[] args){
			select();
	}
	
	static int i=0;
	
	
	public static void select(){
		
		SQLUtilisateur user_list = new SQLUtilisateur();
	    
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
	
	public static void insert_user(){
		BDDConnexion.connexionBD();
		try { 
			String myDriver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost/m2l?autoReconnect=true&useSSL=false"; 
            Connection conn = DriverManager.getConnection(url,"root","root"); 
            Statement st = conn.createStatement();
            
            String SQL = "INSERT INTO utilisateur(`Num_User`,`Nom_User`,`Prenom_User`,`Adresse`,`Telephone`,`Email`,`Mdp`)"
            		+ "VALUES ( 4"
            		+ ",'" +SQLUtilisateur.getNom()
            		+ "','" +SQLUtilisateur.getPrenom()
            		+ "','" +SQLUtilisateur.getAdresse()
            		+ "'," +SQLUtilisateur.getTel()
            		+ ",'" +SQLUtilisateur.getEmail()
            		+ "','" +SQLUtilisateur.getMdp()
            		+"')";
            st.executeUpdate( SQL );
            conn.close();
        } catch (Exception error) { 
            System.err.println("Got an exception! "); 
            System.err.println(error.getMessage()); 
        }
		
	}

}
