package com.cybertek.tests.day3_locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
    public static void main(String[] args) {
        //Locator -> LinkTest
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement cybertekSchool = driver.findElement(By.linkText("Cybertek School"));

        System.out.println(cybertekSchool.getText());
        driver.close();



    }



}
