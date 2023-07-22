package com.vertex.model;
public class LendingBooks {
    private String book;
    private long ISBN;
    private int availability;

    public LendingBooks() {
    }

    public LendingBooks(String book, long ISBN, int availability) {
        this.book = book;
        this.ISBN = ISBN;
        this.availability = availability;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public double getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "LendingBooks{" +
                "book='" + book + '\'' +
                ", ISBN=" + ISBN +
                ", availability=" + availability +
                '}';
    }


}
