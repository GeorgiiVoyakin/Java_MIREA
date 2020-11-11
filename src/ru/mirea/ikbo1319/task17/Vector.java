package ru.mirea.ikbo1319.task17;

import java.util.Random;

public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
        Random generator = new Random();
        x = generator.nextDouble();
        y = generator.nextDouble();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void reverse() {
        this.x *= -1;
        this.y *= -1;
    }

    public void reverseX() {
        this.x *= -1;
    }

    public void reverseY() {
        this.y *= -1;
    }
}
