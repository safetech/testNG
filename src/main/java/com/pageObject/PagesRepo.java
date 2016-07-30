package com.pageObject;

import org.openqa.selenium.By;

public class PagesRepo {
    public class linkedInWelcomePage{
        //Locators
        protected By byEmail = By.id("login-email");
        protected By byPassword = By.id("login-password");
        protected By bySubmit = By.name("submit");
        protected By byError = By.id("session_key-login-error");

    }

}
