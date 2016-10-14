package com.ait.nav;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class GuessNumber {

    private int number;
    private String status;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String mySubmitHandler() {

        // Get the NumberBean instance.
        NumberBean nb = Helper.getBean("numberBean", NumberBean.class);

        // Get the number the user is trying to guess, and increment the guess count.
        int theNumber = nb.getTheNumber();
        nb.myIncrementGuessCount();

        // Now let's see if the user guessed correctly.
        if (number > theNumber) {
            status = "Lower!";
        } else if (number < theNumber) {
            status = "Higher!";
        } else {
            return "correctGuess.jsf";
        }
        return null;
    }
}
