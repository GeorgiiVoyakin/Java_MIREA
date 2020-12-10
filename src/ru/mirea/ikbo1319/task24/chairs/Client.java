package ru.mirea.ikbo1319.task24.chairs;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void sit(Chair chair) {
        System.out.println(name + " is sitting on " + chair.getType());
    }
}
