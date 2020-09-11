package ru.mirea.ikbo1319.task2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int intoHumanAge(){
        return age * 7;
    }

    public String toString(){
        return "The name of a dog: " + name + ", age of a dog: " + age;
    }
}
