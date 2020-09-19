package ru.mirea.ikbo1319.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circleOne = new Circle(20);
        Circle circleTwo = new Circle();

        System.out.println("Radius of first circle is " + circleOne.getRadius());
        System.out.println("Square of first circle is " + circleOne.getSquare());
        System.out.println("Square of second circle is " + circleTwo.getSquare());
        circleTwo.setRadius(10);
        System.out.println("Square of second circle with new radius is " + circleTwo.getSquare());
        System.out.println("Perimeter of first circle is " + circleOne.getPerimeter());
        System.out.println("Perimeter of second circle is " + circleTwo.getPerimeter());
    }
}
