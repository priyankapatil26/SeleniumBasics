package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorScrollWebpage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(1000);
        /*for(int i=0;i<3;i++) {
            javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        }
        Thread.sleep(1000);
        javascriptExecutor.executeScript("window.scrollBy(0,-1000)");*/

        WebElement element = driver.findElement(By.linkText("Brand Directory"));
        //WebElement element = driver.findElement(By.linkText("Sell On Flipkart"));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy("+x+","+y+")");
    }
}
