package vue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import calendar.src.com.toedter.calendar.JCalendar;
import javax.swing.*;
import java.awt.*;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class Reservation extends JFrame{
	
	public Reservation(String salle){
	String nom_salle = new String(salle);
	String taille_salle= new String("10m²");
	String localisation_salle= new String("Batiment A");
	String materiel_salle= new String("Rétroprojecteur, Tableau à feutre , 20 Tables ,40 chaises ");
	
    this.setTitle("Reservation de salle "+nom_salle);
    this.setSize(1920, 1080);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
	JPanel reservation1 = new JPanel();
	reservation1.setLayout(null);
	
	JLabel titre = new JLabel("Reservation de la salle "+nom_salle);
	titre.setBounds(800, 10, 1000, 300);
	Font font = new Font("SansSerif", Font.BOLD, 40);
	titre.setFont(font);
	JLabel loca = new JLabel("Localisation: "+localisation_salle);
	loca.setBounds(200, 200, 1000, 50);
	JLabel taille = new JLabel("taille de la salle: "+taille_salle);
	taille.setBounds(200, 300, 1000, 50);
	JLabel materiel = new JLabel("Materiel disponible: "+materiel_salle);
	materiel.setBounds(200, 400, 1000, 50);
	reservation1.add(titre);
	reservation1.add(loca);
	reservation1.add(taille);
	reservation1.add(materiel);
    JButton returne = new JButton();
    JButton valider = new JButton("choisir cette date");
    valider.setBounds(450, 810, 200, 150);
    reservation1.add(valider);
    reservation1.add(returne);
    returne.setText("retour");
    returne.setBounds(1500, 800, 100, 100);
    JCalendar c = new JCalendar();
    c.setBounds(700, 700, 300, 300);
    reservation1.add(c);
    
    JLabel entrée1 = new JLabel("Date de reservation");
    entrée1.setBounds(500, 600, 300, 100);
    reservation1.add(entrée1);
    JTextField entrée2 = new JTextField("choisir une date ci-dessous");
    entrée2.setBounds(700, 600, 300, 100);
    reservation1.add(entrée2);
    valider.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent e){ 
	    	 SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	    	 Date date = c.getCalendar().getTime();
	    	 Locale locale = Locale.getDefault();
	    	 String formatted = format1.format(date.getTime());
	    	 DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
	    	 entrée2.setText(dateFormat.format(date)); 
	    	 System.out.print(formatted);
	            //other.myMethod();
	     }
	    });
    
    returne.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent e){ 
	     Building building = new Building();
	     dispose();
	            //other.myMethod();
	     }
	    });
    this.getContentPane().add(reservation1);
    
    this.setVisible(true);
	}
	public static void main(String[] args){

		   
		Reservation reserv = new Reservation("A1");
	      
	   }
	
}
