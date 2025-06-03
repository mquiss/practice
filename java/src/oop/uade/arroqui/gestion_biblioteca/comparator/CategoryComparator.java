package oop.uade.arroqui.gestion_biblioteca.comparator;

import oop.uade.arroqui.gestion_biblioteca.model.Book;

import java.util.Comparator;

public class CategoryComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getCategory().compareTo(o2.getCategory());
    }
}
