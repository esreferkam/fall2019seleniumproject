package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.okta.com/");
        driver.findElement(By.id("okta-signin-username")).sendKeys("epolat55@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("okta-signin-password")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.id("okta-signin-submit")).click();
        Thread.sleep(2000);
        driver.close();





    }
}
