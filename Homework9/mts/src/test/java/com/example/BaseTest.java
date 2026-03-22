package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    
    protected WebDriver driver;
    protected String url = "https://www.mts.by/";

    @BeforeEach
    void turnOnGoogle() {

        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterEach
    void turnOffGoogle() {

        if (driver != null) {
            driver.quit();
        }
    }
}
