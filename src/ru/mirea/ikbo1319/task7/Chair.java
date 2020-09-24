package ru.mirea.ikbo1319.task7;

public class Chair extends Furniture {
    private boolean soft;

    public Chair(double width, double height, double length, boolean soft) {
        super(width, height, length);
        this.soft = soft;
    }

    public boolean isSoft() {
        return soft;
    }

    public void setSoft(boolean soft) {
        this.soft = soft;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "soft=" + soft +
                '}';
    }
}
