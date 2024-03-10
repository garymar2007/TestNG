package com.gary.assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AssertionExample {
    WebDriver driver;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    void logoTest() {
       WebElement logo =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(logo.isDisplayed(),  "Logo not displayed on the page");
    }

    @Test(priority = 2)
    void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM",  title, "Title is not matched!");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
