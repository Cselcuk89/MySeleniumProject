package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    /*
    Create a new class under : BasicNavigations
    Create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
     */
    public static void main(String[] args) {
        // Set Path
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        // Create chrome driver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Open google home page https://www.google.com/.
        driver.get(" https://www.google.com/");
        //On the same class, Navigate to amazon home page https://www.amazon.com/
        //there are two ways to go to a page.
        //1.using get()
        //2.using navigate().to("url)
        driver.navigate().to("https://www.amazon.com/");
        //what is the difference between get() and navigate() methods?
        //Answer: get() is easier to use and it is shorter.
               // get () is a little faster.
               // get() takes only string parameter but navigate().to() accepts string or url as parameter.
               //navigate() has more options such as going back,forward and refreshing.
        //Navigate back to google
        driver.navigate().back();
        //Navigate forward to amazon
        driver.navigate().forward();
        //Refresh the page
        driver.navigate().refresh();
        //Close/quit the browser
        driver.quit(); //or we can use driver.close();
        //what is the difference between close and quit?
        //answer: first of all, they both closes the browser
        //but close()===> closes only the current active driver
        //quit()==> closes all browsers that are open during the test run.
    }
}
