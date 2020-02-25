package com.schmidt;

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

}
