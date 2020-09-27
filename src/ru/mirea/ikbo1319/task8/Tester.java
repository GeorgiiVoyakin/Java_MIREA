package ru.mirea.ikbo1319.task8;

import javax.swing.*;
import java.awt.*;

public class Tester extends JFrame {
    final int WIDTH = 800;
    final int HEIGHT = 600;

    public Tester(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds((getToolkit().getScreenSize().width - WIDTH) / 2, (getToolkit().getScreenSize().height - HEIGHT) / 2, WIDTH, HEIGHT);
        Shape circle = new Circle(Color.blue, 800, 600, 10);
        add(circle);
    }

    public static void main(String[] args) {
        new Tester();
    }
}
