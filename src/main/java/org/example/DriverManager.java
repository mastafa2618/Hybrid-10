package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class DriverManager extends Utils{

    public void openBrowser(){
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(LoadPro.getProperty("url"));
    }

    public void closeBrowser(){
        driver.quit();
    }
}
