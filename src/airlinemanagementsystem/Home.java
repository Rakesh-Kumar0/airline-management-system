package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    public Home() {
        setLayout(null);
        getContentPane().setBackground(new Color(224, 93, 25));
        
        // ImageIcon i1 = new ImageIcon(getClass().getResource("icons/front.jpg"));
        ImageIcon i1 = new ImageIcon(getClass().getResource("icons/Front2.png"));

        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 800);
        add(image);
        
        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        heading.setBounds(600, 40, 1000, 40);
        heading.setForeground(Color.RED);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
        image.add(heading);