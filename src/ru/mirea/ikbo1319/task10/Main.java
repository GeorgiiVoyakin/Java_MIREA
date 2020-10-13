package ru.mirea.ikbo1319.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        func1();
        func2();
        func3();
    }

    public static void func1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество цифр и сумму: ");
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(summ(0, 0, k, s));
    }

    public static void func2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a и b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(combinations(a, b));
    }

    public static void func3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();
        printDigits(number);
    }

    public static void printDigits(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            printDigits(number / 10);
            System.out.println(number % 10);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int combinations(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return combinations(a, b - 1) + combinations(a - 1, b - 1);
    }

    public static int summ(int len, int sum, int k, int s) {
        // Базовый случай
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        // Шаг рекурсии / рекурсивное условие
        for (int i = c; i < 10; i++) {
            res += summ(len + 1, sum + i, k, s);
        }
        return res;
    }
}
