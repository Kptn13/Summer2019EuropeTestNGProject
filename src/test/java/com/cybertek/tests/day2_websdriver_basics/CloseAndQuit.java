package com.cybertek.tests.day2_websdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        Thread.sleep(3000);

        //close() ---> closes the current tab quit()--> closes all tabs
        driver.close();

        //opening the new tab
        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        driver.quit();







    }
}
