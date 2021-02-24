package LabExamQ12;
import java.awt.*;  
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 
public class DrawLayout extends Frame implements MouseMotionListener{  
    DrawLayout()
    {  
        addMouseMotionListener(this);  
        setSize(500,250);
      //Creating Buttons
    	JButton jb1=new JButton("Button 1");
    	JButton jb2=new JButton("Button 2");
    	JButton jb3=new JButton("Button 3");
    	JButton jb4=new JButton("Button 4");
    	JButton jb5=new JButton("Button 5");
    	JButton jb6=new JButton("Button 6");
    	
    	JPanel panel=new JPanel();
    	panel.setLayout(new FlowLayout(FlowLayout.LEFT,50,10));
    	//Defining the Button Functions
    	JLabel lab=new JLabel();
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
    	this.add(panel);
        setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) 
{  
    Graphics g=getGraphics();  
    g.setColor(Color.BLACK);  
    g.fillOval(e.getX(),e.getY(),20,20);  
}

public void mouseMoved(MouseEvent e) 
{
	
}  
  
public static void main(String[] args) 
{  
   DrawLayout drawLayout= new DrawLayout();
  
}

}  