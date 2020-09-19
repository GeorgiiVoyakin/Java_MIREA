package ru.mirea.ikbo1319.task5;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height, boolean visible){
        super(visible);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter(){
        return 2 * width + 2 * height;
    }
}
