package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:/SDET-WORK/SeleniumBatch13/Drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();// launch the browser

        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}