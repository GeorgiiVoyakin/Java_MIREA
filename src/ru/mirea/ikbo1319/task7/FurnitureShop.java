package ru.mirea.ikbo1319.task7;

import java.util.HashMap;

public class FurnitureShop {
    private HashMap<Furniture, Double> items;

    public FurnitureShop(){
        items = new HashMap<>();
    }

    public void addItem(Furniture furniture, double price){
        items.put(furniture, price);
    }

    public double getPrice(Furniture furniture){
        return items.get(furniture);
    }
}
