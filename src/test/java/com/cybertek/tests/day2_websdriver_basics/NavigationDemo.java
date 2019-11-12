package com.cybertek.tests.day2_websdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //import class CMD+Enter or alt+enter or control space
        //selenium project
        WebDriver driver = new ChromeDriver();

        //navigate the website
        driver.get("https://www.amazon.com");

        //another way of opening website
        driver.navigate().to("https://www.alibaba.com");

        //goes back to  previous webpage
        driver.navigate().back();

        //stops your code based on mili seconds
        Thread.sleep(3000);

        //goes forward
        driver.navigate().forward();

        // refresh the page
        driver.navigate().refresh();




    }

    }

