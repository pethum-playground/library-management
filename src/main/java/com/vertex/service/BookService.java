package com.vertex.service;

import com.vertex.model.Book;

import java.util.ArrayList;

public interface BookService {
     int addBook(Book book);
    Book showBook(long id);
    //show all employee
    ArrayList<Book> showAllBooks();
    //show employee based on id
    ArrayList<Book> showAvailableBooks();
    //update employee
    int updateBook(long id, Book book);
    //delete employee
    Book deleteBook(long id);
}
