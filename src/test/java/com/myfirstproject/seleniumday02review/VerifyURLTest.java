package com.myfirstproject.seleniumday02review;

import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "www.google.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual url : " + actualUrl);
            System.out.println("Expected url : " + expectedUrl);
        }
    }
}
