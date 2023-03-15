package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{

    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void openBrowser(){driverManager.openBrowser();

    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
