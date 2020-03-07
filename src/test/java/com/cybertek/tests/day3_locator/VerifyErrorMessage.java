package com.cybertek.tests.day3_locator;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys((CharSequence) new Faker().name().fullName().replace(" ","").toLowerCase());
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys(new Faker().phoneNumber().cellPhone());
        Thread.sleep(3000);
        driver.findElement(By.id("wooden_spoon")).click();
        driver.findElement(By.id("flash")).click();
        WebElement actualMessage = driver.findElement(By.id("flash"));
        String actualMessageStr = actualMessage.getText();

        String expectedMessage = "Your username is invalid!\\n×";
        if(actualMessageStr.contains(expectedMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}
