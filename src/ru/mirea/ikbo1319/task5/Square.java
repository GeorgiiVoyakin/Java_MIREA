package ru.mirea.ikbo1319.task5;

public class Square extends Shape {
    private double side;

    public Square(double side, boolean visible){
        super(visible);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return 4 * side;
    }
}
