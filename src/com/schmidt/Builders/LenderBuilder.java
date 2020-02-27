package com.schmidt.Builders;

import com.schmidt.Model.Book;
import com.schmidt.Model.Lender;

public class LenderBuilder {

    private Lender lender;

    BookStoreBuilder bookStoreBuilder;

    public LenderBuilder(BookStoreBuilder bookStoreBuilder){
        this.bookStoreBuilder = bookStoreBuilder;
        lender = new Lender();
    }

    public LenderBuilder name(String name){
        this.lender.setName(name);
        return this;
    }

    public LenderBuilder age(int age){
        this.lender.setAge(age);
        return this;
    }

    public Lender getLender(){
        return this.lender;
    }

    public BookStoreBuilder done(){
        return this.bookStoreBuilder;
    }

}
