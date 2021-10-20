package com.bridgelabz.seleniumexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleSpecifiedBrowser {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.naukri.com/");
            //Set the expected title of the browser window which you want to close
            String expected_title = "Tech Mahindra";
            Set<String> allWindowHandles = driver.getWindowHandles();
            int count = allWindowHandles.size();
            System.out.println("Number of browser windows opened on the system is : "+ count);
            for (String windowHandle : allWindowHandles) {
                driver.switchTo().window(windowHandle);
                String actual_title = driver.getTitle();
                //Checks whether the actual title contains the specified expected title
                if (actual_title.contains(expected_title)) {
                    driver.close();
                    System.out.println("Specified Browser window with title -->"+ actual_title +" --> is closed");
                }
            }
        }
    }

