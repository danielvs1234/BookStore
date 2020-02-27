package com.schmidt.Model;

public class Book implements Comparable<Book>{
    private String title;
    private String genre;
    private String ISBN13;
    private Person author;


    public Book(){

    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setISBN13(String ISBN13){
        this.ISBN13 = ISBN13;
    }

    public void setAuthor(Person author){
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getISBN13() {
        return ISBN13;
    }

    public Person getAuthor() {
        return author;
    }


    @Override
    public int compareTo(Book book) {
        if(this.getISBN13() == book.getISBN13()){
            return 1;
        }else return 0;
    }
}
