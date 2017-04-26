package m2l;

import java.awt.*;
import javax.swing.*;

public class RDC extends JFrame{

  public RDC(){
		
    this.setTitle("Rez-de-chaussée");
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

    JPanel b4 = new JPanel();
    //On positionne maintenant ces trois lignes en colonne
    b4.setPreferredSize(new Dimension(1600, 1000));
    b4.add(b1);
    
    this.getContentPane().add(b1);
    this.setVisible(true);
  }
}