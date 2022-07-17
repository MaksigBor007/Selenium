package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    //navigate to fb.com
    //click on create new account
    //fill up all the textboxes
    //click on sign up button
    //close the pop up
    //close the browser

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Maks");
        driver.findElement(By.name("lastname")).sendKeys("CoolCooolc");
        driver.findElement(By.name("reg_email__")).sendKeys("5487963212");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("pass123789");
        driver.findElement(By.id("month")).sendKeys("April");
        driver.findElement(By.id("day")).sendKeys("21");
        driver.findElement(By.id("year")).sendKeys("1989");
        driver.findElement(By.cssSelector("input._8esa[value='2']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("img[src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']")).click();


    }
}
