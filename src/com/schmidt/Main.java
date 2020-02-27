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
                                .authorName("Karen Blixen")
                                .authorAge(89)
                        .done()
                    .book()
                        .title("Do Something Linguistic")
                        .genre("Science Fiction")
                        .ISBN("1234567891526")
                                .authorName("Daniel Schmidt")
                                .authorAge(18)
                        .done()
                    .book()
                        .title("DSL is life")
                        .ISBN("9876543211234")
                        .genre("Western")
                                .authorName("Clint Eastwood")
                                .authorAge(95)
                        .done()

                    .lender()
                        .name("Daniel Schmidt")
                        .age(24)
                        .done()
                    .lender()
                        .name("Mathias Nielsen")
                        .age(27)
                        .done()
               .printBooksStore();

       BookStoreBuilder.BookStore()
               .id(2)
                    .book()
                        .title("Drain Synergy Language")
                        .genre("Litterature")
                        .ISBN("123124124124")
                                .authorName("Anetta Falkenham")
                                .authorAge(24)
                        .done()
                    .lender()
                        .name("Ulrik Pagh")
                        .age(30)
                        .done()
               .printBooksStore();





    }
}
