package com.vertex.service.impl;

import com.vertex.service.BookLendingService;
import com.vertex.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookLendingServiceImpl implements BookLendingService {

    private final Connection connection;


    public BookLendingServiceImpl() {
        connection = DBConnection.getInstance().getConnection();
    }

    @Override
    public void addNewLend() {
//        try {
//            String query = "insert into employee values(?,?,?,?)";
//            PreparedStatement pst = connection.prepareStatement(query);
//            pst.setLong(1,book.getISBN());
//            pst.setString(2,book.getTitle());
//            pst.setDouble(3,book.getCategory());
//            pst.setInt(4,book.getAuthor());
//            int conunt = pst.executeUpdate();
//            if(conunt!=0){
//                System.out.println("New Lend inserted Successfully!!!");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
  }

    @Override
    public void showAvailability() {

    }
}
