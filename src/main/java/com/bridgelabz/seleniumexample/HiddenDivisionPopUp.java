package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.busonlineticket.com/");
        Thread.sleep(1000);
        //driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        driver.findElement(By.xpath("//a[text()=' Bus']")).click();
        driver.findElement(By.xpath("(//i[@class='fa fa-calendar-alt'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='20']")).click();

    }
}
