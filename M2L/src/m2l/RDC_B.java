package m2l;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RDC_B extends JFrame{
	
public RDC_B(){
		
	    this.setTitle("Rez-de-chaussée B");
	    this.setSize(1920, 1080);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    JPanel b1 = new JPanel();
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
