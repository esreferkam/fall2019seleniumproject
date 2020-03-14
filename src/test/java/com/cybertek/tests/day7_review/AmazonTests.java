package com.cybertek.tests.day7_review;

import com.cybertek.utilities.WebDriverFactory;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTests {
    //main method to invoke the tests
    public static void main(String[] args) {
        nameMatchTest();
    }


    //each test will be a separate Method
    /*
    -open browser
    -go to amazon
    -search for any item
    -remember the name of the first result
    -verify that product name is same in the product page
     */
    private static void nameMatchTest() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");
        String searchTerm = "disinfectant wipes";
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        //OPTION #1: enter search term and hit enter
        //searchInput.sendKeys(searchTerm+ Keys.ENTER);
        //OPTION #2: enter search term and click search button
        WebElement searchButton = driver.findElement(By.className("nav-input"));
        searchInput.sendKeys(searchTerm);
        searchButton.click();

        WebElement firstResult = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        String expectedName = firstResult.getText();

        firstResult.click();

        WebElement productName = driver.findElement(By.id("productTitle"));
        String actualName = productName.getText();
        if(expectedName.equals(actualName)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Name: "+expectedName);
            System.out.println("Actual Name: "+actualName);
        }

        driver.quit();
    }
}
