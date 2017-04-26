/*package vue;

import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.*;

import modele.SQLUtilisateur;
import modele.modeleUtilisateur;

import java.sql.*;


public class Inscription {
	
	public static void main(String[] args){
		Inscrire();
	}
	
	public static void Inscrire() {

		
		// Crée un panneau
		JPanel contenuFenêtre = new JPanel();

		// Affecte un gestionnaire de présentation à ce panneau
		GridLayout disposition = new GridLayout(7,2);
		contenuFenêtre.setLayout(disposition);

		// Crée les contrôles en mémoire
		JLabel nom = new JLabel("Nom : ");
		JTextField entre1 = new JTextField(30);
		JLabel prenom = new JLabel("Prénom : ");
		JTextField entre2 = new JTextField(10);
		JLabel adresse = new JLabel("Adresse : ");
		JTextField entre3 = new JTextField(10);
		JLabel email = new JLabel("Email : ");
		JTextField entre4 = new JTextField(50);
		JLabel mdp = new JLabel("Mot de passe : ");
		JTextField entre5 = new JTextField(50);
		JLabel telephone = new JLabel("Téléphone : ");
		JTextField entre6 = new JTextField(11);
		
		
		JButton confirmer = new JButton("Confirmer");
		confirmer.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){	
	    		SQLUtilisateur utilisateur = new SQLUtilisateur();
	    		utilisateur.setNom(entre1.getText());
	    		utilisateur.setPrenom(entre2.getText());
	    		utilisateur.setAdresse(entre3.getText());
	    		utilisateur.setEmail(entre4.getText());
	    		utilisateur.setMdp(entre5.getText());
	    		utilisateur.setTel(Integer.parseInt(entre6.getText()));
	    		modeleUtilisateur.insert_user();
	    	}
	    });
		
		
		Font font = new Font("SansSerif", Font.BOLD, 30);
		entre1.setFont(font);
		entre2.setFont(font);
		entre3.setFont(font);
		entre4.setFont(font);
		entre5.setFont(font);
		entre6.setFont(font);
		
		nom.setFont (font);
		prenom.setFont (font);
		adresse.setFont (font);
		email.setFont (font);
		mdp.setFont(font);
		telephone.setFont (font);
		confirmer.setFont(font);
		
		entre1.setDocument(new JTextFieldLimit(50));
		entre2.setDocument(new JTextFieldLimit(50));
		entre3.setDocument(new JTextFieldLimit(50));
		entre4.setDocument(new JTextFieldLimit(50));
		entre5.setDocument(new JTextFieldLimit(50));
		entre6.setDocument(new JTextFieldLimit(50));


		// Ajoute les contrôles au panneau			
		contenuFenêtre.add(nom);
		contenuFenêtre.add(entre1);
		contenuFenêtre.add(prenom);
		contenuFenêtre.add(entre2);
		contenuFenêtre.add(adresse);
		contenuFenêtre.add(entre3);
		contenuFenêtre.add(email);
		contenuFenêtre.add(entre4);
		contenuFenêtre.add(mdp);
		contenuFenêtre.add(entre5);
		contenuFenêtre.add(telephone);
		contenuFenêtre.add(entre6);
		contenuFenêtre.add(confirmer);
		
		
		


		// Crée le cadre et y ajoute le panneau
		JFrame cadre = new JFrame("Inscription");
		cadre.setContentPane(contenuFenêtre);

		// Positionne les dimensions et rend la fenêtre visible
		cadre.setSize(1600,1000);
		cadre.setVisible(true);

		}
	
	
}*/