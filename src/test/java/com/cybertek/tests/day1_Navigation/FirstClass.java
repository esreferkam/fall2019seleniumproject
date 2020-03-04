package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstClass {

    public static void main(String[] args) throws InterruptedException {
        //binary the driver and browsers
        WebDriverManager.chromedriver().setup();

        //WebDriver object needs to be created - interface

        WebDriver driver = new ChromeDriver();

        //open Google home page
        //how do you launch / open a web page?
        //by using get() method -> url as String
//        driver.get("https://www.google.com");

        //Navigation
        //navigate().to() -> open a webPage

//        driver.navigate().to("https://www.google.com");

        //get() -> wait to load the page
        //to() -> does not wait

        driver.get("https://www.google.com");
Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();




    }
}
