package m2l;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Building extends JFrame{

  public Building(){
		
    this.setTitle("Bâtiments");
    this.setSize(1300, 1000);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    JPanel b1 = new JPanel();
    b1.setLayout(null);
    
    JButton bat_A = new JButton();
    bat_A.setBackground(Color.red);
    b1.add(bat_A);
    bat_A.setText("Bâtiment A");
    bat_A.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_A.setBounds(720, 350, 400, 100);
    bat_A.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		RDC_A rdc = new RDC_A();
    		JButton bat = (JButton) e.getSource();
    		dispose();
            //other.myMethod();
    	}
    });
    
    JButton bat_B = new JButton();
    b1.add(bat_B);
    bat_B.setText("Bâtiment B");
    bat_B.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_B.setBounds(450, 50, 400, 300);
    bat_B.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		RDC_B rdc = new RDC_B();
    		dispose();
            //other.myMethod();
    	}
    });
    
    
    JButton bat_C = new JButton();
    b1.add(bat_C);
    bat_C.setText("Bâtiment C");
    bat_C.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_C.setBounds(80, 350, 370, 100);
    bat_C.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		RDC_C rdc = new RDC_C();
    		dispose();
            //other.myMethod();
    	}
    });
    
    
    JButton bat_D = new JButton();
    b1.add(bat_D);
    bat_D.setText("Bâtiment D");
    bat_D.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_D.setBounds(100, 50, 200, 300);
    bat_D.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		RDC_D rdc = new RDC_D();
    		dispose();
            //other.myMethod();
    	}
    });
    
    
    JButton bat_H = new JButton();
    b1.add(bat_H);
    bat_H.setText("Hall d'accueil");
    bat_H.setFont(new Font("Arial", Font.PLAIN, 30));
    bat_H.setBounds(450, 350, 270, 100);

		
    this.getContentPane().add(b1);
    this.setVisible(true);
  }
}