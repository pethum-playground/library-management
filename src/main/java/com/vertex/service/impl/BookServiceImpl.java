package com.vertex.service.impl;

import com.vertex.model.Book;
import com.vertex.service.BookService;
import com.vertex.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class BookServiceImpl implements BookService {
    Connection connection;

    public BookServiceImpl() {
        connection = DBConnection.getInstance().getConnection();
    }

    @Override
    public int addBook(Book book) {
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO book (isbn, title, category, author) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, (int) book.getBook_id());
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getCategory());
            ps.setString(4, book.getAuthor());
            ps.setBoolean(5, book.isAvailability());

            return ps.executeUpdate();

        } catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    @Override
    public ArrayList<Book> showAllBooks() {
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM book");

            return getBooks(rs);

        } catch (SQLException ex){
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public ArrayList<Book> showAvailableBooks() {
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM book WHERE availability = 1");

            return getBooks(rs);

        } catch (SQLException ex){
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public void updateBook(int id) {

    }

    @Override
    public void deleteBook(int id) {

    }

    private ArrayList<Book> getBooks(ResultSet rs) throws SQLException{
        ArrayList<Book> books = new ArrayList<>();
        while (rs.next()){
            books.add(new Book(rs.getInt("isbn"), rs.getString("title"), rs.getString("category"), rs.getString("author"), rs.getBoolean("availability")));
        }
        return books;
    }
}
