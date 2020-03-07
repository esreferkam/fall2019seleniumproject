package com.cybertek.tests.day_4xpath;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickVsSubmit {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("eep@gmail.com");
        driver.findElement(By.id("form_submit")).submit();

        if(driver.getCurrentUrl().equals("http://practice.cybertekschool.com/email_sent")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.close();
    }
}
