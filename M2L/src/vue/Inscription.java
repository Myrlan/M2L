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
		JPanel contenuFen�tre = new JPanel();
		contenuFen�tre.setSize(1920, 1080);
		GridLayout disposition = new GridLayout(8,3,30,15);
		contenuFen�tre.setLayout(disposition);
		JLabel nom = new JLabel("Nom* : ");
		JTextField entre1 = new JTextField(10);
		JLabel prenom = new JLabel("Pr�nom* : ");
		JTextField entre2 = new JTextField(10);
		JLabel adresse = new JLabel("Adresse : ");
		JTextField entre3 = new JTextField(10);
		JLabel email = new JLabel("Email* : ");
		JTextField entre4 = new JTextField(10);
		JLabel telephone = new JLabel("T�l�phone : ");
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

		// Ajoute les contr�les au panneau			
		contenuFen�tre.add(nom);
		contenuFen�tre.add(entre1);
		contenuFen�tre.add(prenom);
		contenuFen�tre.add(entre2);
		contenuFen�tre.add(email);
		contenuFen�tre.add(entre4);
		contenuFen�tre.add(Mot_de_passe);
		contenuFen�tre.add(entre6);
		contenuFen�tre.add(Mot_de_passe1);
		contenuFen�tre.add(entre7);
		
		contenuFen�tre.add(adresse);
		contenuFen�tre.add(entre3);
		contenuFen�tre.add(telephone);
		contenuFen�tre.add(entre5);
		

		
		JButton retour=new JButton();
		contenuFen�tre.add(retour);
		retour.setText("Retour");
		retour.setBounds(100, 1000, 50, 50);
    	retour.addActionListener(new ActionListener(){
 	    	public void actionPerformed(ActionEvent e){
 	    		Accueil accueil = new Accueil();
 	    		dispose();
 	    		}
    			});
		JButton valider=new JButton();
		contenuFen�tre.add(valider);
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
 	    		valid.Validation("Message informatif: Votre compte a �t� cr��");	
 	    		
 	    		dispose();
 	    		}*/
 	    		
 	    		
 	    		}
    			});
    	

		this.setContentPane(contenuFen�tre);

		// Positionne les dimensions et rend la fen�tre visible
		this.setSize(1920, 1080);
		this.setVisible(true);

											}


					}