package oop.constructor.constructor_overloading;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this("Unknown", "Unknown", 0);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
