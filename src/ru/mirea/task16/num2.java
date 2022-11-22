package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class num2 {
    public static void main(String[] args) {
        new TextEdit();
    }
}

class TextEdit extends JFrame {
    static final String[] colors = { "Blue", "Red", "Black"};
    static final String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};
    JComboBox<String> colorChoose = new JComboBox<>(colors);
    JComboBox<String> fontsChoose = new JComboBox<>(fonts);
    JTextArea textArea = new JTextArea(2, 20);


    TextEdit() {
        super("Menu");
        setLayout(new BorderLayout());
        setSize(300, 200);

        textArea.setFont(Font.decode("Times New Roman"));
        textArea.setSelectedTextColor(Color.BLUE);
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());

        colorChoose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = String.valueOf(colorChoose.getSelectedItem()).toUpperCase();
                try {
                    textArea.setSelectedTextColor((Color)Color.class.getField(color).get(null));
                } catch (IllegalAccessException | NoSuchFieldException ex) {
                    ex.printStackTrace();
                }
            }
        });
        fontsChoose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(Font.decode(String.valueOf(fontsChoose.getSelectedItem())));
            }
        });
        buttonsPanel.add(colorChoose);
        buttonsPanel.add(fontsChoose);
        add(buttonsPanel, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
