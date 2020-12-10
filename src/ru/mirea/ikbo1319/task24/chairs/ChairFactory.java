package ru.mirea.ikbo1319.task24.chairs;

public class ChairFactory {
    public Chair produceVictorianChair() {
        return new VictorianChair();
    }

    public Chair produceMultifunctionalChair() {
        return new MultifunctionalChair();
    }

    public Chair produceMagicChair() {
        return new MagicChair();
    }
}
