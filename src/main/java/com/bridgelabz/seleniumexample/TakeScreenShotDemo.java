package com.bridgelabz.seleniumexample;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotDemo {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        Thread.sleep(1000);
        //to take screenshot
        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        //getting the source file using getScreenshotAs() method and storing in a file
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        //destination file
        File destFile = new File(".\\screenshots\\"+ System.currentTimeMillis()+".png");
        //copy file at destination
        FileHandler.copy(srcFile,destFile);
        //FileUtils.copyFile(srcFile,destFile);
    }
}
