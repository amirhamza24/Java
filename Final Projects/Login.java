package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener {
    
    JTextField tfname = new JTextField();
    JButton rules = new JButton("Rules");
    JButton back = new JButton("Back");
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 500, 600);
        add(image);
        
        JLabel heading = new JLabel("Test Budddy");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        
        
        setSize(1200,600);
        setLocation(100,100);
        setVisible(true);
        
    }
    
    
    
    public static void main(String[] args){
        new Login();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        
        } else if(e.getSource() == back){
            setVisible(false);
        
        }

    }
}


