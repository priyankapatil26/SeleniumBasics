package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://api.jquery.com/dblclick/");
        Thread.sleep(4000);
        driver.switchTo().frame(0);
        WebElement webElement = driver.findElement(By.cssSelector("body:nth-child(2) > div:nth-child(1)"));
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.doubleClick(webElement).perform();
    }
}
