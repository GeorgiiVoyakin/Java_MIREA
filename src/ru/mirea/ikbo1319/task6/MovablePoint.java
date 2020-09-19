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
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
