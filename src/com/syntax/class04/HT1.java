package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HT1 {


    //Task
    //Open chrome browser
    //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    //Enter valid username and password (username - Admin, password - Hum@nhrm123)
    //Click on login button
    //Then verify Syntax Logo is displayed.

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement userName=driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");
        Thread.sleep(3000);
        WebElement loginButton=driver.findElement(By.cssSelector("input.button"));
        loginButton.click();

        WebElement logo=driver.findElement(By.cssSelector("img[src $= 'syntax.png']"));
        boolean isLogoDisplayed=logo.isDisplayed();
        if(isLogoDisplayed){
            System.out.println("The Logo is being displayed");
        }else {
            System.out.println("The logo is not being displayed");
        }
        System.out.println(isLogoDisplayed);
Thread.sleep(4000);

driver.quit();




    }

}
