package com.vertex.service;

import com.vertex.model.Book;

import java.util.ArrayList;

public interface BookService {
     int addBook(Book book);
    Book showBook(long id);
    ArrayList<Book> showAllBooks();
    ArrayList<Book> showAvailableBooks();
    int updateBook(long id, Book book);
    Book deleteBook(long id);
}
