package com.syntax.hometasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class HT2 {

    //Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    //click on each button and handle the alert accordingly

public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

         WebDriver driver=new ChromeDriver();
         driver.get(url);
         driver.manage().window().maximize();
         Thread.sleep(1000);
         WebElement clickMe1=driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
         clickMe1.click();
         Thread.sleep(1000);

         Alert simpleAlert=driver.switchTo().alert();
         String confirmAlertText1=simpleAlert.getText();
         System.out.println(confirmAlertText1);
         simpleAlert.accept();
         Thread.sleep(1000);

         WebElement clickMe2=driver.findElement(By.cssSelector("button[onclick*='myConfirmFunction()']"));
         clickMe2.click();
         Thread.sleep(1000);

         Alert confirmButton=driver.switchTo().alert();
         String confirmAlertText=confirmButton.getText();
         System.out.println(confirmAlertText);
         Thread.sleep(1000);
         confirmButton.dismiss();
         Thread.sleep(1000);

         WebElement promptBox=driver.findElement(By.cssSelector("button[onclick*='myPromptFunction()']"));
         promptBox.click();
         Thread.sleep(1000);

         Alert prompt=driver.switchTo().alert();
         prompt.sendKeys("!!!!Hello BooGy WooGy!!!!");
         String confirmAlertText2=prompt.getText();
         System.out.println(confirmAlertText2);
         Thread.sleep(2000);
         prompt.accept();

         Thread.sleep(2000);

         driver.close();


    }
}
