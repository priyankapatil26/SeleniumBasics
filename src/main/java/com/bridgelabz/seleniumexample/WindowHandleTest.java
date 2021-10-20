package com.bridgelabz.seleniumexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        Thread.sleep(1000);
        String parentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandle = driver.getWindowHandles();
        System.out.println(windowHandle);
        int count = windowHandle.size();
        System.out.println("Number of browser windows opened on the system is : " + count);
        for (String windowHandleId : windowHandle) {
            driver.switchTo().window(windowHandleId);
            if (!windowHandleId.equals(parentWindowHandle)) {
                driver.close();
                // String title = driver.getTitle();
                // System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandleId);
            }

        }
    }
}
