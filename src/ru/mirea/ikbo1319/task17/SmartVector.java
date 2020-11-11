package ru.mirea.ikbo1319.task17;

import java.util.Random;

public class SmartVector extends Vector{
    public SmartVector(double x, double y) {
        super(x, y);
    }

    public SmartVector() {
        Random generator = new Random();
        double angle = Math.random() > 0.5 ? Math.toRadians(generator.nextInt(121) - 60) : Math.toRadians(generator.nextInt(121) + 120);
        setX(12 * Math.cos(angle));
        setY(12 * Math.sin(angle));
    }
}
