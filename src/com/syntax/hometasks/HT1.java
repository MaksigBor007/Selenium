package com.syntax.hometasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HT1 {
    //Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    //verify the header text Sorry, We Couldn't Find Anything For "Asksn" is displayed
    //verify enroll today button is enabled
static String url="https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        WebElement headerElement=driver.findElement(By.xpath("//h1[@class='heading-13']"));
         boolean isHeaderElementDisplayed=headerElement.isDisplayed();
        System.out.println(isHeaderElementDisplayed);
         Thread.sleep(1000);

         driver.switchTo().defaultContent();
         driver.switchTo().frame("FrameTwo");
         Thread.sleep(1000);
        WebElement enrollButton=driver.findElement(By.xpath("//div[text() = 'Enroll today']"));
        Thread.sleep(1000);
         boolean isEnrollButtonEnabled=enrollButton.isEnabled();
        System.out.println(isEnrollButtonEnabled);


    }
}
