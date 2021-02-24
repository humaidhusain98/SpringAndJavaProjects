package Ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.DoctorController;
import entity.Doctor;

public class BookAppointmentUi extends JFrame implements ItemListener{
	 
	static JFrame f; 
	  
	    // label 
	static JLabel l, l1; 
	  
	    // combobox 
	static JComboBox c1; 
	  
	    // textfield to add and delete items 
	static JTextField tf; 
	
	public BookAppointmentUi() {
	
        setLayout(new FlowLayout()); 
  
  
        DoctorController doctorController=new DoctorController();
        List<String> doctornameslist= doctorController.getAllDoctorNames();
        String[] doctornames=new String[doctornameslist.size()];
         doctornames=doctornameslist.toArray(doctornames);
  
        // create checkbox 
        c1 = new JComboBox( doctornames); 
  
        // create textfield 
        tf = new JTextField(16); 
  
  
        // add ItemListener 
        c1.addItemListener(this); 
  
        // create labels 
        l = new JLabel("Select Doctor");  
  
  
        // create a new panel 
        JPanel p = new JPanel(); 
  
        p.add(l); 
  
        // add combobox to panel 
        p.add(c1); 
  
        p.add(tf); 
  
        setLayout(new FlowLayout()); 
        setTitle("Book Appointment");
        // add panel to frame 
        add(p); 
  
        // set the size of frame 
        setSize(600, 400); 
  
        setVisible(true);
		
	
	}
	
	
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
	
		
	}
	
	
	public static void main(String args[]) 
	{
		new BookAppointmentUi();
	}
	
	
	

}
