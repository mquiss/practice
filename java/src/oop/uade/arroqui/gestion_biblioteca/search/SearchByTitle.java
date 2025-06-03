package oop.uade.arroqui.gestion_biblioteca.search;

import oop.uade.arroqui.gestion_biblioteca.model.Book;

public class SearchByTitle extends BookSearchImpl {
    private String title;

    public SearchByTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean compare(Book book) {
        return book.getTitle().toLowerCase().compareTo(title.toLowerCase()) == 0;
    }
}
