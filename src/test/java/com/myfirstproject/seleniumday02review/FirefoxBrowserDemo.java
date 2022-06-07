package com.myfirstproject.seleniumday02review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.quit();
    }
}
