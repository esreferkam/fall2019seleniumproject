package com.cybertek.tests.day3_locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();

        WebElement welcomeMessage = driver.findElement(By.tagName("h4"));
        String expectedWelcomeMessage = "Welcome to the Secure Area. When you are done click logout below.";
        String actualWelcomeMessage = welcomeMessage.getText();
        if(expectedWelcomeMessage.equals(actualWelcomeMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}
