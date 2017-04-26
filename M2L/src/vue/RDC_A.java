package vue;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class RDC_A extends JFrame{
	public RDC_A(){
		
	    this.setTitle("Rez-de-chaussée A");
	    this.setSize(1920, 1080);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    JPanel batA = new JPanel();
	    JPanel boutonPanel = new JPanel();
	    CardLayout cl = new CardLayout();
	    JPanel b1 = new JPanel();
	    JPanel b2 = new JPanel();
	    
	    batA.setLayout(cl);
	    boutonPanel.add(batA);
	    batA.add(b1, "b1");
	    batA.add(b2, "b2");
	    
	    JButton etage1= new JButton();
	    JButton etage2= new JButton();
	    etage1.setText("1");
	    etage2.setText("2");
	    etage1.setBounds(1570, 100, 50, 50);
	    etage2.setBounds(1570, 150, 50, 50);
	    
	    boutonPanel.add(etage1);
	    boutonPanel.add(etage2);

	    // B1 JButton
	    JButton S_Daum = new JButton();
	    b1.add(S_Daum);
	    S_Daum.setText("Salle Daum");
	    S_Daum.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Daum.setBounds(970, 510, 180, 100);
	    
	    JButton S_Galle = new JButton();
	    b1.add(S_Galle);
	    S_Galle.setText("Salle Gallé");
	    S_Galle.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Galle.setBounds(1150, 510, 180, 100);
	    
	    JButton S_Corbin = new JButton();
	    b1.add(S_Corbin);
	    S_Corbin.setText("Salle Gallé");
	    S_Corbin.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Corbin.setBounds(1330, 510, 180, 100);
	    
	    JButton S_Baccarat = new JButton();
	    b1.add(S_Baccarat);
	    S_Baccarat.setText("Salle Gallé");
	    S_Baccarat.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Baccarat.setBounds(1510, 510, 180, 100);
	    
	    
	    
	    
	    
	    
	    JButton returne = new JButton();
	    boutonPanel.add(returne);
	    returne.setText("retour");
	    returne.setBounds(100, 800, 100, 100);
	    
	    //B2 JButton

	    
	    this.getContentPane().add(boutonPanel);
	    
	    
	    
	    returne.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){ 
		     Building building = new Building();
		     dispose();
		            //other.myMethod();
		     }
		    });

	    
	
	    etage1.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 cl.show(batA, "b1");
	
		     }
		    });
	    etage2.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 cl.show(batA, "b2");
		    	
		     }
		    });
	    S_Daum.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){
		    	 new Reservation("A01");
	
		     }
		    });
	    S_Galle.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("A02");
	
		     }
		    });
	    S_Corbin.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("A03");
	
		     }
		    });
	    S_Baccarat.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("A04");
	
		     }
		    });
	    
	    JScrollPane _ScrollPane = new JScrollPane(boutonPanel);
	    
        this.add(_ScrollPane, BorderLayout.CENTER);
        
        this.setPreferredSize(new Dimension(800,600));
        this.pack(); 

	    //this.getContentPane().add(boutonPanel);
	    this.setVisible(true);

	    
	   
		
	}
	
}
