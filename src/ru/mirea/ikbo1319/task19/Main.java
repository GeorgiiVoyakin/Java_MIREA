package ru.mirea.ikbo1319.task19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File file = new File(".\\src\\ru\\mirea\\ikbo1319\\task19\\text.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        fw.write(scanner.nextLine());

        fw.close();
    }
}
