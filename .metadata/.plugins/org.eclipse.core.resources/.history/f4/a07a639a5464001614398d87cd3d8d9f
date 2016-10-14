package com.ait.nav;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CorrectGuess {

    public String myPlayAgainHandler() {
        NumberBean nb = Helper.getBean("numberBean", NumberBean.class);
        nb.myReset();
        return "guessNumber.jsf";
    }

    public String myQuitHandler() {
        NumberBean nb = Helper.getBean("numberBean", NumberBean.class);
        nb.myReset();
        return "WelcomePage.jsf";
    }
}
