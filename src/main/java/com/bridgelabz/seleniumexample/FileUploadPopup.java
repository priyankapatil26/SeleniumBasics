package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.container div.row div.col-md-3 > input:nth-child(5)")).sendKeys("C:\\Test\\Sample.txt");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-success btn-xs']")).click();
    }
}
