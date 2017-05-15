package vue;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;


public class Validation{

     public void Validation(String message){

    JOptionPane jop1;    

    jop1 = new JOptionPane();

    ImageIcon img = new ImageIcon("images/information.png");

    JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE, img);      

  
     }
}       