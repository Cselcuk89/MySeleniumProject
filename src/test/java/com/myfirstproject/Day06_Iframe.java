package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Day06_Iframe extends TestBase {
    @Test
    public void iframeTest() {
//    Go to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");
//    Verify the Bolded text contains “Editor”
        String boldedText = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(boldedText.contains("Editor"));
//    Locate the text box
        WebElement textBox = driver.findElement(By.xpath("//p"));
//    Delete the text in the text box
        textBox.clear();//clear deleted the text from an input
//    Type “This text box is inside the iframe”
//    Verify the text Elemental Selenium text is displayed on the page
    }
}
