package m2l;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.*;

import org.jdatepicker.impl.*;

public class Calendrier extends JFrame{

  public Calendrier(){
		
    this.setTitle("Calendrier");
    this.setSize(600, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    JPanel b1 = new JPanel();
    b1.setLayout(null);
    
    SqlDateModel model = new SqlDateModel();
    Properties p = new Properties();
    p.put("text.today", "Today");
    p.put("text.month", "Month");
    p.put("text.year", "Year");
    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
    JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
    datePicker.setBounds(80, 20, 400, 80);
    
    java.sql.Date selectedDate = (java.sql.Date) datePicker.getModel().getValue();
     
    Font font = new Font("Arial", Font.PLAIN, 25);
    
    JButton returne = new JButton();
    b1.add(returne);
    returne.setText("Annuler");
    returne.setFont(font);
    returne.setBounds(100, 450, 150, 80);
    returne.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
      Building building = new Building();
      dispose();
            //other.myMethod();
     }
    });

    JButton Reserver = new JButton();
    b1.add(Reserver);
    Reserver.setText("Réserver");
    Reserver.setFont(font);
    Reserver.setBounds(300, 450, 150, 80);

    b1.add(datePicker);

    
    this.getContentPane().add(b1);
    this.setVisible(true);
  }
}