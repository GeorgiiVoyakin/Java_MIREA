package ru.mirea.ikbo1319.task21;

public class Exception1 {
    public static void main(String[] args) {
        exceptionDemo();
    }

    private static void exceptionDemo() {
        // int a = 2 / 0;
        double a = 2.0 / 0.0; // в переменной будет значение Infinity
    }
}
