import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class labels {

    public static void main(String[] args)
    {
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(1200,1000);
        frame.setVisible(true);

        //frame.setLayout(null);
        //label

        JLabel label=new JLabel();
        label.setText("Bro,do you even code");
        frame.add(label);


        //image
        ImageIcon image=new ImageIcon("/home/humaid/Desktop/github-repositories/SpringAndJavaProjects/JavaGUITutorial/logo.png");
        Border border=BorderFactory.createLineBorder(Color.green,3);
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//TOP,CENTER,BOTTOM of imageicon
        label.setForeground(Color.green);//set font color of text
        label.setFont(new Font("MV Boli",Font.BOLD,20));//set font of text
        label.setIconTextGap(-50);
        label.setBackground(Color.blue);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,100,250,250);//set x,y position within frame as well as dimensions
        frame.pack();


    }
}
