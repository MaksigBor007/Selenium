package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/SDET-WORK/SeleniumBatch13/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=317556623466&hvpos=&hvnetw=g&hvrand=4960273202608618506&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9001396&hvtargid=kwd-303926876281&ref=pd_sl_4yo4qabmi6_e&hydadcr=11856_10790096&gclid=CjwKCAjwzeqVBhAoEiwAOrEmzcdhk849wIuHX3T0h0kdguDhoIGPhiWC73VAdJfTPXHA1a01Hxz-yhoCVXUQAvD_BwE");

        String title =driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title+" "+url);
        driver.quit();

    }
}
