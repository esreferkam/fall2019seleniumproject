package com.cybertek.tests.day_4xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement retrievePasswordBttn = driver.findElement(By.id("form_submit"));
        String typeAttribute = retrievePasswordBttn.getAttribute("type");
        System.out.println(typeAttribute);
        System.out.println(retrievePasswordBttn.getAttribute("id"));
        System.out.println(retrievePasswordBttn.getAttribute("class"));
        driver.close();

    }
}
