package com.cybertek.tests.day_4xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cat Food");
        driver.findElement(By.className("nav-input")).click();
        driver.findElement(By.xpath("//*[@id=\"anonCarousel3\"]/ol/li[1]/div/div/div[2]/h2/a")).click();


    }
}
