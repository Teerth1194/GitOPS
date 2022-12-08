package com.reqres.api.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class seleniumWeb {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions ChromeOptions = new ChromeOptions();
        ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
        driver = new ChromeDriver(ChromeOptions);
//        driver = new ChromeDriver();
    }



    @Test
    public void automation(){


        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }


}
