import java.awt.Color;

import javax.swing.*;

public class Main{

    public static void main(String[] args) {

        JFrame frame = new JFrame("sadat", null);
        frame.setSize(600, 600);
        frame.setVisible(true);
        //frame.setBackground(Color.BLUE);
        frame.getContentPane().setBackground(Color.CYAN);

        JLabel text = new JLabel();
        text.setText("hellooooo");
        frame.add(text);
        JButton button = new JButton();
        button.setBounds(50, 50, 50, 50);
        frame.add(button);

    }
}
