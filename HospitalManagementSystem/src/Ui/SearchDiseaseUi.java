//package Ui;
//import javax.swing.*;
//
//import controller.DiseaseController;
//import entity.Disease;
//
//import java.awt.event.*;
//import java.awt.*;
//public class SearchDiseaseUi extends JFrame implements ActionListener {
////Initializing Components
//    JLabel lb, lb1, lb2, lb3, lb4, lb5;
//    JTextField tf1, tf2, tf3, tf4, tf5;
//    JButton btn;
//    DiseaseController diseaseController=new DiseaseController();
//    //Creating Constructor for initializing JFrame components
//    SearchDiseaseUi() {
//        //Providing Title
//        super("Search Disease Ui Krishna Mohan Jha 102");
//        lb5 = new JLabel("Disease :");
//        lb5.setBounds(20, 20, 150, 20);
//
//
//        tf5 = new JTextField(20);
//        tf5.setBounds(180, 20, 200, 20);
//
//
//        btn = new JButton("Submit");
//        btn.setBounds(50, 50, 100, 20);
//
//
//        btn.addActionListener(this);
//        lb = new JLabel("Disease Information");
//
//        lb.setBounds(30, 80, 450, 30);
//        lb.setForeground(Color.red);
//        lb.setFont(new Font("Serif", Font.BOLD, 20));
//
//
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(500, 500);
//
//
//        lb1 = new JLabel("Name:");
//        lb1.setBounds(20, 120, 100, 20);
//
//
//        tf1 = new JTextField(50);
//        tf1.setBounds(130, 120, 200, 20);
//
//
//        lb2 = new JLabel("Symptom 1:");
//        lb2.setBounds(20, 150, 100, 20);
//
//
//        tf2 = new JTextField(100);
//        tf2.setBounds(130, 150, 200, 20);
//
//
//        lb3 = new JLabel("Symptom 2:");
//        lb3.setBounds(20, 180, 100, 20);
//
//
//        tf3 = new JTextField(50);
//        tf3.setBounds(130, 180, 200, 20);
//
//
//        lb4 = new JLabel("Symptom 3:");
//        lb4.setBounds(20, 210, 100, 20);
//
//
//        tf4 = new JTextField(50);
//        tf4.setBounds(130, 210, 100, 20);
//
//        setLayout(null);
//        //Add components to the JFrame
//        add(lb5);
//        add(tf5);
//        add(btn);
//        add(lb);
//        add(lb1);
//        add(tf1);
//        add(lb2);
//        add(tf2);
//        add(lb3);
//        add(tf3);
//        add(lb4);
//        add(tf4);
//        //Set TextField Editable False
//        tf1.setEditable(false);
//        tf2.setEditable(false);
//        tf3.setEditable(false);
//        tf4.setEditable(false);
//    }
//
//    //Running Constructor
//    public static void main(String args[]) {
//        new SearchDiseaseUi();
//    }
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		diseaseController.loadDisease();
//
//		String name = tf5.getText();
//
//		Disease d=diseaseController.searchDiseaseName(name);
//		if(d!=null)
//		{
//			String s,s1,s2,s3;
//			s=d.getName();
//			s1=d.getSymptom1();
//			s2=d.getSymptom2();
//			s3=d.getSymptom3();
//
//		    tf1.setText(s);
//            tf2.setText(s1);
//            tf3.setText(s2);
//            tf4.setText(s3);
//
//		}
//		else
//		{
//			  JOptionPane.showMessageDialog(null, "Disease Name Not Found!!");
//		}
//
//
//	}
//}