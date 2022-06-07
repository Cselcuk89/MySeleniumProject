package com.myfirstproject.selenium03review;

import org.junit.Assert;
import org.junit.Test;

public class Assertions {
    @Test
    public void assertions(){
        Assert.assertTrue("SELENIUM".contains("E"));
        Assert.assertFalse("JAVA".contains("E"));
        Assert.assertTrue("SELENIUM".startsWith("S"));
        Assert.assertFalse("JAVA".endsWith("A"));
    }
}
