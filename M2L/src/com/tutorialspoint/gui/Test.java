package com.tutorialspoint.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.tutorialspoint.gui.Test;

public class Test extends Frame {
    
	   public Test(){
	      super("Java AWT Examples");
	      prepareGUI();
	   }

	   public static void main(String[] args){
	      Test  awtGraphicsDemo = new Test();  
	      awtGraphicsDemo.setVisible(true);
	   }

	   private void prepareGUI(){
	      setSize(1500,1200);
	      addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      }); 
	   }    

	   @Override
	   public void paint(Graphics g) {
	      Graphics2D g2 = (Graphics2D)g;        
	      Font plainFont = new Font("Serif", Font.PLAIN, 24);        
	      g2.setFont(plainFont);
	      g2.setColor(Color.red);
	      g2.drawString("Welcome to TutorialsPoint", 50, 70); 
	      g2.setColor(Color.GRAY);
	      g2.drawString("Welcome to TutorialsPoint", 50, 120);  
	   }
	}