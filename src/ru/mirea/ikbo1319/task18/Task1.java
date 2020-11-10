package ru.mirea.ikbo1319.task18;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    static ArrayList<Integer> factors = new ArrayList<>();

    public static void factorize(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        if (number != 1) {
            factors.add(number);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long startTime = System.nanoTime();
        factorize(number);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("elapsed time: " + duration + " ns");
        System.out.println(factors);
    }
}
