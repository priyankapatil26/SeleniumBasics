package com.bridgelabz.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class tp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/autoit.html");
        Thread.sleep(1000);
        /*WebElement element = (WebElement) driver.switchTo().frame(driver.findElement(By.cssSelector("div.mdc-page-shell.mds-page-shell.default-layout:nth-child(2) div.mdc-page-shell__content.mds-page-shell__content main.today:nth-child(2) section.today__section.today__section--markets:nth-child(2) div.mdc-grid.mds-layout-grid div.mdc-row.mds-layout-grid__row > div.mdc-column.mds-layout-grid__col.today__markets-column.mdc-column--hidden-below-1092.mds-layout-grid__col--3-at-1092:nth-child(3)")));
        //driver.findElement(By.cssSelector("div.mdc-page-shell.mds-page-shell.default-layout:nth-child(2) div.mdc-page-shell__content.mds-page-shell__content main.today:nth-child(2) section.today__section.today__section--markets:nth-child(2) div.mdc-grid.mds-layout-grid div.mdc-row.mds-layout-grid__row > div.mdc-column.mds-layout-grid__col.today__markets-column.mdc-column--hidden-below-1092.mds-layout-grid__col--3-at-1092:nth-child(3)"));
        //WebElement webElement = driver.findElement(By.cssSelector("div.mdc-page-shell.mds-page-shell.default-layout:nth-child(2) div.mdc-page-shell__content.mds-page-shell__content main.today:nth-child(2) div.mdc-grid.mds-layout-grid:nth-child(4) div.mdc-row.mds-layout-grid__row div.mdc-column.mds-layout-grid__col.today__content-ad.mds-layout-grid__col--12.mds-layout-grid__col--auto-at-1092:nth-child(2) div.mdc-ad.mdc-ad--complete.mdc-ad--textlink.mdc-ad--show-at-lg-plus:nth-child(2) > iframe.mdc-ad__frame"));
        /*driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/div[3]/main[1]/div[2]/div[1]/div[2]/div[2]/iframe[1]"));
        Thread.sleep(1000);
        int x = webElement.getLocation().getX();
        int y = webElement.getLocation().getY();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy("+x+","+y+")");
        WebElement webElement = driver.findElement(By.xpath("//iframe[@title='Advertisement 4']"));
        int x = webElement.getLocation().getX();
        int y = webElement.getLocation().getY();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy("+x+","+y+")");
       // driver.switchTo().frame(webElement);
        //driver.findElement(By.linkText("Separating wheat from chaff? Morningstar FundInvestor can help.")).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Seeking Better Returns? Invest in Information. Lea')]")).click();
        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        //javascriptExecutor.executeScript("window.scrollBy(0,200)");*/

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='input_3']"));
       // driver.switchTo().frame(webElement);
       // Thread.sleep(1000);
        //Actions actions = new Actions(driver);
       // actions.contextClick().perform();
    }
}
