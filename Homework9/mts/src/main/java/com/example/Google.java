package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", 
                    "src/main/resources/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}
