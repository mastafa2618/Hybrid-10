package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage{

    public static void clickOnElement(By by){driver.findElement(by).click();}

    public void typeText(By by, String text){driver.findElement(by).sendKeys(text);}
    public void sendText(By by, String name){driver.findElement(by).sendKeys(name);}
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public static String getTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyyMMddss").format(new java.util.Date());
        return timeStamp;   }

    public static void selectFromDropdownByVisibleText(By by,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectFromDropDownByValue(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);

    }
    public static void selectFromDropDownByIndex(By by, int num){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);
    }
    public void WaitForElementToBeClickable(By by, int duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    public void WaitForElementToBeVisible(By by, int duration){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void WaitForUrlTobe(String url,int duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));
    }
}
