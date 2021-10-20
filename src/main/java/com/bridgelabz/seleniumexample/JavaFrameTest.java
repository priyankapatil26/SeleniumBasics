package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaFrameTest
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\ppatil8\\IdeaProjects\\SeleniumIntro\\src\\main\\resources\\FrameTest2.html");
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("Text1");
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("Text2");
        Thread.sleep(1000);
        driver.switchTo().frame(1);
        driver.findElement(By.id("t3")).sendKeys("Text3");
        Thread.sleep(1000);
        driver.switchTo().parentFrame();
        driver.findElement(By.id("t1")).clear();

    }
}
