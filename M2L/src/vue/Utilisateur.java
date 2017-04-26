package vue;

import modele.modeleUtilisateur;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Utilisateur extends JFrame{
	
	
	public Utilisateur(){
		
	    this.setTitle("Accueil Maison des Ligues de Lorraine");
	    this.setSize(1920, 1080);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    JPanel b1 = new JPanel();
	    b1.setLayout(null);
	    
	    Font font_button = new Font("Arial", Font.PLAIN, 35);
	    Font font_title = new Font("Arial", Font.PLAIN, 35);
	    
	    JLabel titre = new JLabel("Bonjour ");
	    titre.setBounds(700,30,1000,100);
	    titre.setFont(font_title);
	    titre.setForeground(Color.RED);
	    b1.add(titre);
	    
	    JButton modif = new JButton();
	    b1.add(modif);
	    modif.setText("Modifier");
	    modif.setFont(new Font("Arial", Font.PLAIN, 25));
	    modif.setBounds(80, 50, 300, 100);
	    
	    JPanel b4 = new JPanel();
	    b4.setPreferredSize(new Dimension(1600, 1000));
	    b4.add(b1);
	    
	    this.getContentPane().add(b1);
	    this.setVisible(true);
		
	}
}
