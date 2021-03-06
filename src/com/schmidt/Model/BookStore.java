package com.schmidt.Model;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private int ID;
    private List<Book> books;
    private List<Lender> lenders;



    public BookStore(){
        books = new ArrayList<>();
        lenders = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addLender(Lender lender){
        lenders.add(lender);
    }

    public List<Book> getBooks(){
        return books;
    }

    public List<Lender> getLenders(){
        return lenders;
    }

    public int getID(){
        return ID;
    }
    public void setID(int id){
        this.ID = id;
    }

    public static void printBookStore(BookStore bs){
        System.out.println("----------------------------------------------------------");
        System.out.println("Bookstore with ID: " + bs.ID + "\n");
        System.out.println("Amount of current lenders registered: " + bs.getLenders().size());
        System.out.print("Number of Books in storage: " + bs.getBooks().size() + "\n");
        System.out.println("Books: ");

        for(Book book : bs.getBooks()){
            System.out.println("----------------------------------------------------------");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("ISBN13: " + book.getISBN13() + "\n");
            if(book.getAuthor() != null) {
                System.out.println("\t" + "Author: " + "\n\t" + "Name: " + book.getAuthor().getName());
                System.out.println("\t" + "Age: " + book.getAuthor().getAge() + "\n");
            }
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Lenders: ");
        for(Lender lender : bs.getLenders()){
            System.out.println("Name: " + lender.getName());
            System.out.println("Age: " + lender.getAge() + "\n");
        }

    }

}
