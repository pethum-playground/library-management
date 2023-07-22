package com.vertex.model;

public class Book {
    private int book_id;
    private String title;
    private String category;
    private String author;

    public Book(){

    }
    public Book(int book_id, String title, String category, String author) {
        this.book_id = book_id;
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
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
}

