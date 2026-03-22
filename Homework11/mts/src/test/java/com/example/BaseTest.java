package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected String url = "https://www.mts.by/";

    @BeforeEach
    public void turnOnGoogle() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    
    @AfterEach
    public void turnOffGoogle() {

        if (driver != null) {

            driver.quit();
        }
    }
}
