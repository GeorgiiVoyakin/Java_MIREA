package ru.mirea.ikbo1319.task7;

import java.util.ArrayList;

public class Furniture {
    private double width;
    private double height;
    private double length;

    public Furniture(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
