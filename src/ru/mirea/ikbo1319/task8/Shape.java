package ru.mirea.ikbo1319.task8;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    private final Color color;
    private final int xPosition;
    private final int yPosition;

    @Override
    protected abstract void paintComponent(Graphics g);

    public Shape(Color color, int xPosition, int yPosition) {
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public Shape() {
        color = Color.black;
        xPosition = 0;
        yPosition = 0;
    }

    public Color getColor() {
        return color;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }
}
