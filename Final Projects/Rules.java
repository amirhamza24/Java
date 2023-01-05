package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton back, start;
    Rules(String name){
        
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Do not eat or drink during your exam." + "<br><br>" +
                "2. Don’t use your mobile phone" + "<br><br>" +
                "3. Don’t sit in a room with any other person." + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Don’t move from your place during your exam." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public static void main(String[] args){
        new Rules("User");
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
}
