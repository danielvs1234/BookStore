package com.schmidt.Model;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private int ID;
    private List<Book> books;
    private List<Person> lenders;


    public BookStore(){
        books = new ArrayList<>();
        lenders = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addLender(Person person){
        lenders.add(person);
    }

    public List<Book> getBooks(){
        return books;
    }

    public List<Person> getLenders(){
        return lenders;
    }

    public int getID(){
        return ID;
    }
    public void setID(int id){
        this.ID = id;
    }

    public static void printBookStore(BookStore bs){
        System.out.println("Bookstore with ID: " + bs.ID + "\n");
        System.out.println("Number of Books in storage: " + bs.getBooks().size() + "\n");
        System.out.println("Books: ");
        for(Book book : bs.getBooks()){
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("ISBN13: " + book.getISBN13());
        }
    }

}
