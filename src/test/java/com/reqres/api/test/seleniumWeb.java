package com.reqres.api.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumWeb {

    ChromeDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/chromedriver1.exe");
        driver = new ChromeDriver();
    }



    @Test
    public void automation(){


        driver.get("https://www.google.co.in/");

    }


}
