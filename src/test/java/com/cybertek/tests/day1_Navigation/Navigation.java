package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //I want to see the fullWindow
        driver.manage().window().fullscreen();

        String practiceWebURL = "http://practice.cybertekschool.com/";
        //go to practice page
        driver.get(practiceWebURL);
        //go to google
        String googleURL = "https://www.google.com";
        driver.navigate().to(googleURL);
        //back to practice
        driver.navigate().back();
        //close drive
        //close current web browser ONLY
        driver.close();
        //close down all the windows and tabs
        driver.quit();



    }
}
