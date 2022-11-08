package ru.mirea.task5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Picture {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600,600));
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(args[0]));
        }catch(Exception e){
            System.out.println(e);
        }
        if(image!=null) {
            JLabel picLabel = new JLabel(new ImageIcon(image));

            frame.getContentPane().add(picLabel);
            frame.pack();
        }
        frame.setVisible(true);
    }
}