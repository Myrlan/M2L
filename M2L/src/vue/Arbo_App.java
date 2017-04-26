package vue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Arbo_App extends JFrame{
		
		
	    public Arbo_App()
	    {
	    	this.setTitle("Acceuil M2L");
		    this.setSize(1920, 1080);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
	    	JPanel arbo=new JPanel();
	    	arbo.setLayout(null);
	    	
	    	JButton retour=new JButton();
	    	JButton Accueil = new JButton();
	    	JButton batimentA = new JButton();
	    	JButton batimentB = new JButton();
	    	JButton batimentC= new JButton();
	    	JButton batimentD = new JButton();
	   
	    	
	    	arbo.add(retour);
	    	arbo.add(Accueil);
	    	arbo.add(batimentA);
	    	arbo.add(batimentB);
	    	arbo.add(batimentC);
	    	arbo.add(batimentD);
	   
	    	
	    	retour.setText("Retour au Menu");
	    	Accueil.setText("Hall d'accueil");
	    	batimentA.setText("Batiment A");
	    	batimentB.setText("Batiment B");
	    	batimentC.setText("Batiment C");
	    	batimentD.setText("Batiment D");
	    
	    	
	    	retour.setFont(new Font("Arial", Font.PLAIN, 15));
	    	Accueil.setFont(new Font("Arial", Font.PLAIN, 15));
	    	batimentA.setFont(new Font("Arial", Font.PLAIN, 15));
	    	batimentB.setFont(new Font("Arial", Font.PLAIN, 15));
	    	batimentC.setFont(new Font("Arial", Font.PLAIN, 15));
	    	batimentD.setFont(new Font("Arial", Font.PLAIN, 15));
	
	    	
	    	retour.setBounds(50, 50, 200, 100);
	    	Accueil.setBounds(100, 200, 200, 100);
	    	batimentA.setBounds(100, 350, 200, 100);
	    	batimentB.setBounds(100, 500, 200, 100);
	    	batimentC.setBounds(100, 650, 200, 100);
	    	batimentD.setBounds(100, 800, 200, 100);
	    	
	    	
	    	retour.addActionListener(new ActionListener(){
	 	    	public void actionPerformed(ActionEvent e){
	 	    		Accueil accueil = new Accueil();
	 	    		dispose();
	 	    		}
	    			});
	    	
	    	Accueil.addActionListener(new ActionListener(){
	 	    	public void actionPerformed(ActionEvent e){
	 	    		
	 	    		dispose();
	 	    		}
	    			});
	    	
	    	batimentA.addActionListener(new ActionListener(){
	 	    	public void actionPerformed(ActionEvent e){
	 	    		RDC_A rdc=new RDC_A();
	 	    		dispose();
	 	    		}
	    			});
	    	
	    	batimentB.addActionListener(new ActionListener(){
	 	    	public void actionPerformed(ActionEvent e){
	 	    		RDC_B rdc=new RDC_B();
	 	    		dispose();
	 	    		}
	    			});
	    	
	    	batimentC.addActionListener(new ActionListener(){
	 	    	public void actionPerformed(ActionEvent e){
	 	    		RDC_C rdc=new RDC_C();
	 	    		dispose();
	 	    		}
	    			});
	    	
	    	batimentD.addActionListener(new ActionListener(){
	 	    	public void actionPerformed(ActionEvent e){
	 	    		RDC_D rdc=new RDC_D();
	 	    		dispose();
	 	    	}
	 	    });
	    	

	    	
	    	
	    	
	    	this.getContentPane().add(arbo);
	    	this.setVisible(true);
	    	
	    }
	     
	    
	}
