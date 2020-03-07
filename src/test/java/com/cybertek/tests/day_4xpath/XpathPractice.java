package com.cybertek.tests.day_4xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/input")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div/input")).sendKeys("SuperSecretPassword");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"wooden_spoon\"]")).click();
        driver.close();


    }
}
