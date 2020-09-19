package ru.mirea.ikbo1319.task6;

import ru.mirea.ikbo1319.task5.Rectangle;

public class MovableRectangle extends Rectangle implements Movable {
    private double x;
    private double y;

    public MovableRectangle(double x, double y, double width, double height, boolean visible){
        super(width, height, visible);
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
}
