package ru.mirea.ikbo1319.task3;

public class Book {
    private String title;
    private String author;
    private int publicationDate;

    public Book(String title, String author, int publicationDate){
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setPublicationDate(int publicationDate){
        this.publicationDate = publicationDate;
    }

    public int getPublicationDate(){
        return publicationDate;
    }
}
