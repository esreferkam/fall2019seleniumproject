package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bmw.com/en/index.html");
        driver.manage().window().fullscreen();

        String expectedURL = "https://www.bmw.com/en/index.html";

        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected URL " + expectedURL + ", Actual URL " + actualURL);
        }
        driver.quit();

    }
}
