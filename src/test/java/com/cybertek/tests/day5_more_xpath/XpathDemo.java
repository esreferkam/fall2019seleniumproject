package com.cybertek.tests.day5_more_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement buttonOne = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        String txt = buttonOne.getText();

        System.out.println(txt);

        WebElement buttonTwo = driver.findElement(By.xpath("//h3/following-sibling::button[2]"));

        WebElement buttonThree = driver.findElement(By.xpath("//button[3]"));

        WebElement buttonFour = driver.findElement(By.xpath("//div/button/[4]"));

        System.out.println(buttonFour.getText());

        WebElement buttonFive = driver.findElement(By.xpath("//button[.='Button 5']"));
        // get text of the element
        WebElement buttonSix = driver.findElement(By.xpath("innerHTML"));
    }
}
