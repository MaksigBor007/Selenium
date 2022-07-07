package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        WebElement startPractising=driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPractising.click();
        Thread.sleep(2000);
        WebElement simpleForm=driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleForm.click();
        Thread.sleep(2000);
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder^= 'Please']"));
        textBox.sendKeys("Hello Hello COOL");
        WebElement showButton=driver.findElement(By.cssSelector("button[onclick*='show']"));
        showButton.click();
        Thread.sleep(3000);

        driver.quit();

    }
}
