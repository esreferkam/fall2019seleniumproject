package com.cybertek.tests.day3_locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wooden spoon");
        driver.findElement(By.className("nav-input")).click();
        driver.navigate().forward();
        if (driver.getTitle().contains("wooden spoon")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.close();
    }
}
