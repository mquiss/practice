package oop.uade.arroqui.gestion_biblioteca.search;

import oop.uade.arroqui.gestion_biblioteca.model.Book;

public class SearchByISBN extends BookSearchImpl {
    private final String ISBN;

    public SearchByISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean compare(Book book) {
        return book.getISBN().equalsIgnoreCase(ISBN);
    }
}
