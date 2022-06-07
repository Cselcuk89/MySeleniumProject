package com.myfirstproject.selenium03review;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstJunitClass {
    @Before
    public void setUp(){
        System.out.println("BEFORE METHOD");
    }
    @After
    public void tearDown(){
        System.out.println("AFTER METHOD");
    }
    @Test
    public void test1(){
        System.out.println("This is test 1");
    }
    @Test
    public void test2(){
        System.out.println("This is test 2");
    }
}
