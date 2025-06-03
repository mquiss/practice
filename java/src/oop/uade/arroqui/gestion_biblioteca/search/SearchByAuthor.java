package oop.uade.arroqui.gestion_biblioteca.search;

import oop.uade.arroqui.gestion_biblioteca.model.Book;

public class SearchByAuthor extends BookSearchImpl{
    private String author;

    public SearchByAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean compare(Book book) {
        return book.getAuthor().toLowerCase().compareTo(author.toLowerCase()) == 0;
    } // no podria hacerlo con book.getAuthor.equalsIgnoreCase(author) ?
}
