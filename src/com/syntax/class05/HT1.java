package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//Open chrome browser
//Go to "https://www.facebook.com"
//click on create new account
//Verify:
//month dd has 12 month options
//day dd has 31 day options
//year dd has 115 year options
//Select your date of birth
//Quit browser

public class HT1 {
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

        WebElement month = driver.findElement(By.cssSelector("select#month"));
          Thread.sleep(2000);
        Select select = new Select(month);

        List<WebElement> monthDD=select.getOptions();
        int allMonthDD=monthDD.size();
        System.out.println(allMonthDD);
           Thread.sleep(2000);

        for(int i=0;i<allMonthDD;i++){
            String optionsMonth=monthDD.get(i).getText();
            System.out.print(optionsMonth+" ");
        }

        System.out.println(" ");


        WebElement days=driver.findElement(By.cssSelector("select#day"));
         Select select1=new Select(days);


       List<WebElement> daysDD=select1.getOptions();
       int allDays=daysDD.size();
       Thread.sleep(1000);
        System.out.println(allDays);

        for(int i=0;i<allDays;i++){
           String optionDays=daysDD.get(i).getText();
            System.out.print(optionDays+" ");
        }


        System.out.println(" ");
         Thread.sleep(1000);
         WebElement years=driver.findElement(By.cssSelector("select#year"));
         Select select2=new Select(years);

          Thread.sleep(1000);
           List<WebElement> yearsDD=select2.getOptions();
           int allYears=yearsDD.size();
        System.out.println(allYears);
        Thread.sleep(1000);

        for(int i=0;i<allYears;i++){
           String optionYears=yearsDD.get(i).getText();
            System.out.print(optionYears+" ");
        }

        select.selectByVisibleText("Apr");
        select1.selectByVisibleText("21");
        select2.selectByValue("1989");

          Thread.sleep(1000);

            driver.quit();


    }
    }

