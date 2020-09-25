package ru.mirea.ikbo1319.task7;

import java.util.HashMap;

public class FurnitureShop {
    private HashMap<Furniture, Double> items;
    private HashMap<Integer, Furniture> idOfItems;
    private int currentId;

    public FurnitureShop(){
        items = new HashMap<>();
        idOfItems = new HashMap<>();
        currentId = 0;
    }

    public void addItem(Furniture furniture, double price){
        items.put(furniture, price);
        idOfItems.put(++currentId, furniture);
    }

    public Furniture removeItem(int id){
        items.remove(idOfItems.get(id), getPrice(id));
        return idOfItems.remove(id);
    }

    public double getPrice(int id){
        return items.get(idOfItems.get(id));
    }

    public void showItems(){
        for(int id : idOfItems.keySet()){
            System.out.println("ID: " + id + " Description: " + idOfItems.get(id).toString() + " Price: " + getPrice(id));
        }
    }
}
