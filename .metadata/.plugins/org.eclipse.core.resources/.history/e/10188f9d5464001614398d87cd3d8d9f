package com.ait.nav;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NumberBean {

    private int theNumber;
    private int guesses;

    public NumberBean() {
        this.myReset();
    }

    public void setTheNumber(int theNumber) {
        this.theNumber = theNumber;
    }

    public int getTheNumber() {
        return theNumber;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public int myIncrementGuessCount() {
        this.guesses++;
        return this.guesses;
    }

    public final void myReset() {
        java.util.Random rg = new java.util.Random();
        this.theNumber = rg.nextInt(100);
        this.guesses = 0;
    }
}
