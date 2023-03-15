package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    private By _registration=By.linkText("Register");

    public void clickOnRegistration(){
        clickOnElement(_registration);
    }
}
