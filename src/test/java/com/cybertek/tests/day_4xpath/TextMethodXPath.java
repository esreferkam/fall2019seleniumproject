package com.cybertek.tests.day_4xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextMethodXPath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/context_menu");

        System.out.println(driver.findElement(By.xpath("//h3[text()='Context Menu']")).getText());
        driver.close();
    }
}
