package quiz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField name;
    public Login(){
      getContentPane().setBackground(Color.white); // chnage frame color
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(null);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
      JLabel image = new JLabel(i1);
      image.setBounds(0,0,600,500); //(left,top,length,width)
      add(image);
      
      JLabel heading = new JLabel("Simple Minds");
      heading.setBounds(750,60,300,45);
      heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
      heading.setForeground(new Color(30,144,254));
      add(heading);
      
      JLabel Name = new JLabel("Enter Your Name");
      Name.setBounds(810,150,300,20);
      Name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
      Name.setForeground(new Color(30,144,254));
      add(Name);
      
      name = new JTextField();
      name.setBounds(735,200,300,30);
      name.setFont(new Font("Times New Roman", Font.BOLD,20));
      add(name);
      
      rules = new JButton("Rules");
      rules.setBounds(735,270,120,40);
      rules.setBackground(new Color(30,140,254));
      rules.setFont(new Font("Roboto",Font.BOLD,18));
      rules.setForeground(Color.white);
      rules.addActionListener(this);
      add(rules);
      
      back = new JButton("Back");
      back.setBounds(915,270,120,40);
      back.setBackground(new Color(30,140,254));
      back.setFont(new Font("Roboto",Font.BOLD,18));
      back.setForeground(Color.white);
      back.addActionListener(this);
      add(back);
      
      setSize(1200,500); // (length, width)
      setLocation(200,200);
      setVisible(true); // visible frame
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == rules){
           
           String userName = name.getText();
           setVisible(false);
           new Rules(userName);
       }else if(ae.getSource() == back){
           setVisible(false);
       }
    }
    
    public static void main(String as[]){
        new Login();
    }
}
