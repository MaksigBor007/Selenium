package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HT3 {

    /* HRMS Application Negative Login:
     * Open chrome browser
     * Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
     * Enter valid username
     * Leave password field empty
     * Click on login button
     * Verify error message with text "Password cannot be empty" is displayed.
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
         WebElement userName=driver.findElement(By.cssSelector("input[name *='txtUsername']"));
          userName.sendKeys("Admin");
           Thread.sleep(2000);
         WebElement loginButton=driver.findElement(By.cssSelector("input#btnLogin"));
          loginButton.click();
           Thread.sleep(2000);
           WebElement errorMessage=driver.findElement(By.xpath("//input[@id = 'btnLogin']/following-sibling::span"));
           boolean isErrorMessageDisplayed=errorMessage.isDisplayed();
        System.out.println(isErrorMessageDisplayed);
        Thread.sleep(3000);
        driver.quit();



    }



}
