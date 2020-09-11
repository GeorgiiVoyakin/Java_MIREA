package ru.mirea.ikbo1319.task2;

import java.util.ArrayList;
import java.util.Collections;

public class DogNursery {
    private ArrayList<Dog> Nursery;

    public DogNursery(){
        Nursery = new ArrayList<>();
    }

    public void addDogs(Dog... dogs){
        Collections.addAll(Nursery, dogs);
    }
}
