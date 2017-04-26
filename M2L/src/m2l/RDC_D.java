package m2l;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RDC_D extends JFrame{
	
	public RDC_D(){
		
	    this.setTitle("Rez-de-chaussée D");
	    this.setSize(1920, 1080);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    JPanel b1 = new JPanel();
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
	    String Salle_restau = "Salle de restauration et de convivialité";
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
	    returne.addActionListener(new ActionListener(){
	     public void actionPerformed(ActionEvent e){
	      Building building = new Building();
	      dispose();
	            //other.myMethod();
	     }
	    });
	    
	    JPanel b4 = new JPanel();
	    b4.setPreferredSize(new Dimension(1600, 1000));
	    b4.add(b1);
	    
	    this.getContentPane().add(b1);
	    this.setVisible(true);
		
	}

}
