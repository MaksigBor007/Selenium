package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        /**
         * Task
         * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
         * Login
         * Get title and verify
         * logout
         * close the browser
         */


        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));//getting webelement in return
        username.sendKeys("Tester"); //performing action on the specific element
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        String title=driver.getTitle();
        String expectedTitle="Web Orders";
        if(title.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is not correct");
        }
        Thread.sleep(5000);
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(5000);
        driver.quit();


    }
}
