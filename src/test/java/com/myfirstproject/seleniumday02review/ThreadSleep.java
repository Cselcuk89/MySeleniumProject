package com.myfirstproject.seleniumday02review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(5000);//waits for 5 seconds
        driver.get("https://www.amazon.com");
        Thread.sleep(10000);
        driver.quit();
    }

}
