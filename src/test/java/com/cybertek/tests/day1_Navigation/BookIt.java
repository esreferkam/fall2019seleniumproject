package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookIt {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://cybertek-reservation-qa.herokuapp.com/");

        if(driver.getTitle().equals("bookit")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected: bookit, Actual: " + driver.getTitle());
        }
        driver.close();
    }
}
