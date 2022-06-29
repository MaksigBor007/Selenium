package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
    public static void main(String[] args) {


        //1.Set a system property
        System.setProperty("webdriver.chrome.driver", "D:/SDET-WORK/SeleniumBatch13/Drivers/chromedriver.exe");

        //2.Create an object of webdriver type
        WebDriver driver=new ChromeDriver();

        //2.Navigate to Google.com
        driver.get("https://www.google.com/");

        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}