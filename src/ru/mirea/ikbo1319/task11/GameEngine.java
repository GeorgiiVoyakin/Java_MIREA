package ru.mirea.ikbo1319.task11;

import java.util.Random;

public class GameEngine {
    private int number;
    private int amountOfAttempts;
    private boolean gameOver;
    private boolean victory;

    public GameEngine() {
        startGame();
    }

    public void startGame() {
        gameOver = false;
        victory = false;
        amountOfAttempts = 0;
        Random generator = new Random();
        number = generator.nextInt(21);
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean isVictory() {
        return victory;
    }

    public int compare(int number) {
        if (number > this.number) {
            return 1;
        } else {
            return -1;
        }
    }

    public void makeDecision(int number) {
        System.out.println(this.number);

        if (number == this.number) {
            victory = true;
        }

        amountOfAttempts++;

        if (amountOfAttempts == 3 & number != this.number) {
            gameOver = true;
        }
    }
}
