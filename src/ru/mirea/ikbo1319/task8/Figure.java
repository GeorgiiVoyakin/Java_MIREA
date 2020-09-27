package ru.mirea.ikbo1319.task8;

import javax.swing.*;
import java.awt.*;

public class Figure extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] x_points = { 1, 3 , 60};
        int[] y_points = { 3, 40, 20};
        g.drawPolygon(x_points, y_points, 3);
    }
}
