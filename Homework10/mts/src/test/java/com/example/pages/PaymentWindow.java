package com.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentWindow {

    private WebDriver driver;
    private WebDriverWait wait;

    private By paymentAmount = By.xpath("//div[contains(@class,'pay-description__cost')]//span");
    private By paymentText = By.xpath("//div[contains(@class,'pay-description__text')]");
    private By paymentButton = By.xpath("//button[@type='submit']//span[contains(text(),'Оплатить')]");
    private By cardNumberField = By.xpath("//input[@id='cc-number']/following-sibling::label");
    private By cardDateField = By.xpath("//input[@formcontrolname='expirationDate']/following-sibling::label");
    private By cardCvcField = By.xpath("//input[@formcontrolname='cvc']/following-sibling::label");
    private By cardHolderField = By.xpath("//input[@formcontrolname='holder']/following-sibling::label");

    private By visaLogo = By.xpath("//*[contains(@src,'visa') or contains(@alt,'Visa')]");
    private By mastercardLogo = By.xpath("//*[contains(@src,'mastercard') or contains(@alt,'MasterCard')]");
    private By belkartLogo = By.xpath("//*[contains(@src,'belkart') or contains(@alt,'Белкарт')]");

    public PaymentWindow(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getPaymentAmount() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(paymentAmount))
                .getText()
                .trim();
    }

    public String getPaymentText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(paymentText))
                .getText()
                .trim();
    }

    public String getPaymentButtonText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(paymentButton))
                .getText()
                .trim();
    }

    public String getCardNumberLabelText() {

    return wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumberField))
            .getText()
            .trim();
}

public String getCardDateLabelText() {

    return wait.until(ExpectedConditions.visibilityOfElementLocated(cardDateField))
            .getText()
            .trim();
}

public String getCardCvcLabelText() {

    return wait.until(ExpectedConditions.visibilityOfElementLocated(cardCvcField))
            .getText()
            .trim();
}

public String getCardHolderLabelText() {

    return wait.until(ExpectedConditions.visibilityOfElementLocated(cardHolderField))
            .getText()
            .trim();
}

    public WebElement getVisaLogo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(visaLogo));
    }

    public WebElement getMastercardLogo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(mastercardLogo));
    }

    public WebElement getBelkartLogo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(belkartLogo));
    }
}