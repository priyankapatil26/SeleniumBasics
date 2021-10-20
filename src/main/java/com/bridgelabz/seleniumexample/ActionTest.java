package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("MEN")));
        actions.perform();
        //actions.moveToElement(driver.findElement(By.linkText("PROCEDURE"))).click().perform();
    }
}
