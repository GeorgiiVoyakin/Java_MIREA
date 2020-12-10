package ru.mirea.ikbo1319.task24.chairs;

public class Tester {
    public static void main(String[] args) {
        Client clientOne = new Client("Jim");
        Client clientTwo = new Client("Henry");

        ChairFactory factory = new ChairFactory();
        clientOne.sit(factory.produceVictorianChair());
        clientTwo.sit(factory.produceMagicChair());
    }
}
