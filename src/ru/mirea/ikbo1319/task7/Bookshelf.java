package ru.mirea.ikbo1319.task7;

public class Bookshelf extends Furniture {
    private int amountOfBooks;

    public Bookshelf(double width, double height, double length, int amountOfBooks) {
        super(width, height, length);
        this.amountOfBooks = amountOfBooks;
    }

    public int getAmountOfBooks() {
        return amountOfBooks;
    }

    public void setAmountOfBooks(int amountOfBooks) {
        this.amountOfBooks = amountOfBooks;
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "amountOfBooks=" + amountOfBooks +
                '}';
    }
}
