package oop.uade.arroqui.gestion_biblioteca.model;

public class Book {
    private final String ISBN;
    private String title;
    private String author;
    private int publishYear;
    private String category;

    public Book(String ISBN, String title, String author, int publishYear, String category) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.category = category;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                ", category='" + category + '\'' +
                '}';
    }
}
