package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookItLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");

        if(driver.getCurrentUrl().contains("cybertek-reservation")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Url does not contain, cybertek-reservation");
        }
        driver.close();
    }
}
