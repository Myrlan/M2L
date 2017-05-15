package vue;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modele.SQLUtilisateur;
import modele.modeleUtilisateur;


public class Inscription extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	

	
	public Inscription(){
		
		
		Font font = new Font("SansSerif", Font.BOLD, 30);
		JPanel contenuFenêtre = new JPanel();
		contenuFenêtre.setSize(1920, 1080);
		GridLayout disposition = new GridLayout(8,3,30,15);
		contenuFenêtre.setLayout(disposition);
		JLabel nom = new JLabel("Nom* : ");
		JTextField entre1 = new JTextField(10);
		JLabel prenom = new JLabel("Prénom* : ");
		JTextField entre2 = new JTextField(10);
		JLabel adresse = new JLabel("Adresse : ");
		JTextField entre3 = new JTextField(10);
		JLabel email = new JLabel("Email* : ");
		JTextField entre4 = new JTextField(10);
		JLabel telephone = new JLabel("Téléphone : ");
		JTextField entre5 = new JTextField(10);
		
		JLabel Mot_de_passe = new JLabel("Mot de *");
		JTextField entre6 = new JTextField(10);
		JLabel Mot_de_passe1 = new JLabel("Valider le mot de passe* : ");
		JTextField entre7 = new JTextField(10);
		
		entre1.setFont(font);
		nom.setFont (font);
		prenom.setFont (font);
		adresse.setFont (font);
		email.setFont (font);
		telephone.setFont (font);
		Mot_de_passe.setFont (font);
		Mot_de_passe1.setFont (font);
		
		entre1.setFont(font);
		entre2.setFont(font);
		entre3.setFont(font);
		entre4.setFont(font);
		entre5.setFont(font);
		entre6.setFont(font);
		entre7.setFont(font);
			
		entre1.setDocument(new JTextFieldLimit(50));
		entre2.setDocument(new JTextFieldLimit(50));
		entre3.setDocument(new JTextFieldLimit(50));
		entre4.setDocument(new JTextFieldLimit(50));
		entre5.setDocument(new JTextFieldLimit(50));
		entre6.setDocument(new JTextFieldLimit(50));
		entre7.setDocument(new JTextFieldLimit(50));

		// Ajoute les contrôles au panneau			
		contenuFenêtre.add(nom);
		contenuFenêtre.add(entre1);
		contenuFenêtre.add(prenom);
		contenuFenêtre.add(entre2);
		contenuFenêtre.add(email);
		contenuFenêtre.add(entre4);
		contenuFenêtre.add(Mot_de_passe);
		contenuFenêtre.add(entre6);
		contenuFenêtre.add(Mot_de_passe1);
		contenuFenêtre.add(entre7);
		
		contenuFenêtre.add(adresse);
		contenuFenêtre.add(entre3);
		contenuFenêtre.add(telephone);
		contenuFenêtre.add(entre5);
		

		
		JButton retour=new JButton();
		contenuFenêtre.add(retour);
		retour.setText("Retour");
		retour.setBounds(100, 1000, 50, 50);
    	retour.addActionListener(new ActionListener(){
 	    	public void actionPerformed(ActionEvent e){
 	    		Accueil accueil = new Accueil();
 	    		dispose();
 	    		}
    			});
		JButton valider=new JButton();
		contenuFenêtre.add(valider);
		valider.setText("valider");
		valider.setBounds(100, 1000, 50, 50);
		valider.addActionListener(new ActionListener(){
 	    	public void actionPerformed(ActionEvent e){
 	    		SQLUtilisateur utilisateur = new SQLUtilisateur();
	    		utilisateur.setNom(entre1.getText());
	    		utilisateur.setPrenom(entre2.getText());
	    		utilisateur.setAdresse(entre3.getText());
	    		utilisateur.setEmail(entre4.getText());
	    		utilisateur.setTel(Integer.parseInt(entre5.getText()));
	    		utilisateur.setMdp(entre6.getText());
	    		
	    		modeleUtilisateur.insert_user();

 	    		//System.out.print("s1:"+s1);
 	    		Validation valid=new Validation();
 	    		if(entre1.getText().equals(null))
 	    		{
 	    		valid.Validation("ERREUR: Vous n'avez pas rempli tous les champs obligatoires");
 	    		}
 	    		else if(!(entre6.getText().equals(entre7.getText())))
 	    		{
 	    			valid.Validation("ERREUR: Votre mot de passe ne concorde pas ");
 	    			
 	    		}
 	    		else if(entre6==null||entre7==null)
 	    		{
 	    			valid.Validation("ERREUR: veillez saisir votre mot de passe 2 fois ");
 	    		}
 	    		/*else if(s1!=null)
 	    		{
 	    		valid.Validation("Message informatif: Votre compte a été créé");	
 	    		
 	    		dispose();
 	    		}*/
 	    		
 	    		
 	    		}
    			});
    	

		this.setContentPane(contenuFenêtre);

		// Positionne les dimensions et rend la fenêtre visible
		this.setSize(1920, 1080);
		this.setVisible(true);

											}


					}