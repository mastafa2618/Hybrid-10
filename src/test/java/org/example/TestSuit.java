package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();

    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Test
    public void toVerifyUserShouldRegisterSuccessfully() {
        homePage.clickOnRegistration();
        registerPage.registerDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();

    }
}
