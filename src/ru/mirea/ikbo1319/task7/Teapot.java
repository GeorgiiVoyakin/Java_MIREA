package ru.mirea.ikbo1319.task7;

public class Teapot extends Furniture {
    private double temperature;
    private String color;
    private boolean empty;

    public Teapot(double width, double height, double length, double temperature, String color, boolean empty) {
        super(width, height, length);
        this.temperature = temperature;
        this.color = color;
        this.empty = empty;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "temperature=" + temperature +
                ", color='" + color + '\'' +
                ", empty=" + empty +
                '}';
    }
}
