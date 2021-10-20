package com.bridgelabz.seleniumexample;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleNavigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        String techMahindra = driver.getWindowHandle();
        System.out.println(techMahindra);
        driver.switchTo().window(techMahindra);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@alt='Tech Mahindra']")).click();
        }
}
