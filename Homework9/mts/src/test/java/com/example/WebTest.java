package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTest extends BaseTest {
    
    @Test
    public void checkH2Title() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement h2 = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[@class='pay__wrapper']//h2")
            )
        );

        String expectedText = "Онлайн пополнение без комиссии";

        String actualText = h2.getText()
                .replace("\n", " ")
                .replaceAll("\\s+", " ")
                .trim();

        assertEquals(expectedText, actualText);        
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "Visa",
        "Verified By Visa",
        "MasterCard",
        "MasterCard Secure Code",
        "Белкарт"
    })

    public void checkLogosOfPaymentSystems(String expectedAlt) {

        WebElement image = driver.findElement(
                By.xpath("//div[@class='pay__partners']//img[@alt='" + expectedAlt + "']")
        );

         assertTrue(image.isDisplayed());
    }

    @Test
    public void checkWorkLink() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement link = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.linkText("Подробнее о сервисе")
            )
        );

        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
              
        WebElement cookieButton = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.id("cookie-agree")
            )
        );
        
        cookieButton.click();
        link.click();

        String actualUrl = driver.getCurrentUrl();
        
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void checkWorkButtonResume() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement cookieButton = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.id("cookie-agree")
            )
        );

        cookieButton.click();

        WebElement inputPhoneField = driver.findElement(By.id("connection-phone"));
        
        inputPhoneField.click();
        inputPhoneField.sendKeys("297777777");

        WebElement inputAmountField = driver.findElement(By.id("connection-sum"));

        inputAmountField.click();
        inputAmountField.sendKeys("50");

        WebElement buttonResume = driver.findElement(By.xpath("//div[@class='pay__forms']//form[@id='pay-connection']//button[@type='submit']"));

        assertTrue(buttonResume.isEnabled());

        buttonResume.click();
        
        WebElement popupFrame = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//iframe[contains(@class,'payment-widget-iframe')]")
            )
        );

        assertTrue(popupFrame.isDisplayed());
    }
}
