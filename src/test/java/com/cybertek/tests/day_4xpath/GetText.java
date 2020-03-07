package com.cybertek.tests.day_4xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("eep@gmail.com");
        driver.findElement(By.id("form_submit")).submit();

        WebElement message = driver.findElement(By.name("confirmation_message"));
        String actualMessage = message.getText();
        String expectedMessage = "Your e-mail's been sent!";

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();


    }
}
