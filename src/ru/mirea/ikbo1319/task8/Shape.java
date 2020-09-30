package ru.mirea.ikbo1319.task8;

import javafx.scene.paint.Color;

public abstract class Shape {
    private int x;
    private int y;
    private Color color;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(){
        x = 0;
        y = 0;
        color = Color.BLACK;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public abstract Object getEntity();
}
