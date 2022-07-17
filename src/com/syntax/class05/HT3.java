package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HT3 {

    //Go to ebay.com
    //get all the categories and print them in the console
    //select Computers/Tables & Networking
    //click on search
    //verify the header
static String url="https://www.ebay.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement categoryButton=driver.findElement(By.cssSelector("select#gh-cat"));
        categoryButton.click();
        Thread.sleep(1000);

        Select select=new Select(categoryButton);
        List<WebElement> options=select.getOptions();
            for(WebElement option:options){
                String optionText=option.getText();
                System.out.println(optionText);
            }
            Thread.sleep(2000);

           WebElement computerOption=driver.findElement(By.cssSelector("option[value *= '58058']"));
            computerOption.click();
            Thread.sleep(1000);
        WebElement searchButton=driver.findElement(By.cssSelector("input#gh-btn"));
         searchButton.click();
         Thread.sleep(1000);
         WebElement logo=driver.findElement(By.cssSelector("span.b-pageheader__text"));
         boolean isLogoDisplayed=logo.isDisplayed();
         System.out.println(isLogoDisplayed);


   }
}
