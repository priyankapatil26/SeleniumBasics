package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/login/");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
        //driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("test@gmail.com");
        //driver.findElement(By.xpath("//input[@id='email' and @type ='text']")).sendKeys("test@gmail.com");
        //driver.findElement(By.xpath("//input[@id='pass' or @type ='passwor']")).sendKeys("test@gmail.com");
        //driver.findElement(By.xpath("//a[starts-with(@LinkText,'Sign')]")).click();

    }
}
