package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {
        //go to cyberTek practice web site
        //verify title

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        String practiceWebURL = "https://www.bmw.com/en/index.html";

        driver.get(practiceWebURL);

        String expectedTitle = "BMW.com | The international BMW Website";
        String actualResult = driver.getTitle();

        if(expectedTitle.equals(actualResult)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("I expected " + expectedTitle);
            System.out.println("The Actual title is " + actualResult);
        }
        driver.close();
    }
}
