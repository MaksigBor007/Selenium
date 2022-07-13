package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://jobs.garda.com/?locale=en_CA");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement profileButton=driver.findElement(By.xpath("//a[text()='My profile']"));
        profileButton.click();
        Thread.sleep(3000);
        WebElement userName=driver.findElement(By.cssSelector("input#username"));
        userName.sendKeys("amazonmaksig@gmail.com");
        WebElement password=driver.findElement(By.cssSelector("input#password"));
        password.sendKeys("326181Mmak");
        Thread.sleep(3000);
        WebElement sighInButton=driver.findElement(By.cssSelector("button[onclick ^='return']"));
        sighInButton.click();
        Thread.sleep(3000);
        WebElement dropDownCareer=driver.findElement(By.xpath("//a[contains(@title,'Career Areas')]"));
        dropDownCareer.click();
        Thread.sleep(3000);
        WebElement airportSecButton=driver.findElement(By.xpath("//a[text()='Airport Security Screening Jobs']"));
        airportSecButton.click();
        Thread.sleep(3000);
        WebElement locationField=driver.findElement(By.cssSelector("input#location"));
        locationField.sendKeys("Edmonton");
        Thread.sleep(3000);
        WebElement filterButton=driver.findElement(By.cssSelector("input#searchfilter-submit"));
         filterButton.click();
         Thread.sleep(3000);
         WebElement preBoardlink=driver.findElement(By.xpath("//a[starts-with(@href, '/job/Edmonton-Pre-Board')]"));
         preBoardlink.click();
         Thread.sleep(3000);

         driver.quit();



    }
}
