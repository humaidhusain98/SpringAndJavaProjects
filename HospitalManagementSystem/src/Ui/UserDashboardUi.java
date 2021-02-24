package Ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UserDashboardUi extends JFrame implements ActionListener{

	JPanel panel1,panel2,panel3;
	JTable j;
	
	public UserDashboardUi() {
		
		String[][] data = { 
	            { "Kundan Kumar Jha", "4031", "CSE" }, 
	        }; 
	  String[] columnNames = { "Name", "Roll Number", "Department" }; 
	  j = new JTable(data, columnNames);
	  j.setBounds(30, 40, 100, 300); 
	  JScrollPane sp = new JScrollPane(j);
	  sp.setBounds(30, 40, 100, 300);
	  add(sp);
	  setSize(500, 400); 
	  setVisible(true);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new UserDashboardUi();
	}  
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
}
