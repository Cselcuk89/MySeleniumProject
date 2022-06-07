package com.myfirstproject.seleniumday04review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    WebDriver driver;
    @Before
    public void setUp(){
        //Prerequisites
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //user goes to http://a.testaddressbook.com/sign-in
        driver.get("http://a.testaddressbook.com/sign-in");
    }
    @Test
    public void xpath(){
        //Locating username,password,and button using xpath
        driver.findElement(By.xpath("//input[@type='email']")).
                sendKeys("testtechproed@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).
                sendKeys("Test1234!");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Test
    public void css(){
        driver.findElement(By.cssSelector("input[@type='email']")).
                sendKeys("testtechproed@gmail.com");
        driver.findElement(By.cssSelector("input[@type='password']")).
                sendKeys("Test1234!");
        driver.findElement(By.cssSelector("input[@type='submit']")).click();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
