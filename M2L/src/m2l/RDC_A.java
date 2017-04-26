package m2l;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RDC_A extends JFrame{
	
	public RDC_A(){
		
	    this.setTitle("Rez-de-chaussée A");
	    this.setSize(1920, 1080);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    JPanel b1 = new JPanel();
	    b1.setLayout(null);
	    
	    Font font = new Font("Arial", Font.PLAIN, 25);
	    
	    JButton S_Daum = new JButton();
	    b1.add(S_Daum);
	    S_Daum.setText("Salle Daum");
	    S_Daum.setFont(font);
	    S_Daum.setBounds(970, 510, 180, 100);
	    S_Daum.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		Calendrier calendrier = new Calendrier();
	    		JButton salle = (JButton) e.getSource();
	    		dispose();
	            //other.myMethod();
	    	}
	    });
	    
	    JButton S_Galle = new JButton();
	    b1.add(S_Galle);
	    S_Galle.setText("Salle Gallé");
	    S_Galle.setFont(font);
	    S_Galle.setBounds(1150, 510, 180, 100);
	    
	    JButton S_Corbin = new JButton();
	    b1.add(S_Corbin);
	    S_Corbin.setText("Salle Gallé");
	    S_Corbin.setFont(font);
	    S_Corbin.setBounds(1330, 510, 180, 100);
	    
	    JButton S_Baccarat = new JButton();
	    b1.add(S_Baccarat);
	    S_Baccarat.setText("Salle Gallé");
	    S_Baccarat.setFont(font);
	    S_Baccarat.setBounds(1510, 510, 180, 100);
	    
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
