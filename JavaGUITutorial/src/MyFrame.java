import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame()
    {
        
        this.setTitle("Title of this");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("/home/humaid/Desktop/github-repositories/SpringAndJavaProjects/JavaGUITutorial/logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));//000 for black//can also take hexadecimal values
    }


    public static void main(String[] args) {
//        JFrame frame=new JFrame();
//        frame.setTitle("Title of Frame");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.setSize(420,420);
//        frame.setVisible(true);
//        ImageIcon image = new ImageIcon("/home/humaid/Desktop/github-repositories/SpringAndJavaProjects/JavaGUITutorial/logo.png");
//        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(new Color(123,50,250));//000 for black//can also take hexadecimal values

        MyFrame myFrame=new MyFrame();

    }

}
