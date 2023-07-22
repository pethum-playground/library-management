package com.vertex.model;

public class Book {
    private long book_id;
    private String title;
    private String category;
    private String author;
    private boolean availability;

    public Book(){

    }

    public Book(String title, String category, String author) {
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public Book(int book_id, String title, String category, String author) {
        this.book_id = book_id;
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public Book(String title, String category, String author, boolean availability) {
        this.title = title;
        this.category = category;
        this.author = author;
        this.availability = availability;
    }

    public Book(int book_id, String title, String category, String author, boolean availability) {
        this.book_id = book_id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.availability = availability;
    }

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", availability=" + availability +
                "}\n";
    }
}

