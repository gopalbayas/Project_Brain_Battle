package myprojectQuize ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname ;

    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon22/Login2.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 550);
        add(image);

        JLabel heading = new JLabel("Brain  Battle");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter your Name :");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Bait", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 35);
        tfname.setFont(new Font("Arial", Font.PLAIN, 15));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1200, 500);
        setLocation(60, 90);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rules) {
            String name = tfname.getText();
          setVisible(false);
          new Rules(name) ;
        } else if(e.getSource()== back) {
            setVisible(false);
        }
    }
}

