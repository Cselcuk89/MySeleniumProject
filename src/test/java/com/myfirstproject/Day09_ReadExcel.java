package com.myfirstproject;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Day09_ReadExcel {
    @Test
    public void readExcel() throws FileNotFoundException {
        String path =".\\src\\test\\java\\resources\\Capitals.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

    }
}
