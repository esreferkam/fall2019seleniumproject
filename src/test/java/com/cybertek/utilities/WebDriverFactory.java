package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {



    public static WebDriver getDriver(String browserType){
      WebDriver driver = null;
      switch (browserType){
          case "firefox":
              WebDriverManager.firefoxdriver().setup();
              driver = new FirefoxDriver();
          default:
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
      }
      return driver;
    }

}
