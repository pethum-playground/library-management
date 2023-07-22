package com.vertex.service;

import com.vertex.model.Book;

import java.util.ArrayList;

public interface BookService {
     int addBook(Book book);
    //show all employee
    ArrayList<Book> showAllBooks();
    //show employee based on id
    ArrayList<Book> showAvailableBooks();
    //update employee
     void updateBook(int id);
    //delete employee
     void deleteBook(int id);
}
