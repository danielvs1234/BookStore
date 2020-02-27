package com.schmidt.Builders;

import com.schmidt.Model.Author;
import com.schmidt.Model.Book;
import com.schmidt.Model.Person;

public class BookBuilder {

    private Book book;
    private Author author;

    BookStoreBuilder bookStoreBuilder;

    public BookBuilder(BookStoreBuilder bookStoreBuilder){
        this.bookStoreBuilder = bookStoreBuilder;
        author = new Author();
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

    public BookBuilder ISBN(String isbn){
        this.book.setISBN13(isbn);
        return this;
    }

    public BookBuilder authorName(String name){
        this.author.setName(name);
        this.book.setAuthor(this.author);
        return this;
    }

    public BookBuilder authorAge(int age){
        this.author.setAge(age);
        this.book.setAuthor(this.author);
        return this;
    }



    public BookStoreBuilder done(){
        return this.bookStoreBuilder;
    }


    public Book getBook(){
        return this.book;
    }
}
