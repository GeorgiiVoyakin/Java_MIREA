package ru.mirea.ikbo1319.task18;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int max = Integer.parseInt(line);
        while (!line.equals("0")) {
            line = scanner.nextLine();
            if (max < Integer.parseInt(line)) {
                max = Integer.parseInt(line);
            }
        }
        System.out.println(max);
    }
}
