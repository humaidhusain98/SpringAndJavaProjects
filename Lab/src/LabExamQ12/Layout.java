package LabExamQ12;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;  
import java.awt.FlowLayout;
public class Layout
{	
	public static void main(String args[])
	{
	//Creating a Label to display Text
	JLabel lab=new JLabel();
		
	//Creating Frame	
	JFrame frame1 =new JFrame("Layout");
	frame1.setSize(500,250);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//Creating Buttons
	JButton jb1=new JButton("Button 1");
	JButton jb2=new JButton("Button 2");
	JButton jb3=new JButton("Button 3");
	JButton jb4=new JButton("Button 4");
	JButton jb5=new JButton("Button 5");
	JButton jb6=new JButton("Button 6");
	//Creating Panel
	JPanel panel=new JPanel();
	panel.setLayout(new FlowLayout(FlowLayout.LEFT,50,10));
	//Defining the Button Functions
	jb1.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){  
		    	java.util.Date date=new java.util.Date();
		       lab.setText("Button 1 was clicked on "+date);  
		    }  
		    });  
	jb2.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){  
	    		java.util.Date date=new java.util.Date();
	            lab.setText("Button 2 was clicked on "+date);  
	    }  
	    });  
	jb3.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){  
	    		java.util.Date date=new java.util.Date();
	            lab.setText("Button 3 was clicked on "+date);  
	    }  
	    }); 
	jb4.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){  
	    		java.util.Date date=new java.util.Date();
	            lab.setText("Button 4 was clicked on "+date);  
	    }  
	    }); 
	jb5.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){  
	    		java.util.Date date=new java.util.Date();
	            lab.setText("Button 5 was clicked on "+date);  
	    }  
	    }); 
	jb6.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){  
	    	java.util.Date date=new java.util.Date();    
	    	lab.setText("Button 6 was clicked on "+date);  
	    }  
	    }); 
	//Adding Buttons to Panel
	panel.add(jb1);
	panel.add(jb2);
	panel.add(jb3);
	panel.add(jb4);
	panel.add(jb5);
	panel.add(jb6);
	panel.add(lab);
	frame1.add(panel);
	frame1.setVisible(true);
	}
	
}
