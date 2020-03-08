package com.cybertek.tests.day5_more_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassName {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        WebElement link = driver.findElement(By.className("nav-link"));
        System.out.println(link.getText());
        //class name does not work if the value of the class attribute has a space
        WebElement loginbttn = driver.findElement(By.className("btn-primary"));
        driver.close();
    }
}
