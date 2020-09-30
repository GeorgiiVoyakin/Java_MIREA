package ru.mirea.ikbo1319.task8;

import javafx.scene.paint.Color;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(int x, int y, Color color, double width, double height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public javafx.scene.shape.Rectangle getEntity() {
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle();
        rectangle.setX(getX());
        rectangle.setY(getY());
        rectangle.setWidth(getWidth());
        rectangle.setHeight(getHeight());
        rectangle.setFill(getColor());
        return rectangle;
    }
}
