package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Navigate to http://syntaxprojects.com
//Click on start practicing
//click on simple form demo
//enter any text on first text box
//click on show message
//quit the browser

public class HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        WebElement practice=driver.findElement(By.xpath("//a[text() =' Start Practising ']"));
        practice.click();
        Thread.sleep(4000);
        WebElement formDemo=driver.findElement(By.xpath("//a[contains(@class, 'list-group-item')]"));
        formDemo.click();
        Thread.sleep(3000);
        WebElement firstTextBox=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        firstTextBox.sendKeys("Hello COOL COOL");
        Thread.sleep(3000);
        WebElement showMessage=driver.findElement(By.xpath("//button[text() = 'Show Message']"));
        showMessage.click();
        Thread.sleep(4000);
         driver.quit();

    }
}
