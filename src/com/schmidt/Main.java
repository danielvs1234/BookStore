package com.schmidt;


import com.schmidt.Builders.BookStoreBuilder;

public class Main {


    public static void main(String[] args){
       BookStoreBuilder.BookStore()
               .id(1)
                    .book()
                        .title("DSL for dummies")
                        .genre("Educational")
                        .ISBN("1234567890324")
                        .done()
                    .book()
                        .title("Do Something Linguistic")
                        .genre("Science Fiction")
                        .ISBN("1234567891526")
                        .done()
                    .book()
                        .ISBN("9876543211234")
                        .done()
                    .lender()
                        .name("Daniel Schmidt")
                        .age(24)
                        .done()
                    .lender()
                        .name("Maddy Modulo")
                        .age(Integer.MAX_VALUE)
                        .done()
               .printBooksStore();






    }
}
