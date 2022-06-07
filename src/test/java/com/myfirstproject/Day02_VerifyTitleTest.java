package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to google page
        driver.get("https:/www.google.com");
        //verify if google title is google
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        //verify if expected equals actual
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("Expected : " +expectedTitle);
            System.out.println("Actual : " + actualTitle);
        }
        driver.quit();

    }
}
