package com.vertex.service.impl;

import com.vertex.model.LendingBooks;
import com.vertex.service.BookLendingService;
import com.vertex.util.DBConnection;

import java.sql.*;

public class BookLendingServiceImpl implements BookLendingService {

    private final Connection connection;
    public BookLendingServiceImpl() {
        connection = DBConnection.getInstance().getConnection();
    }

    @Override
    public void addNewLend(LendingBooks book) {
        try {
            String query = "update book set availability=? where isbn=?";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1,book.getAvailability());
            pst.setLong(2,book.getISBN());
            int count = pst.executeUpdate();
            if(count!=0){
                System.out.println("Employee details updated successfully.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
  }

    @Override
    public void showAvailability(LendingBooks book) {
        try {
            String query = "select availability from book where id = "+book.getISBN();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                        result.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
