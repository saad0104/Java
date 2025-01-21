import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class lambda_ActionListener extends JFrame {

    JButton myButton = new JButton("My Button1");
    JButton myButton2 = new JButton("My Button2");

    lambda_ActionListener() {

        myButton.setBounds(150, 100, 100, 100);
        myButton2.setBounds(150, 220, 100, 100);

        // Normal
        // myButton.addActionListener(new ActionListener()
        // {
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // System.out.println("Button Clicked");
        // }

        // });

        // Lambda
        myButton.addActionListener(
                (e) -> {
                    System.out.println("1st Button Clicked");

                });

        myButton2.addActionListener(
                (e) -> {
                    System.out.println("2nd Button Clicked");

                });

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }

}