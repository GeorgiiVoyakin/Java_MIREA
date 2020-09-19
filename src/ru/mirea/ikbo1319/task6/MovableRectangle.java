package ru.mirea.ikbo1319.task6;

public class MovableRectangle extends MovablePoint{
    private double width;
    private double height;

    public MovableRectangle(){
        super();
        width = 1;
        height = 1;
    }

    public MovableRectangle(double x, double y, double width, double height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * width + 2 * height;
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
}
