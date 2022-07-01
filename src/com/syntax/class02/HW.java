package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.krb5.internal.KdcErrException;

public class HW {

    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //click on register
    //close the browser

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Maksym");
        driver.findElement(By.id("customer.lastName")).sendKeys("Borodai");
        driver.findElement(By.id("customer.address.street")).sendKeys("Keen Crescent 31");
        driver.findElement(By.id("customer.address.city")).sendKeys("Edmonton");
        driver.findElement(By.id("customer.address.state")).sendKeys("Alberta");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("T2Y4G6");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123987325");
        driver.findElement(By.id("customer.ssn")).sendKeys("654789695412");
        driver.findElement(By.id("customer.username")).sendKeys("MaKsiG007");
        driver.findElement(By.id("customer.password")).sendKeys("pass123789");
        driver.findElement(By.id("repeatedPassword")).sendKeys("pass123789");
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);
        driver.close();
    }

}
