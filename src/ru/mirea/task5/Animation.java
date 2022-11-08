package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Animation extends Canvas {
    private int num=0;

    public void nextFrame(){
        num=(num+1)%11;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        System.out.println(num);
        super.paint(g);
        g.setColor(Color.red);
        if(num==5)
            g.fillOval(173,150-25*Math.abs(num-5), 55, 25);
        else
            g.fillOval(175,150-25*Math.abs(num-5), 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,400));
        JPanel panel = new JPanel(new GridLayout(2, 1));
        JButton button = new JButton("Next frame");


        Animation animation = new Animation();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                animation.nextFrame();
            }
        });

        frame.getContentPane().add(panel);
        panel.add(animation);
        panel.add(button);


        frame.pack();
        frame.setVisible(true);
    }
}