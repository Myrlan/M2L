package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Page extends Frame {
    
	   public Page(){
	      super("M2L");
	      prepareGUI();
	   }

	   public static void main(String[] args){
	      //Page  awtGraphicsDemo = new Page();  
	      //awtGraphicsDemo.setVisible(true);
		  //Accueil accueil = new Accueil();
		   
		   Accueil accueil = new Accueil();
	      //RDC room = new RDC();
	   }

	   private void prepareGUI(){
	      setSize(1920,1080);
	      addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      }); 
	   }

	   @Override
	   public void paint(Graphics g) {
	      Graphics2D g2 = (Graphics2D)g;        
	      Font plainFont = new Font("Serif", Font.PLAIN, 30);        
	      g2.setFont(plainFont);
	      g2.setColor(Color.red);
	      g2.drawString("Maison des Ligues de Lorraine", 550, 150); 
	   }
	   
	   
	}