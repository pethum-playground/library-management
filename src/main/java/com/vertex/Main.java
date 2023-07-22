package com.vertex;

import com.vertex.model.Book;

import java.util.Scanner;

import com.vertex.model.Book;
import com.vertex.model.LendingBooks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String name;
//        int id;
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

            System.out.println("Enter Choice: ");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    Book book=new Book();
                    System.out.println("Enter the ISBN : ");
                    long ISBN = sc.nextLong();
                    System.out.println("Enter the title : ");
                    String name=sc.next();
                    System.out.println("Enter the category : ");
                    String category=sc.next();
                    System.out.println("Enter the author : ");
                    String author=sc.next();
                    book.setBook_id((int) ISBN);
                    book.setTitle(name);
                    book.setCategory(category);
                    book.setAuthor(author);
                    break;
                case 2:
                    System.out.println("Enter id to update the details");
                    int empid1=sc.nextInt();
                    System.out.println("Enter the new name");
                    name=sc.next();
                    dao.updateEmployee(empid1,name);
                    break;
                case 3:
                    System.out.println("Enter id to show the details ");
                    int empid=sc.nextInt();
                    dao.showEmployeeBasedOnID(empid);
                    break;
                case 4:
                    LendingBooks lendingBooks = new LendingBooks();

                    Scanner gettingISBN = new Scanner(System.in);
                    Book book = new Book();

                    System.out.println("Lending a book");
                    System.out.println("Enter the ISBN");
                    double isbnForLending = gettingISBN.nextDouble();


                    if (lendingBooks.getAvailability() == 1) {
                        System.out.println("Book is available.");
                    } else {
                        System.out.println("Sorry. Book is unavailable");
                    }

                case 5:
                    //returning book
                    System.out.println("Return a book");
                    System.out.println("Enter the ISBN");

                    double isbnForReturning = gettingISBN.nextDouble();

                    //check whether there is an ISBN number as the user entered
                    System.out.println("Book successfully returned");

                case 6:
                    System.out.println("Thank you for using our Application !!!");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice !");
                    break;

            }
        }while (true);
        System.out.println("came");


    }

}
