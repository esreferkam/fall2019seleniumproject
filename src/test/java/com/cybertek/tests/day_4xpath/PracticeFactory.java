package com.cybertek.tests.day_4xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PracticeFactory {
    public static void main(String[] args) {
        //go to google
       WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        System.out.println(driver.findElement(By.xpath("/html/body/div/div[3]/div/div")).getText());

        driver.close();
    }
}
