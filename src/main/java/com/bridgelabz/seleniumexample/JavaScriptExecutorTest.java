package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\ppatil8\\IdeaProjects\\SeleniumIntro\\src\\main\\resources\\JavaScriptExecutorTest.html");
        Thread.sleep(1000);
        driver.findElement(By.id("t1")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("t1")).sendKeys("New Text t1");

        //will throw invalid state exception
        //driver.findElement(By.id("t2")).clear();
        //driver.findElement(By.id("t2")).sendKeys("New Text2");

        //Using javascript executor interface
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        javascriptExecutor.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(1000);
        javascriptExecutor.executeScript("document.getElementById('t2').value='New Text t2'");


    }
}
