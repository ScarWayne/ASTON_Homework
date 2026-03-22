package com.example.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage {
    
    private WebDriver driver;
    private WebDriverWait wait;

    private By h2 = By.xpath("//div[@class='pay__wrapper']//h2");
    private By link = By.linkText("Подробнее о сервисе");
    private By cookieButton = By.id("cookie-agree");
    private By phoneFieldInput = By.id("connection-phone");
    private By amountFieldInputConnection = By.id("connection-sum");
    private By resumeButton = By.xpath("//div[@class='pay__forms']//form[@id='pay-connection']//button[@type='submit']");
    private By popupFrame = By.xpath("//div[@class='payment-widget-app']//iframe[contains(@class,'payment-widget-iframe')]");
    private By emailConnection = By.id("connection-email");
    private By selectHeader = By.xpath("//button[@class='select__header']");
    private By homeInternet = By.xpath("//ul[@class='select__list']//p[contains(@class,'select__option') and text()='Домашний интернет']");
    private By phoneFieldInputInternet = By.id("internet-phone");
    private By amountFieldInputInternet = By.id("internet-sum");
    private By emailInternet = By.id("internet-email");
    private By installmentPlan = By.xpath("//ul[@class='select__list']//p[contains(@class,'select__option') and text()='Рассрочка']");
    private By installmentNumberScore = By.id("score-instalment");
    private By installmentAmount = By.id("instalment-sum");
    private By installmentEmail = By.id("instalment-email");
    private By arrears = By.xpath("//ul[@class='select__list']//p[contains(@class,'select__option') and text()='Задолженность']");
    private By arrearsNumberScore = By.id("score-arrears");
    private By arrearsAmount = By.id("arrears-sum");
    private By arrearsEmail = By.id("arrears-email");


    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String normalizeTitle() {

        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(h2)).getText()
                .replace("\n", " ")
                .replaceAll("\\s+", " ")
                .trim();

                return actualText;
    }

    public WebElement getLogosOfPaymentSystems(String expectedAlt) {

    By image = By.xpath("//div[@class='pay__partners']//img[@alt='" + expectedAlt + "']");

    return wait.until(ExpectedConditions.visibilityOfElementLocated(image));
    }

    public void clickLink() {

        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
    }

    public String getActualLink() {

        return driver.getCurrentUrl();
    }

    public void acceptCookie() {

       wait.until(ExpectedConditions.elementToBeClickable(cookieButton)).click();
    }

    public void enterPhone(String phone) {
        
        driver.findElement(phoneFieldInput).sendKeys(phone);
    }

    public void enterAmount(String amount) {

        driver.findElement(amountFieldInputConnection).sendKeys(amount);
    }

    public WebElement getResumeButton() {

        return driver.findElement(resumeButton);
    }

    public void clickResume() {

       wait.until(ExpectedConditions.elementToBeClickable(resumeButton)).click();
    }

    public WebElement getPopupFrame() {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(popupFrame));
    }

    public void switchToPopupFrame() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(popupFrame));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(popupFrame));
}

    public String getPhonePlaceholderConnection() {

        return driver.findElement(phoneFieldInput).getAttribute("placeholder");
    }

    public String getAmountPlaceholderConnection() {

        return driver.findElement(amountFieldInputConnection).getAttribute("placeholder");
    }

    public String getEmailPlaceholderConnection() {

        return driver.findElement(emailConnection).getAttribute("placeholder");
    }

    public void choiceHeader() {

        wait.until(ExpectedConditions.elementToBeClickable(selectHeader)).click();
    }

    public void chooseHomeInternet() {

        wait.until(ExpectedConditions.elementToBeClickable(homeInternet)).click();
    }

    public String getPhonePlaceholderInternet() {

        return driver.findElement(phoneFieldInputInternet).getAttribute("placeholder");
    }

    public String getAmountPlaceholderInternet() {

        return driver.findElement(amountFieldInputInternet).getAttribute("placeholder");
    }

    public String getEmailPlaceholderInternet() {

        return driver.findElement(emailInternet).getAttribute("placeholder");
    }
    
    public void chooseInstallmentPlan() {

        wait.until(ExpectedConditions.elementToBeClickable(installmentPlan)).click();
    }

    public String getInstallmentNumberScorePlaceholder() {

        return driver.findElement(installmentNumberScore).getAttribute("placeholder");
    }

    public String getInstallmentAmountPlaceholder() {

        return driver.findElement(installmentAmount).getAttribute("placeholder");
    }

    public String getInstallmentEmailPlaceholder() {

        return driver.findElement(installmentEmail).getAttribute("placeholder");
    }

    public void chooseArrears() {

        wait.until(ExpectedConditions.elementToBeClickable(arrears)).click();
    }

    public String getArrearsNumberScorePlaceholder() {

        return driver.findElement(arrearsNumberScore).getAttribute("placeholder");
    }

    public String getArrearsAmountPlaceholder() {

        return driver.findElement(arrearsAmount).getAttribute("placeholder");
    }

    public String getArrearsEmailPlaceholder() {

        return driver.findElement(arrearsEmail).getAttribute("placeholder");
    }
}
