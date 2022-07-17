package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlers {
    public static String url="";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        simpleAlertButton.click();

    }
}
