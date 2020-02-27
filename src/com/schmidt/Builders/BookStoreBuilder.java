package com.schmidt.Builders;

import com.schmidt.Model.Book;
import com.schmidt.Model.BookStore;

import java.util.List;

public class BookStoreBuilder {

    private BookStore bookStore;
    private List<BookStore> bookStoreList;

    public BookStoreBuilder(){
        bookStore = new BookStore();
    }

    public static BookStoreBuilder BookStore() {
        return new BookStoreBuilder();
    }

    public BookStoreBuilder id(int ID){
        this.bookStore.setID(ID);
        return this;
    }

    public BookBuilder book(){
        BookBuilder bookBuilder = new BookBuilder(this);
        getBookStore().addBook(bookBuilder.book);
        return bookBuilder;
    }

    public LenderBuilder lender(){
        LenderBuilder lenderBuilder = new LenderBuilder(this);
        getBookStore().addLender(lenderBuilder.getLender());
        return lenderBuilder;
    }

    public AuthorBuilder author(Book book){
        AuthorBuilder authorBuilder = new AuthorBuilder(this);
        book.setAuthor(authorBuilder.getAuthor());
        return authorBuilder;
    }

    public BookStore getBookStore(){
        return this.bookStore;
    }

    public void printBooksStore(){
        BookStore.printBookStore(bookStore);
    }
}
