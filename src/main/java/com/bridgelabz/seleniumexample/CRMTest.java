package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class CRMTest {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.cogmento.com/");
        Thread.sleep(4000);
        driver.findElement(By.name("email")).sendKeys("priyankapatil2672000@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("Test@123");
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.ui.middle.aligned.center.aligned.grid div.column form.ui.large.form:nth-child(1) div.ui.stacked.segment > div.ui.fluid.large.blue.submit.button:nth-child(3)")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//i[@class='users icon']")));
        actions.perform();
        // click + button
        driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/div[3]/button[1]")).click();
        Robot r = new Robot();
        r.mouseMove(700,700);
        driver.findElement(By.name("first_name")).sendKeys("Test");
    }
}
