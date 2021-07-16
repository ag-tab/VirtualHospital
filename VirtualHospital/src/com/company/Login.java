package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener{
    JFrame frame1 = new JFrame();
    JLabel background;
    JTextField ID, Password;
    JButton submit;

    Login() {
        ImageIcon image = new ImageIcon("vh.jpg");
        ImageIcon bg = new ImageIcon("bg3.jpg");

        background = new JLabel(bg);
        background.setSize(800,600);

        frame1.add(background);
        frame1.setTitle("Login");
        frame1.setResizable(false);
        frame1.setSize(800,600);
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setIconImage(image.getImage());
        frame1.setLocationRelativeTo(null);

        ID = new JTextField();
        ID.setBounds(300, 150, 200,50);
        ID.setPreferredSize(new Dimension(200,50));
        ID.setText("ID");

        Password = new JTextField();
        Password.setBounds(300, 225, 200,50);
        Password.setText("Password");

        submit = new JButton();
        submit.setBounds(300, 375, 200,50);
        submit.addActionListener(this);
        submit.setText("submit");
        submit.setFocusable(false);

        background.add(ID);
        background.add(Password);
        background.add(submit);
        frame1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            System.out.println("save details");
        }
    }
}