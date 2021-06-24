import javax.swing.*;
import java.awt.*;

public class panels {

    public static void main(String[] args) {

        ImageIcon icon =new ImageIcon("/home/humaid/Desktop/github-repositories/SpringAndJavaProjects/JavaGUITutorial/thumb.png");

        JLabel label=new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
//        label.setVerticalAlignment(JLabel.BOTTOM);//works only with border layout
//        label.setHorizontalAlignment(JLabel.RIGHT); //works only with border layout
        label.setBounds(100,100,75,75);

        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);




        JFrame frame=new JFrame();
        frame.setTitle("Title of Frame");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setVisible(true);

       bluePanel.add(label);


        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }

}
