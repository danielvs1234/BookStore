package com.schmidt;


import com.schmidt.Builders.BookStoreBuilder;

public class Main {


    public static void main(String[] args){
       BookStoreBuilder.BookStore()
               .id(1)
                    .book()
                        .title("DSL for dummies")
                        .genre("Educational")
                        .ISBN(1234567890)
                        .done()
                    .book()
                        .title("Do Something Linguistic")
                        .genre("Science Fiction")
                        .ISBN()




    }
}
