package ru.mirea.ikbo1319.task3;

public class BookTest {
    public static void main(String[] args) {
        Book WarAndPeace = new Book("Война и мир", "Лев Толстой", 2020);
        Book Oblomov = new Book("Обломов", "Иван Гончаров", 1859);
        System.out.println(Oblomov.getAuthor());
        System.out.println(Oblomov.getTitle());
        System.out.println(Oblomov.getPublicationDate());
        WarAndPeace.setPublicationDate(1867);
        System.out.println(WarAndPeace.getPublicationDate());
    }
}
