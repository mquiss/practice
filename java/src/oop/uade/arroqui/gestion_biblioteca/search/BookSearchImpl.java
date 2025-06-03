package oop.uade.arroqui.gestion_biblioteca.search;

import oop.uade.arroqui.gestion_biblioteca.model.Book;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BookSearchImpl implements IBookSearch {
    public abstract boolean compare(Book book);

    @Override
    public List<Book> search(List<Book> bookList) {
        return bookList.stream()
                .filter(this::compare) // se queda con los libros que compara
                .collect(Collectors.toList()); //convierte el stream a una List
    }
}
