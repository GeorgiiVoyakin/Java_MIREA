package ru.mirea.ikbo1319.task6;

public interface Movable {
    void movUp();
    void movDown();
    void movLeft();
    void movRight();

    void movUp(double destination);
    void movDown(double destination);
    void movLeft(double destination);
    void movRight(double destination);

    void move(double x, double y);
}
