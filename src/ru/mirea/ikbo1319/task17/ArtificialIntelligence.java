package ru.mirea.ikbo1319.task17;

public class ArtificialIntelligence {
    private double y;
    public String getDirection(double y) {
        if (getY() < y) {
            return "DOWN";
        }else {
            return "UP";
        }
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
