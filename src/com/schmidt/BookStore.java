package com.schmidt;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

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

    public List getBooks(){
        return books;
    }

    public List getLenders(){
        return lenders;
    }

    public static void printBookStore(BookStore bs){

    }

}
