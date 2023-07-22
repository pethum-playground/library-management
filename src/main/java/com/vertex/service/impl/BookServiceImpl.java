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
            ps.setLong(1, book.getBook_id());
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
    public Book showBook(long id) {
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM book WHERE "+id);

            ArrayList<Book> books = getBooks(rs);
            return books.get(0);
        } catch (SQLException ex){
            ex.printStackTrace();
            return new Book();
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
    public int updateBook(long id, Book book) {
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE book SET title = ?, category = ?, author = ? WHERE ?");
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getCategory());
            ps.setString(3, book.getAuthor());
            ps.setLong(4, id);

            return ps.executeUpdate();

        } catch (SQLException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    @Override
    public Book deleteBook(long id) {
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM book WHERE "+id);

            PreparedStatement ps = connection.prepareStatement("DELETE FROM book WHERE ?");
            ps.setLong(1, id);

            ps.executeUpdate();

            ArrayList<Book> books = getBooks(rs);
            return books.get(0);
        } catch (SQLException ex){
            ex.printStackTrace();
            return new Book();
        }
    }

    private ArrayList<Book> getBooks(ResultSet rs) throws SQLException{
        ArrayList<Book> books = new ArrayList<>();
        while (rs.next()){
            books.add(new Book(rs.getInt("isbn"), rs.getString("title"), rs.getString("category"), rs.getString("author"), rs.getBoolean("availability")));
        }
        return books;
    }
}
