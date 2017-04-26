package vue;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Accueil extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Accueil(){
		this.setTitle("Acceuil M2L");
	    this.setSize(1920, 1080);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    JPanel accueil = new JPanel();
	    JButton M2L = new JButton();
	    JButton louer = new JButton();
	    JButton creer = new JButton();
	    JButton connecter = new JButton();
	    JButton admin = new JButton();
	    JButton quitter= new JButton();

	    accueil.setLayout(null);
	    
	    this.add(accueil);
	    accueil.add(M2L);
	    accueil.add(louer);
	    accueil.add(creer);
	    accueil.add(connecter);
	    accueil.add(admin);
	    accueil.add(quitter);
	    
	    M2L.setText("Maison des ligue de Lorraine");
	    M2L.setFont(new Font("Arial", Font.PLAIN, 30));
	    M2L.setBounds(100, 300, 400, 100);
	    M2L.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){

	    		dispose();
	    	}
	    });
	    
	    louer.setText("Louer une salle");
	    louer.setFont(new Font("Arial", Font.PLAIN, 30));
	    louer.setBounds(500, 300, 400, 100);
	    louer.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		Building building = new Building();
	    		dispose();
	            //other.myMethod();	    
	    	}
	    });
	    
	    creer.setText("Inscription");
	    creer.setFont(new Font("Arial", Font.PLAIN, 30));
	    creer.setBounds(900, 300, 400, 100);
	    creer.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		Inscription compte = new Inscription();
	    		dispose();
	            //other.myMethod();	    
	    
	    	}
	    });
	    
	    
	    
	    connecter.setText("Se connecter");
	    connecter.setFont(new Font("Arial", Font.PLAIN, 30));
	    connecter.setBounds(1300, 300, 400, 100);
	    connecter.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		Arbo_App arbo=new Arbo_App();
	    		dispose();
	            //other.myMethod();	    
	    
	    	}
	    });
	     
	    
	   
	    admin.setText("Zone Administrateur");
	    admin.setFont(new Font("Arial", Font.PLAIN, 30));
	    admin.setBounds(100, 500, 1600, 100);
	    admin.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		
	    		dispose();
	            //other.myMethod();	    
	    
	    	}
	    });
		    
	    quitter.setText("Quitter");
	    quitter.setFont(new Font("Arial", Font.PLAIN, 30));
	    quitter.setBounds(1300, 900, 400, 100);
	    quitter.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		
	    		dispose();
	            //other.myMethod();	    
	    
	    	}
	    });
	    this.setVisible(true);
	  }    


}
