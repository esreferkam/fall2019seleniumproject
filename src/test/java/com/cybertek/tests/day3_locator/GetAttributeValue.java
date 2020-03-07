package com.cybertek.tests.day3_locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");

        //I want to get the value of type attribute
        //type="text" -> getAttribute("attribute name")

        WebElement username = driver.findElement(By.name("username"));
        String valueOfType = username.getAttribute("name");
        System.out.println(valueOfType);
        WebElement loginbttn = driver.findElement(By.id("wooden_spoon"));
        String valueType = loginbttn.getAttribute("class");
        System.out.println(valueType);
        driver.close();
    }
}
