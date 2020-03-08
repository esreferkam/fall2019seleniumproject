package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeStyle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.canlitv.me/tr2");
        int linkNum = 1;
        String linkTvXPath = "/html/body/div[2]/div[1]/ul[1]/li["+linkNum+"]/a/img";
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            driver.findElement(By.xpath(linkTvXPath)).click();
            driver.navigate().back();
            linkNum++;
        }

            driver.close();

        }
        

    }

