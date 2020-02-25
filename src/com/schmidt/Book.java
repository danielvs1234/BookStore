package com.schmidt;

public class Book {
    private String title;
    private String genre;
    private int ISBN13;
    private Person author;


    public Book(){

    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setISBN13(int ISBN13){
        this.ISBN13 = ISBN13;
    }

    public void setAuthor(Person author){
        this.author = author;
    }

}
