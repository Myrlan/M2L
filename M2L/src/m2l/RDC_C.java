package m2l;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RDC_C extends JFrame{
	
	public RDC_C(){
		
	    this.setTitle("Rez-de-chaussée C");
	    this.setSize(1920, 1080);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    JPanel b1 = new JPanel();
	    b1.setLayout(null);
	    
	    JButton S_Gruber = new JButton();
	    b1.add(S_Gruber);
	    S_Gruber.setText("Salle Grüber");
	    S_Gruber.setFont(new Font("Arial", Font.PLAIN, 25));
	    S_Gruber.setBounds(80, 550, 180, 100);
	    
	    JButton Adm_MDL = new JButton();
	    b1.add(Adm_MDL);
	    Adm_MDL.setText("Administration MDL");
	    Adm_MDL.setFont(new Font("Arial", Font.PLAIN, 25));
	    Adm_MDL.setBounds(260, 580, 300, 70);
	    
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
