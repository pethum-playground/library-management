package com.vertex;

import com.vertex.util.DBConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
       Connection con =  DBConnection.getInstance().getConnection();
    }
}
