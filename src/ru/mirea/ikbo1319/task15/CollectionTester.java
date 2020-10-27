package ru.mirea.ikbo1319.task15;

public class CollectionTester {
    public static void main(String[] args) {
        IntegerCollection numbers = new IntegerCollection(3);
        System.out.println("Before adding elements: " + numbers.toString());
        for (int i = 0; i < numbers.getCapacity(); i++) {
            numbers.add(i);
        }
        System.out.println("after adding elements: " + numbers.toString());

        System.out.println("Max value is " + numbers.getMax());
        System.out.println("Min value is " + numbers.getMin());
        System.out.println("average value is " + numbers.getAverage());

        System.out.println("Index of 1 is " + numbers.indexOf(1));
        System.out.println("Element at 2 index is " + numbers.get(2));

        numbers.remove(0);
        System.out.println(numbers.toString());
        numbers.show();

        numbers.add(-100);
        numbers.add(3);
        System.out.println(numbers.toString());
        numbers.show();

        numbers.remove(2);
        numbers.show();
    }
}
