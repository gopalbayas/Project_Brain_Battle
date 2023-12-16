package myprojectQuize;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



public class Rules  extends JFrame  implements  ActionListener{
    String name ;
    JButton start ,back ;

    Rules(String name){
        this.name = name ;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Welcome "+ name +" to  Brain Battle ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Times new Roman", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel("Welcome "+ name +" to  Brain Battle ");
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+
                        "1. Brain Battle consists of 10 questions in total" + "<br><br>" +
                        "2. Where 2 questions are designed to test your Math aptitude, and the remaining 8 are focused on JAVA." + "<br><br>" +
                        "3. Each question presents you with 4 options." + "<br><br>" +
                        "4. You'll have a time limit of 15 seconds to answer each question." + "<br><br>" +
                        "5. Once the time elapses, you will be automatically redirected to the next question." + "<br><br>" +
                        "6. Introducing a special feature called LifeLine. You can use it only once during the entire exam." + "<br><br>" +
                        "7. Upon using the LifeLine, two incorrect options will be disabled automatically." + "<br><br>" +
                        "8. Enjoy the Test and best wishes to Win the Battle" + "<br><br>" +
                        "<html>"
        );
        add(rules);


        back = new JButton("Back");
        back.setBounds(400,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this::actionPerformed);
        add(back);

         start = new JButton("Start");
         start.setBounds(250,500,100,30);
         start.setBackground(new Color(30,144,254));
         start.setForeground(Color.WHITE);
         start.addActionListener(this::actionPerformed);
         add(start);


        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

  public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
             new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
  }



    public static void main(String[] args) {
        new Rules("User");
    }
}
