package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HT2 {
//Go to facebook sign up page
//Fill out the whole form
//Click signup

    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement createButton = driver.findElement(By.xpath("//a[contains (text(),'Create new account')]"));
        createButton.click();
        Thread.sleep(1000);

        driver.findElement(By.name("firstname")).sendKeys("Maks");
        driver.findElement(By.name("lastname")).sendKeys("CoolCooolc");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("5487963212");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("pass123789");
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.cssSelector("select#month"));
        Thread.sleep(2000);
        Select select = new Select(month);
        select.selectByVisibleText("Apr");

        Thread.sleep(2000);

        WebElement days=driver.findElement(By.cssSelector("select#day"));
        Select select1=new Select(days);
        select1.selectByVisibleText("21");

        Thread.sleep(1000);

       WebElement years=driver.findElement(By.cssSelector("select#year"));
        Select select2=new Select(years);
        select2.selectByValue("1989");

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input._8esa[value='2']")).click();
        Thread.sleep(1000);

       WebElement sighUpButton=driver.findElement(By.xpath("//button[@name ='websubmit']"));
         sighUpButton.click();
         Thread.sleep(4000);
        driver.quit();


    }
}
