package ru.mirea.ikbo1319.task8;

import java.awt.*;

public class Circle extends Shape {
    private final int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public Circle() {
        radius = 5;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawOval(getXPosition() - radius, getYPosition() - radius, 2 * radius, 2 * radius);
        g.drawRect(0, 0, 800, 600);
        g.drawLine(0, 0, 800, 600);
    }

    public int getRadius() {
        return radius;
    }
}
