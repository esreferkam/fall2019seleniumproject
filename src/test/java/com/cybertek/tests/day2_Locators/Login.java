package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager53");
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(2000);
        driver.findElement(By.id("_submit")).click();

        if(driver.getCurrentUrl().equals("https://app.vytrack.com/")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }


    }
}
