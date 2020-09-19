package ru.mirea.ikbo1319.task5;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, boolean visible){
        super(visible);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
