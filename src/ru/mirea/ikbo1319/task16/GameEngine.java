package ru.mirea.ikbo1319.task16;

import java.util.ArrayDeque;
import java.util.Scanner;

public class GameEngine {
    private final ArrayDeque<Integer> handOne;
    private final ArrayDeque<Integer> handTwo;
    private int turnCounter = 0;

    public GameEngine() {
        handOne = new ArrayDeque<>(5);
        handTwo = new ArrayDeque<>(5);
    }

    public void start() {
        getCards();
        play();
    }

    private void getCards() {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String[] firstCards = first.split(" ");
        String second = scanner.nextLine();
        String[] secondCards = second.split(" ");

        for (String card : firstCards) {
            handOne.add(Integer.parseInt(card));
        }
        for (String card : secondCards) {
            handTwo.add(Integer.parseInt(card));
        }
    }

    private void play() {
        while (true) {
            if (turnCounter == 106) {
                System.out.println("botva");
                break;
            }

            if (handOne.isEmpty()) {
                System.out.println("second " + turnCounter);
                break;
            }

            if (handTwo.isEmpty()) {
                System.out.println("first " + turnCounter);
                break;
            }

            int first = handOne.pop();
            int second = handTwo.pop();
            if (first > second) {
                if (first == 9 & second == 0) {
                    handTwo.add(first);
                    handTwo.add(second);
                }else {
                    handOne.add(first);
                    handOne.add(second);
                }
            } else {
                if (first == 0 & second == 9) {
                    handOne.add(first);
                    handOne.add(second);
                }else {
                    handTwo.add(first);
                    handTwo.add(second);
                }
            }
            turnCounter++;
        }
    }
}
