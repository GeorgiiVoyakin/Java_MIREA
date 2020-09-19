package ru.mirea.ikbo1319.task5;

public class Square extends Shape {
    private double a;

    public Square(){
        a = 1;
    }

    public Square(double a){
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea(){
        return a * a;
    }

    public double getPerimeter(){
        return 4 * a;
    }
}
