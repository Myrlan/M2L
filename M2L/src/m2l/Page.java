package m2l;

import vue.Accueil;
import vue.Utilisateur;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import controller.contUtilisateur;
import modele.BDDConnexion;
import modele.modeleSalle;
import modele.modeleUtilisateur;


public class Page extends Frame {
    
	   public Page(){
	      super("M2L");
	      prepareGUI();
	   }

	   public static void main(String[] args) throws SQLException{
	      //Page  awtGraphicsDemo = new Page();  
	      //awtGraphicsDemo.setVisible(true);
		  //Accueil accueil = new Accueil();
	      //Building building = new Building();
	      //RDC room = new RDC();
		   //Inscription.Inscrire();
	      //BDDLogin.select();
		   //BDDChargeSalle.chargerSalle();
		  // BDDLogin.conn.close();
		  //Utilisateur utilisateur = new Utilisateur();
		   //modeleUtilisateur.select();
		   //contUtilisateur.selectInfo();
		   //BDDConnexion.select();
		   //modeleUtilisateur.select();
		   //modeleSalle.select();
	   }

	   private void prepareGUI(){
	      setSize(1920,1080);
	      addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      }); 
	   }    

	   @Override
	   public void paint(Graphics g) {
	      Graphics2D g2 = (Graphics2D)g;        
	      Font plainFont = new Font("Serif", Font.PLAIN, 30);        
	      g2.setFont(plainFont);
	      g2.setColor(Color.red);
	      g2.drawString("Maison des Ligues de Lorraine", 550, 150); 
	   }
	   
	   
	}