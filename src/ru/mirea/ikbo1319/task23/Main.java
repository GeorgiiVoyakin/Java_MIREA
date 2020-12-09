package ru.mirea.ikbo1319.task23;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("<------ 1 ------>");
        String[] strings = { "lol", "kek", "cheburek" };
        List<String> stringList = arrayToList(strings);

        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println("<------ 2 ------>");
        UniversalArray<String> arrayStrings = new UniversalArray<>(strings);
        Integer[] integers = { 1, 2, 3, 4 };
        UniversalArray<Integer> arrayIntegers = new UniversalArray<>(integers);

        System.out.print("UniversalArray of Strings: ");
        for (int i = 0; i < arrayStrings.getData().length; i++) {
            System.out.print(arrayStrings.get(i) + " ");
        }

        System.out.println();

        System.out.print("UniversalArray of Integers: ");
        for (int i = 0; i < arrayIntegers.getData().length; i++) {
            System.out.print(arrayIntegers.get(i) + " ");
        }
        System.out.println();

        System.out.println("<------ 3 ------>");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь: ");
        String path = scanner.nextLine();
        getListOfFiles(path);
    }

    // метод для конвертации массива в список
    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }

    // метод записывает названия 5 файлов в директории в массив и выводит их на экран
    public static void getListOfFiles(String path) throws Exception {
        File directory = new File(path);

        if (directory.isFile()) {
            throw new Exception("Invalid input");
        }

        File[] files = directory.listFiles();

        assert files != null;
        if (files.length < 5) {
            throw new Exception("Less than 5 files in directory");
        }

        int counter = 0;
        for (File file : files) {
            System.out.println(file.getName());
            if (++counter == 5) {
                break;
            }
        }
    }
}
