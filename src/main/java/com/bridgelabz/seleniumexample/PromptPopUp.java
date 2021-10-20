package com.bridgelabz.seleniumexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(1000);
        alert.dismiss();
        alert.sendKeys("Test");
        alert.accept();
        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.accept();
    }
}