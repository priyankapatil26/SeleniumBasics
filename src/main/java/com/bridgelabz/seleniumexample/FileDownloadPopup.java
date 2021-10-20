package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileDownloadPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
       /*FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.download.folderlist",1);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
        desiredCapabilities.setCapability(FirefoxDriver.PROFILE,profile);
        FirefoxDriver firefoxDriver = new FirefoxDriver(desiredCapabilities);
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new FirefoxDriver(desiredCapabilities);
        driver.get("http://www.seleniumhq.org/download/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'3.141.59 (November 14, 2018)')]")).click();
        Thread.sleep(3000);*/
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addPreference("browser.download.folderList", 1);

        firefoxOptions.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip;");

        firefoxOptions.addPreference("browser.download.manager.showWhenStarting", false);
        firefoxOptions.addPreference("pdfjs.disabled", true);

        FirefoxDriver ffDriver = new FirefoxDriver(firefoxOptions);

        ffDriver.get("https://www.selenium.dev/downloads/");
        ffDriver.get("http://www.seleniumhq.org/download/");

        Thread.sleep(2000);
        WebElement webElement = ffDriver.findElement(By.xpath("//a[contains(text(),'3.141.59 (November 14, 2018)')]"));
        Thread.sleep(2000);
        webElement.click();
        Thread.sleep(2000);
        webElement.click();
        Thread.sleep(3000);
    }
}

