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
    public void addNewLend(long id, boolean availability) {
        try {
            String query = "update book set availability=? where isbn=?";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setBoolean(1,availability);
            pst.setLong(2,id);
            int count = pst.executeUpdate();
            if(count!=0){
                System.out.println("Employee details updated successfully.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
  }

    @Override
    public boolean showAvailability(long id) {
        try {
            String query = "select availability from book where isbn = "+id;
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()){

                boolean aBoolean = result.getBoolean(1);
                return aBoolean;
            }
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
