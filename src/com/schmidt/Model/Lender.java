package com.schmidt.Model;

import java.util.List;

public class Lender extends Person {

    private int CPR;
    private List<Book> lentedBooks;

    public Lender(){
    }

    public int getCPR() {
        return CPR;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }

    public void addBookForLending(Book book){
        lentedBooks.add(book);
    }

    public void removeBookFromLending(Book book){
        for(Book b : lentedBooks){
            if(book.compareTo(b) == 1){
                lentedBooks.remove(lentedBooks.indexOf(b));
            }
        }
    }

}
