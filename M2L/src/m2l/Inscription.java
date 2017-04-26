package m2l;

import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.*;
import java.sql.*;


public class Inscription {
	
	
	public static void Inscrire() {

		String s1,s2,s3,s4,s5;
		
		// Cr�e un panneau
		JPanel contenuFen�tre = new JPanel();

		// Affecte un gestionnaire de pr�sentation � ce panneau
		GridLayout disposition = new GridLayout(6,3,30,15);
		contenuFen�tre.setLayout(disposition);

		// Cr�e les contr�les en m�moire
		JLabel nom = new JLabel("Nom : ");
		JTextField entre1 = new JTextField(30);
		JLabel prenom = new JLabel("Pr�nom : ");
		JTextField entre2 = new JTextField(10);
		JLabel adresse = new JLabel("Adresse : ");
		JTextField entre3 = new JTextField(10);
		JLabel email = new JLabel("Email : ");
		JTextField entre4 = new JTextField(50);
		JLabel telephone = new JLabel("T�l�phone : ");
		JTextField entre5 = new JTextField(11);
		
		s1=entre1.getText();
		s2=entre2.getText();
		s3=entre3.getText();
		s4=entre4.getText();
		s5=entre5.getText();
		
		
		JButton confirmer = new JButton("Confirmer");
		confirmer.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
		try { 
			String myDriver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost/m2l?autoReconnect=true&useSSL=false"; 
            Connection conn = DriverManager.getConnection(url,"root","root"); 
            Statement st = conn.createStatement();
            
            String SQL = "INSERT INTO utilisateur(`Num_User`,`Nom_User`,`Prenom_User`,`Adresse`,`Email`,`Telephone`)"
            		+ "VALUES (2,'"+s1+"', '"+s2+"', '"+s3+"',' "+s4+"', '"+s5+"')";
            st.executeUpdate( SQL );
            conn.close();
        } catch (Exception error) { 
            System.err.println("Got an exception! "); 
            System.err.println(error.getMessage()); 
        } 
	    	}
	    });
		
		
		Font font = new Font("SansSerif", Font.BOLD, 30);
		entre1.setFont(font);
		entre2.setFont(font);
		entre3.setFont(font);
		entre4.setFont(font);
		entre5.setFont(font);
		
		nom.setFont (font);
		prenom.setFont (font);
		adresse.setFont (font);
		email.setFont (font);
		telephone.setFont (font);
		confirmer.setFont(font);
		
		entre1.setDocument(new JTextFieldLimit(50));
		entre2.setDocument(new JTextFieldLimit(50));
		entre3.setDocument(new JTextFieldLimit(50));
		entre4.setDocument(new JTextFieldLimit(50));
		entre5.setDocument(new JTextFieldLimit(50));


		// Ajoute les contr�les au panneau			
		contenuFen�tre.add(nom);
		contenuFen�tre.add(entre1);
		contenuFen�tre.add(prenom);
		contenuFen�tre.add(entre2);
		contenuFen�tre.add(adresse);
		contenuFen�tre.add(entre3);
		contenuFen�tre.add(email);
		contenuFen�tre.add(entre4);
		contenuFen�tre.add(telephone);
		contenuFen�tre.add(entre5);
		contenuFen�tre.add(confirmer);


		// Cr�e le cadre et y ajoute le panneau
		JFrame cadre = new JFrame("Inscription");
		cadre.setContentPane(contenuFen�tre);

		// Positionne les dimensions et rend la fen�tre visible
		cadre.setSize(1600,1000);
		cadre.setVisible(true);

		}
	
	
}