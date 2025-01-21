import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_Factorial {
    public static void main(String[] args) {
        new A();
    }

}

class A implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JTextField tfieldin = new JTextField();
    JTextField tfieldop = new JTextField();
    JButton bt = new JButton();

    A() {

        label.setBounds(0, 0, 420, 50);
        label.setText("Enter any Integer in the box -");
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        tfieldin.setBounds(100, 100, 200, 50);
        tfieldin.setFont(new Font("MV Boli", Font.PLAIN, 15));

        bt.setBounds(150, 150, 100, 35);
        bt.addActionListener(this);
        bt.setText("SUBMIT");

        tfieldop.setBounds(100, 200, 200, 50);
        tfieldop.setEditable(false);

        frame.add(label);
        frame.add(tfieldin);
        frame.add(tfieldop);
        frame.add(bt);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt) {
            String st = tfieldin.getText();
            long n = Long.parseLong(st);
            // System.out.println(n);
            long fact = 1;
            for (long i = n; i > 0; i--) {
                fact *= i;
            }
            // System.out.println(fact);
            String stop = Long.toString(fact);
            tfieldop.setText(stop);
            tfieldop.setFont(new Font("MV Boli", Font.PLAIN, 15));
        }
    }
}