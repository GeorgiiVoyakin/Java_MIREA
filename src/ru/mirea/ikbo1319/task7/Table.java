package ru.mirea.ikbo1319.task7;

public class Table extends Furniture {
    private double numberOfPersons;

    public Table(double width, double height, double length, double numberOfPersons) {
        super(width, height, length);
        this.numberOfPersons = numberOfPersons;
    }

    public double getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(double numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    @Override
    public String toString() {
        return "Table{" +
                "numberOfPersons=" + numberOfPersons +
                '}';
    }
}
