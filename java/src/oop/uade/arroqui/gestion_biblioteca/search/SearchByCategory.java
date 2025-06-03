package oop.uade.arroqui.gestion_biblioteca.search;

import oop.uade.arroqui.gestion_biblioteca.model.Book;

public class SearchByCategory extends BookSearchImpl {
    private String category;

    public SearchByCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean compare(Book book) {
        return book.getCategory().toLowerCase().compareTo(category.toLowerCase()) == 0;
    }
}
