package ru.mirea.ikbo1319.task6;

import ru.mirea.ikbo1319.task5.Circle;

public class MovableCircle extends Circle implements Movable {
    private double x;
    private double y;

    public MovableCircle(double x, double y, double radius, boolean visible){
        super(radius, visible);
        this.x = x;
        this.y = y;
    }

    @Override
    public void movUp() {
        y++;
    }

    @Override
    public void movDown() {
        y--;
    }

    @Override
    public void movLeft() {
        x--;
    }

    @Override
    public void movRight() {
        x++;
    }

    @Override
    public void movUp(double destination) {
        y += destination;
    }

    @Override
    public void movDown(double destination) {
        y -= destination;
    }

    @Override
    public void movLeft(double destination) {
        x -= destination;
    }

    @Override
    public void movRight(double destination) {
        x += destination;
    }

    @Override
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + getRadius() +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
