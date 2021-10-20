package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FacebookSignup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());

        boolean s =driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).isEnabled();
        System.out.println(s);

        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("priyanka");
        Thread.sleep(500);
        driver.findElement(By.name("lastname")).sendKeys("patil");
        Thread.sleep(500);
        driver.findElement(By.name("reg_email__")).sendKeys("8897541262");
        Thread.sleep(500);
        //driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password865454");
        Thread.sleep(500);
        /*driver.findElement(By.id("day")).sendKeys("26");
        driver.findElement(By.id("month")).sendKeys("July");
        driver.findElement(By.id("year")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@value='1']")).click();*/

        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByIndex(5);

        Thread.sleep(1000);
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("1");

        Thread.sleep(1000);
        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("2010");


        List<WebElement> gender = driver.findElements(By.name("sex"));
        gender.get(0).click();
        driver.findElement(By.name("websubmit")).click();


    }
}
