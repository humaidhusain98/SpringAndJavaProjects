import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button extends JFrame{
    JButton button;
    JLabel label;
    public button(){

        ImageIcon icon=new ImageIcon("/home/humaid/Desktop/github-repositories/SpringAndJavaProjects/JavaGUITutorial/point.png");
        ImageIcon icon2=new ImageIcon("/home/humaid/Desktop/github-repositories/SpringAndJavaProjects/JavaGUITutorial/blowkisssmall.png");


        label=new JLabel();
        label.setIcon(icon2);
        label.setBounds(200,250,150,150);
        label.setVisible(false);


        button=new JButton();
        button.setBounds(100,100,250,100);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.addActionListener(e ->{
            label.setVisible(true);
        });
        button.setFont(new Font("Comic Sans", Font.ITALIC,25));
        button.setIconTextGap(10);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==button){
//            System.out.println("HOO!");
//        }
//    }
}
