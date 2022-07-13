package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.ArrayList;

/*
 * TC 1: Amazon link count:
 * Open chrome browser
 * Go to "https://www.amazon.com/"
 * Get all links
 * Get number of links that has text
 * Print to console only the links that has text
 */

public class HT2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("All links: " + allLinks.size());
        for (WebElement link : allLinks) {
            String linkText = link.getText();
            String fullLinks=link.getAttribute("href");
            if(!linkText.isEmpty()){
                System.out.println(linkText+" "+fullLinks);
            }
        }
        Thread.sleep(3000);
        driver.quit();

        }
    }
