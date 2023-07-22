package com.vertex;

import com.vertex.model.Book;

import java.util.ArrayList;
import java.util.Scanner;

import com.vertex.model.Book;
import com.vertex.model.LendingBooks;
import com.vertex.service.BookLendingService;
import com.vertex.service.BookService;
import com.vertex.service.impl.BookLendingServiceImpl;
import com.vertex.service.impl.BookServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String name;
//        int id;
        //EmployeeDaoIntrf dao=new EmployeeDaoImpl();
        BookService bookService = new BookServiceImpl();
        BookLendingService bookLendingService = new BookLendingServiceImpl();
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
            Book book=new Book();
            switch (ch){
                case 1:

                        System.out.println("Enter the ISBN : ");
                        long ISBN = sc.nextLong();
                        sc.nextLine();

                        System.out.println("Enter the title : ");
                        String title=sc.nextLine();
                        System.out.println("Enter the category : ");
                        String category=sc.nextLine();
                        System.out.println("Enter the author : ");
                        String author=sc.nextLine();
                        book.setBook_id((int) ISBN);
                        book.setTitle(title);
                        book.setCategory(category);
                        book.setAuthor(author);
                        int i = bookService.addBook(book);
                        if (i == 1){
                                System.out.println("Successfully saved.");
                        }
                        else{
                            System.out.println("Not saved in database.");
                        }

                        break;
                case 2:
                    System.out.println("Update an existing book.");
                    System.out.println("Enter the ISBN that need to update : ");
                    ISBN=sc.nextLong();
                    sc.nextLine();

                    System.out.println("Update the book.");
                    System.out.println("Enter the new title : ");
                    title=sc.nextLine();
                    System.out.println("Enter the new category : ");
                    category=sc.nextLine();
                    System.out.println("Enter the new author : ");
                    author=sc.nextLine();
                    book.setBook_id((int) ISBN);
                    book.setTitle(title);
                    book.setCategory(category);
                    book.setAuthor(author);
                    bookService.updateBook(ISBN,book);
                    break;
                case 3:
                    System.out.println("Remove an existing book");
                    System.out.println("Enter the ISBN : ");
                    ISBN = sc.nextLong();
                    sc.nextLine();

                    System.out.println("Are you sure you want to remove this book ? (Y/N)");
                    String removalConfirmation = sc.nextLine();
                    book.setBook_id((int) ISBN);
                    if(removalConfirmation == "Y"){
                        bookService.deleteBook(ISBN);
                    }else{

                    }
                    break;

                case 4:
                    LendingBooks lendingBooks = new LendingBooks();

                    System.out.println("Lending a book");
                    System.out.println("Enter the ISBN : ");
                    ISBN = sc.nextLong();
                    sc.nextLine();
                    book.setBook_id((int) ISBN);
                    if (bookLendingService.showAvailability(ISBN)) {
                        System.out.println("Book is available.");
                    } else {
                        System.out.println("Sorry. Book is unavailable");
                    }
                    break;
                case 5:

                    System.out.println("Return a book");
                    System.out.println("Enter the ISBN : ");

                    ISBN = sc.nextLong();
                    sc.nextLine();
                    book.setBook_id((int) ISBN);
                    System.out.println("Book successfully returned");
                    break;
                case 6:
                    System.out.println("List all available books.");
                    ArrayList<Book> books = bookService.showAvailableBooks();
                    System.out.println(books);
                    break;

                case 7:
                    System.out.println("Thank you for using our Application !!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter valid choice !");
                    break;

            }
        }while (true);

    }

}
