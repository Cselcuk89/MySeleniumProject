package com.myfirstproject.selenium05review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    @Test
    public void selectByIndex() throws InterruptedException {
      //1Locate the dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        //2.create a select object
        Select select = new Select(dropdown);
        //3.select any option using by index
        Thread.sleep(5000);
        select.selectByIndex(2);
        Thread.sleep(5000);
        select.selectByIndex(1);
    }
    //create method selectByValueTest
    @Test
    public void selectByValueTest() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByValue("2");
        Thread.sleep(5000);
    }
    //create method selectByVisibleTextTest
    @Test
    public void selectByVisibleTextTest() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
        Thread.sleep(5000);
        select.selectByVisibleText("Option 1");
        Thread.sleep(5000);
    }
    //Create method to print all dropdowns
    @Test
    public void printAllTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        //select all options using getOptions() method
        List<WebElement> allOptions = select.getOptions();
        for (WebElement eachOption: allOptions)
              {
                  System.out.println(eachOption.getText());
        }
        boolean flag = false;
        for (WebElement eachOption : allOptions){
            if (eachOption.getText().equals("Option 2")){
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }
    //Create method to print the first selected option
    @Test
    public void printFirstSelectedOption(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("Selected option : " + firstSelectedOption.getText());
        //select option 2
        select.selectByVisibleText("Option 2");
        System.out.println("Now selected : " + select.getFirstSelectedOption().getText());
        //Get multiple selected options
        List<WebElement> allSelectedOption = select.getAllSelectedOptions();
        for (WebElement eachSelectedOption : allSelectedOption){
            System.out.println("Selected option : " + eachSelectedOption.getText());
        }
    }
    //Find the size of the dropdown, print "Expected is not equal actual" if there are not 3 elements in the dropdown
    @Test
    public void sizeTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        List<WebElement> allOpton = select.getOptions();
        int numberOfDropDownOptions = allOpton.size();
        Assert.assertEquals("Expected is not equal actual",3,numberOfDropDownOptions);
    }
    @After
    public void tearDown(){
        driver.quit();
    }



}
