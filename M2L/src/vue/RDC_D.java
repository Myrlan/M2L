package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class RDC_D extends JFrame{

	private static final long serialVersionUID = 1L;

	public RDC_D(){
		
	    this.setTitle("Rez-de-chauss�e D");
	    this.setSize(1920, 1080);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    JPanel b1 = new JPanel();
	    b1.setPreferredSize(new Dimension(1920,1080));
	    b1.setLayout(null);
	    
	    JButton S_Majorelle = new JButton();
	    b1.add(S_Majorelle);
	    S_Majorelle.setText("Salle Majorelle");
	    S_Majorelle.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Majorelle.setBounds(80, 50, 300, 100);
	    
	   JButton Cuisine = new JButton();
	    b1.add(Cuisine);
	    Cuisine.setText("Cuisine");
	    Cuisine.setFont(new Font("Arial", Font.PLAIN, 25));
	    Cuisine.setBounds(80, 150, 300, 100);
	    
	    JButton S_Restau = new JButton();
	    b1.add(S_Restau);
	    String Salle_restau = "Salle de restauration et de convivialit�";
	    S_Restau.setText("<html>" + Salle_restau.replaceAll("\\n", "<br>") + "</html>");
	    S_Restau.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Restau.setBounds(80, 250, 300, 200);
	    
	    JButton Reprographie = new JButton();
	    b1.add(Reprographie);
	    Reprographie.setText("Reprographie");
	    Reprographie.setFont(new Font("Arial", Font.PLAIN, 25));
	    Reprographie.setBounds(80, 450, 300, 100);
	    
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
	    S_Majorelle.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("D01");
	
		     }
		    });
	    Cuisine.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("D02");
	
		     }
		    });
	    S_Restau.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("D03");
	
		     }
		    });
	    Reprographie.addActionListener(new ActionListener(){
		     public void actionPerformed(ActionEvent e){

		    	 new Reservation("D04");
	
		     }
		    });
	    
	    
	    
	    JScrollPane _ScrollPane = new JScrollPane(b1);    
        this.add(_ScrollPane, BorderLayout.CENTER);       
        this.setPreferredSize(new Dimension(800,600));
        this.pack(); 
	    this.setVisible(true);
		
	}

}
