package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class RDC_B extends JFrame{
	
public RDC_B(){
		
	    this.setTitle("Rez-de-chaussée B");
	    this.setSize(1920, 1080);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    this.setLayout(new BorderLayout());

	    
	    JPanel b1 = new JPanel();
	   // JPanel b2 = new JPanel();
	    b1.setPreferredSize(new Dimension(1920,1080));
	    b1.setLayout(null);
	    
	    
	    JButton S_Lamour = new JButton();
	    b1.add(S_Lamour);
	    S_Lamour.setText("Salle Lamour");
	    S_Lamour.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Lamour.setBounds(630, 50, 300, 70);
	    
	    JButton Amphi = new JButton();
	    b1.add(Amphi);
	    Amphi.setText("Amphithéâtre");
	    Amphi.setFont(new Font("Arial", Font.PLAIN, 25));
	    Amphi.setBounds(630, 120, 300, 350);
	    
	    JButton service = new JButton();
	    b1.add(service);
	    service.setText("service");
	    service.setFont(new Font("Arial", Font.PLAIN, 25));
	    service.setBounds(630, 420, 250, 50);
	    
	    JButton S_Multi = new JButton();
	    b1.add(S_Multi);
	    S_Multi.setText("Salle multimédia");
	    S_Multi.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Multi.setBounds(930, 300, 300, 130);
	    
	    JButton S_Longwy = new JButton();
	    b1.add(S_Longwy);
	    S_Longwy.setText("Salle Longwy");
	    S_Longwy.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Longwy.setBounds(970, 430, 260, 80);
	    
	    JButton returne = new JButton();
	    b1.add(returne);
	    returne.setText("retour");
	    returne.setBounds(100, 800, 100, 100);
	    
	    this.getContentPane().add(b1);
	    
	    returne.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent e){
	      Building building = new Building();
	      dispose();
	            //other.myMethod();
	     }
	    });
	    
	    S_Lamour.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("B01");
	
		     }
		    });

	    Amphi.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("B02");
	
		     }
		    });
	    
	    service.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("B03");
	
		     }
		    });
	    
	    S_Multi.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("B04");
	
		     }
		    });
	    
	    S_Longwy.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("B05");
	
		     }
		    });
	    
	    
	    JScrollPane _ScrollPane = new JScrollPane(b1);
	    
        this.add(_ScrollPane, BorderLayout.CENTER);
        
        this.setPreferredSize(new Dimension(800,600));
        this.pack(); 
        
	    this.setVisible(true);
		
	}

}
