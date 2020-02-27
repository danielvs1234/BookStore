package com.schmidt.Builders;

import com.schmidt.Model.Book;
import com.schmidt.Model.Person;

public class BookBuilder {

    private Book book;

    BookStoreBuilder bookStoreBuilder;

    public BookBuilder(BookStoreBuilder bookStoreBuilder){
        this.bookStoreBuilder = bookStoreBuilder;
        book = new Book();
    }

    public BookBuilder title(String title){
        this.book.setTitle(title);
        return this;
    }

    public BookBuilder genre(String genre){
        this.book.setGenre(genre);
        return this;
    }

    public BookBuilder ISBN(int isbn){
        this.book.setISBN13(isbn);
        return this;
    }

    public BookBuilder author(Person author){
        this.book.setAuthor(author);
        return this;
    }

    public Book getBook(){
        return this.book;
    }
}
