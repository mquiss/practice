package oop.uade.arroqui.gestion_biblioteca.model;

import java.time.LocalDate;

public class BookLoan {
    private User user;
    private Book book;
    private int loanDays;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public BookLoan(User user, Book book, int loanDays) {
        this.loanDays = loanDays;
        this.loanDate = LocalDate.now();
        this.returnDate = loanDate.plusDays(loanDays);
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public int getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(int loanDays) {
        this.loanDays = loanDays;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
