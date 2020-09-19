package ru.mirea.ikbo1319.task3;

public class Circle {
    private double radius;

    public  Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getSquare(){
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
