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

    public javafx.scene.shape.Circle getEntity(){
        javafx.scene.shape.Circle circle = new javafx.scene.shape.Circle();
        circle.setCenterX(getX());
        circle.setCenterY(getY());
        circle.setRadius(getRadius());
        circle.setFill(getColor());
        return circle;
    }
}
