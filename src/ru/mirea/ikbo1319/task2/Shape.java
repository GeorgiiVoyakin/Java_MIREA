package ru.mirea.ikbo1319.task2;

public class Shape {
    protected String name;

    public Shape(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "This is a " + name;
    }
}
