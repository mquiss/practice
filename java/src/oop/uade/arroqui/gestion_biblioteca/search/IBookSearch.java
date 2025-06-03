package oop.uade.arroqui.gestion_biblioteca.search;

import oop.uade.arroqui.gestion_biblioteca.model.Book;

import java.util.List;

public interface IBookSearch {
    List<Book> search(List<Book> bookList);
}
