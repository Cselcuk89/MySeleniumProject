package com.myfirstproject.seleniumday06review;


import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Alerts extends TestBase {
    @Test
    public void acceptAlert() throws InterruptedException {
        //click on the first alert, verify the text “I am a JS Alert” ,
        //click on the first alert and verify the text "You entered: Hello World"
        //click ok and verify "You successfully clicked an alert"
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(5000);
        //switch to the alert and getText and do assertion
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAlertText = "I am a JS Alert";
        Assert.assertEquals(expectedAlertText,actualAlertText);
        //click ok
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        //verify "You successfully clicked an alert"
        String actualResultText = driver.findElement(By.id("result")).getText();
        String expectedResultText = "You successfully clicked an alert";
        Assert.assertEquals(expectedResultText,actualResultText);
    }
    @Test
    public void dismissAlert() throws InterruptedException {
        //verify text "i am a JS Confirm"
        //click cancel
        //and verify "You clicked: Cancel"
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //click on the second alert
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);
        //verify text "I am JS Confirm"
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAlertText = "I am a JS Confirm";
        Assert.assertEquals(expectedAlertText,actualAlertText);
        //click cancel
        driver.switchTo().alert().dismiss();
        Thread.sleep(5000);
        String actualResultText = driver.findElement(By.id("result")).getText();
        String expectedResultText = "You clicked: Cancel";
        Assert.assertEquals(expectedResultText,actualResultText);
    }
    @Test
    public void sendKeysAlert() throws InterruptedException {
        //click on the third alert
        //verify text "I am a JS Prompt",
        //type "Hello World"
        //click ok
        // verify "You entered: Hello World"
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //click on the third alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(5000);
        //verify text "I am a JS Prompt",
        Assert.assertEquals("I am a JS Prompt",driver.switchTo().alert().getText());
        //type "Hello World"
        driver.switchTo().alert().sendKeys("Hello World");
        //click ok
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        //verify "You entered: Hello World"
        Assert.assertEquals("You entered: Hello World",driver.findElement(By.id("result")).getText());
    }
}
