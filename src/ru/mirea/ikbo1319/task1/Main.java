package ru.mirea.ikbo1319.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        func3();
        func4(args);
        func5();
        func6();
        func7();
    }

    public static void func3(){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Введите 10 целых чисел: ");

        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i : array){
            sum += i;
        }

        System.out.println("Сумма элементов массива, посчитанная в цикле for: " + sum);
        sum = 0;

        int counter = 0;
        while(counter < array.length){
            sum += array[counter];
            counter++;
        }

        System.out.println("Сумма элементов массива, посчитанная в цикле while: " + sum);
        sum = 0;

        counter = 0;
        do {
            sum += array[counter];
            counter++;
        }while (counter < array.length);

        System.out.println("Сумма элементов массива, посчитанная в цикле do while: " + sum);
        System.out.println();
    }

    public static void func4(String[] args) {
        for (String arg : args){
            System.out.println(arg);
        }
        System.out.println();
    }

    public static void func5(){
        for (int i = 1; i < 11; i++){
            System.out.printf("%.4f", 1.f / i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public  static void func6(){
        int[] array = new int[10];

        Random generator = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = generator.nextInt(11);
        }

        System.out.println("Массив полученный с помощью класса Random:");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Массив полученный с помощью класса Random, после сортировки:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Массив полученный с помощью класса Math:");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Массив полученный с помощью класса Math, после сортировки:");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void func7(){
        Random random = new Random();
        int n = random.nextInt(13);
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println("Факториал для числа " + n + ": " + result);
    }
}
