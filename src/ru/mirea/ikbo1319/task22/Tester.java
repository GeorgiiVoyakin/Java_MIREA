package ru.mirea.ikbo1319.task22;

import java.util.HashMap;

public class Tester {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(10000, "Иванов Иван Иванович");
        Shop shop = new Shop();

        HashMap<String, String> INNs = new HashMap<>();
        INNs.put(customer.getName(), customer.getINN());

        Item item1 = new Item("чайник", 100);
        Item item2 = new Item("телефон", 8000);
        Item item3 = new Item("лампа", 40);
        Item item4 = new Item("чайник", 200);

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);
        shop.addItem(item4);

        shop.setINNs(INNs);

        customer.addProduct(shop, 1);

        shop.makeOrder(customer);

        Customer customer1 = new Customer(100, "name");
        customer1.addProduct(shop, 3);
        shop.makeOrder(customer1);
    }
}
