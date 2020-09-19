package ru.mirea.ikbo1319.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human first = new Human();
        System.out.println(first.getHandsLength());
        System.out.println(first.getLegsLength());
        first.setHandsLength(45);
        first.setLegsLength(64);
        System.out.println(first.getHandsLength());
        System.out.println(first.getLegsLength());
        System.out.println(first.getHairColor());
        first.setHairColor("blonde");
        System.out.println(first.getHairColor());
    }
}
