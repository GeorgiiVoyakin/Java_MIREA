package ru.mirea.ikbo1319.task8;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Triangle extends Shape{
    private final int x2Position;
    private final int y2Position;
    private final int x3Position;
    private final int y3Position;

    public Triangle(int x, int y, Color color, int x2Position, int y2Position, int x3Position, int y3Position) {
        super(x, y, color);
        this.x2Position = x2Position;
        this.y2Position = y2Position;
        this.x3Position = x3Position;
        this.y3Position = y3Position;
    }

    public int getX2Position() {
        return x2Position;
    }

    public int getY2Position() {
        return y2Position;
    }

    public int getX3Position() {
        return x3Position;
    }

    public int getY3Position() {
        return y3Position;
    }

    @Override
    public Polygon getEntity() {
        Polygon polygon = new Polygon();
        double[] vertex = {getX(), getY(), getX2Position(), getY2Position(), getX3Position(), getY3Position()};
        polygon.getPoints().addAll(vertex[0], vertex[1], vertex[2], vertex[3], vertex[4], vertex[5]);
        polygon.setFill(getColor());
        return polygon;
    }
}
