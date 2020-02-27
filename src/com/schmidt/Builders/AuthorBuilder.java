package com.schmidt.Builders;

import com.schmidt.Model.Author;
import com.schmidt.Model.Book;
import com.schmidt.Model.Lender;

public class AuthorBuilder {

    private Author author;

    BookStoreBuilder bookStoreBuilder;

    public AuthorBuilder(BookStoreBuilder bookStoreBuilder){
        this.bookStoreBuilder = bookStoreBuilder;
        author = new Author();
    }

    public AuthorBuilder name(String name){
        this.author.setName(name);
        return this;
    }

    public AuthorBuilder age(int age){
        this.author.setAge(age);
        return this;
    }

    public Author getAuthor(){
        return this.author;
    }

    public BookStoreBuilder done(){
        return this.bookStoreBuilder;
    }



}
