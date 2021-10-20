package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCss {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/login/");
        Thread.sleep(2000);
        // Using id
        //driver.findElement(By.cssSelector("#email")).sendKeys("test@gmail.com");

        // Using class
        driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']")).sendKeys("Test9879jhm");
        //driver.findElement(By.cssSelector(".inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("Test9879jhm");
        //driver.findElement(By.cssSelector("input#email.inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("Test9879jhm");
        //driver.findElement(By.cssSelector("._97w4")).click();
        //driver.findElement(By.cssSelector("a[class*='_97w5']")).click();

        // Using multiple attribute
        //driver.findElement(By.cssSelector("input[id='pass'][type='password']")).sendKeys("Testkjkj56");

        // contains text
        //driver.findElement(By.cssSelector("button[id*='login']")).click();

        // Starts with
        //driver.findElement(By.cssSelector("button[id^='login']")).click();

        // Ends with
        //driver.findElement(By.cssSelector("button[id$='button']")).click();

        /*driver.get("https://www.flipkart.com/grocery/staples/dals-pulses/pr?sid=73z,bpe,3uv&marketplace=GROCERY");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//ul[@class='xfrZME undefined']"));
        driver.findElement(By.cssSelector(".xfrZME undefined"));
        //driver.findElement(By.cssSelector("div._36fx1h._6t1WkM._3HqJxg div._1YokD2._2GoDe3:nth-child(2) div._1YokD2._3Mn1Gg:nth-child(1) div._1AtVbE.col-12-12:nth-child(1) div._1OjmCG ul.xfrZME li.gs8H9l._2fzd-M:nth-child(1) > ul.xfrZME.undefined>li:nth-of-type(2)")).click();*/
    }
}
