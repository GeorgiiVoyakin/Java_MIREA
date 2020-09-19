package ru.mirea.ikbo1319.task6;

public class MovablePoint implements Movable {
    private double x;
    private double y;

    public MovablePoint(){
        x = 0;
        y = 0;
    }

    public MovablePoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void movUp() {
        y += 1;
    }

    @Override
    public void movDown() {
        y -= 1;
    }

    @Override
    public void movLeft() {
        x -= 1;
    }

    @Override
    public void movRight() {
        x += 1;
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
}
