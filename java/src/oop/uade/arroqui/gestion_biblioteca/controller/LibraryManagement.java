package oop.uade.arroqui.gestion_biblioteca.controller;

import oop.uade.arroqui.gestion_biblioteca.model.Book;
import oop.uade.arroqui.gestion_biblioteca.search.IBookSearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManagement {
    private List<Book> bookList;

    public LibraryManagement() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public List<Book> search(IBookSearch searchBy) {
        return searchBy.search(bookList);
    }

    public List<Book> sort(Comparator<Book> comparator) {
        return bookList.stream().sorted(comparator).collect(Collectors.toList());
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
