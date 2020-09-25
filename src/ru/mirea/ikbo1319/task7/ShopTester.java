package ru.mirea.ikbo1319.task7;

public class ShopTester {
    public static void main(String[] args) {
        Person customer = new Person(1000, "Bob");
        FurnitureShop shop = new FurnitureShop();

        Bookshelf bookshelf = new Bookshelf(100, 500, 100, 50);
        Table table = new Table(300, 150, 700, 10);
        Chair chairOne = new Chair(50, 70, 30, true);
        Chair chairTwo = new Chair(30, 80, 40, false);

        shop.addItem(bookshelf, 300);
        shop.addItem(table, 400);
        shop.addItem(chairOne, 200);
        shop.addItem(chairTwo, 100);

        shop.showItems();

        customer.addProduct(shop, 1);
        customer.addProduct(shop, 3);

        System.out.println();

        shop.showItems();

        System.out.println();
        System.out.println(customer.getBalance());
    }
}
