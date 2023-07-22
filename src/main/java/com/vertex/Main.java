package com.vertex;

import com.vertex.util.DBConnection;

import java.sql.Connection;

import com.vertex.model.Book;

import java.util.Scanner;

import com.vertex.model.Book;
import com.vertex.model.LendingBooks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Connection con =  DBConnection.getInstance().getConnection();
        String name;
        int id;
        //EmployeeDaoIntrf dao=new EmployeeDaoImpl();
        System.out.println("Welcome to Library Management System Uok!");
        System.out.println("Please choose an option.");

        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1. Add a new book\n" +
                    "2. Update an existing book\n" +
                    "3. Remove an existing book \n" +
                    "4. Lend a book\n" +
                    "5. Return a book\n" +
                    "6. List all available books\n" +
                    "7. Exit\n");

//            System.out.println("Enter Choice: ");
//            int ch=sc.nextInt();
//            switch (ch){
//                case 1:
//                    Book book=new Book();
//                    System.out.println("Enter ID : ");
//                    id=sc.nextInt();
//                    System.out.println("Enter name ");
//                    name=sc.next();
//                    System.out.println("Enter Salary ");
//                    double salary=sc.nextDouble();
//                    System.out.println("Enter age");
//                    int age=sc.nextInt();
//                    emp.setId(id);
//                    emp.setName(name);
//                    emp.setSalary(salary);
//                    emp.setAge(age);
//                    dao.createEmployee(emp);
//                    break;
//                case 2:
//                    dao.showAllEmployee();
//                    break;
//                case 3:
//                    System.out.println("Enter id to show the details ");
//                    int empid=sc.nextInt();
//                    dao.showEmployeeBasedOnID(empid);
//                    break;
//                case 4:
//                    System.out.println("Enter id to update the details");
//                    int empid1=sc.nextInt();
//                    System.out.println("Enter the new name");
//                    name=sc.next();
//                    dao.updateEmployee(empid1,name);
//                    break;
//                case 5:
//                    System.out.println("Enter the id to delete");
//                    id=sc.nextInt();
//                    dao.deleteEmployee(id);
//                    break;
//
//                case 6:
//                    System.out.println("Thank you for using our Application !!!");
//                    System.exit(0);
//                default:
//                    System.out.println("Enter valid choice !");
//                    break;
//
//            }
        }while (true);



    }
}
