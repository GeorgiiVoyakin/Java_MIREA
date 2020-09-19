package ru.mirea.ikbo1319.task5;

public abstract class Shape {
    private boolean visible;

    public Shape(boolean visible){
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }
}
