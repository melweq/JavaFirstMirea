package ru.mirea.task16;


import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.WindowEvent;

public class num1 {
    public static void main(String[] args) {
        new GuessGame();
    }
}

class GuessGame extends JFrame {
    JTextField inputField = new JTextField(10);
    JButton guessButton = new JButton("Guess");
    int triesCount = 0;


    GuessGame() {
        super("Menu");
        setLayout(new FlowLayout());
        setSize(250, 150);

        int correctNumber = (int) (Math.random() * 20);
        JFrame obj = this;
        guessButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    int x = Integer.parseInt(inputField.getText().trim());
                    if (x == correctNumber) {
                        JOptionPane.showMessageDialog(null, "Your guess is correct", "Win", JOptionPane.INFORMATION_MESSAGE);
                        dispatchEvent(new WindowEvent(obj, WindowEvent.WINDOW_CLOSING));
                    } else {
                        JOptionPane.showMessageDialog(null, "Your guess is incorrect", "Win", JOptionPane.INFORMATION_MESSAGE);
                        triesCount++;
                    }
                    if (triesCount >= 3) {
                        JOptionPane.showMessageDialog(null, "You don't have any tries left", "Win", JOptionPane.INFORMATION_MESSAGE);
                        dispatchEvent(new WindowEvent(obj, WindowEvent.WINDOW_CLOSING));
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Incorrect input", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(inputField);
        add(guessButton);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
