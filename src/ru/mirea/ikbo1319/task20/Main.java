package ru.mirea.ikbo1319.task20;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    private static final String PATH = ".\\src\\ru\\mirea\\ikbo1319\\task20\\WarAndPeace.txt";

    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> words = new HashMap<>();

        File file = new File(PATH);
        file.createNewFile();
        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        parseLine(line, words);
        while (true) {
            try{
                line = scanner.nextLine();
                parseLine(line, words);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(line);
    }

    private static void parseLine(String line, HashMap<String, Integer> words) {
        if (!line.isEmpty()) {
            String[] wordsOfLine = line.split(" ");

            for (String word : wordsOfLine) {
                for (char c : word.toCharArray()) {
                    if (c == 254) {
                        System.out.println("OK");
                    }
                }

                if (words.containsKey(word)) {
                    int tmp = words.get(word);
                    words.put(word, tmp + 1);
                } else {
                    words.put(word, 1);
                }
            }
        }
    }
}
