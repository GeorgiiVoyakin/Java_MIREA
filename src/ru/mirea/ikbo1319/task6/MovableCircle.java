package ru.mirea.ikbo1319.task6;

public class MovableCircle extends MovablePoint {
    private double radius;

    public  MovableCircle(){
        super();
        radius = 1.0;
    }

    public MovableCircle(double radius, double x, double y){
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
