package ru.mirea.ikbo1319.task8;

public class Triangle  {
    private final int x2Position;
    private final int y2Position;
    private final int x3Position;
    private final int y3Position;

    public Triangle(int x2Position, int y2Position, int x3Position, int y3Position) {
        this.x2Position = x2Position;
        this.y2Position = y2Position;
        this.x3Position = x3Position;
        this.y3Position = y3Position;
    }

    public int getX2Position() {
        return x2Position;
    }

    public int getY2Position() {
        return y2Position;
    }

    public int getX3Position() {
        return x3Position;
    }

    public int getY3Position() {
        return y3Position;
    }
}
