package ru.mirea.ikbo1319.task8;

import javafx.scene.paint.Color;

public class Circle extends Shape {
    private final int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle() {
        radius = 5;
    }

    public int getRadius() {
        return radius;
    }
}
