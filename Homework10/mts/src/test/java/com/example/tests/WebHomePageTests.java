package com.example.tests;

import com.example.pages.HomePage;
import com.example.BaseTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.beans.Transient;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebHomePageTests extends BaseTest {

    @Test
    public void checkH2Title() {

        HomePage homePage = new HomePage(driver);

        String expectedText = "Онлайн пополнение без комиссии";
        String actualText = homePage.normalizeTitle();
        
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
        HomePage homePage = new HomePage(driver);
        
        WebElement image = homePage.getLogosOfPaymentSystems(expectedAlt);

        assertTrue(image.isDisplayed());
   }

    @Test
    public void checkWorkLink() {

        HomePage homePage = new HomePage(driver);

        homePage.acceptCookie();

        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        homePage.clickLink();
        String actualUrl = homePage.getActualLink();

        assertEquals(expectedUrl, actualUrl);
    } 
  
    @Test
    public void checkWorkButtonResume() {
        
        HomePage homePage = new HomePage(driver);

        homePage.acceptCookie();
        homePage.enterPhone("297777777");
        homePage.enterAmount("50");

        assertTrue(homePage.getResumeButton().isEnabled());

        homePage.clickResume();

        assertTrue(homePage.getPopupFrame().isDisplayed());
    }

    @Test
    public void checkPlaceholders() {

         HomePage homePage = new HomePage(driver);

        homePage.acceptCookie();

        String actualPhonePlaceholder = homePage.getPhonePlaceholderConnection();
        String expectPhonePlaceholder = "Номер телефона";

        assertEquals(actualPhonePlaceholder, expectPhonePlaceholder);

        String actualAmountPlaceholderConnection = homePage.getAmountPlaceholderConnection();
        String expectAmountPlaceholderConnection = "Сумма";

        assertEquals(actualAmountPlaceholderConnection, expectAmountPlaceholderConnection);

        String actualEmailPlaceholderConnection = homePage.getEmailPlaceholderConnection();
        String expectEmailPlaceholderConnection = "E-mail для отправки чека";

        assertEquals(actualEmailPlaceholderConnection, expectEmailPlaceholderConnection);

        homePage.choiceHeader();
        homePage.chooseHomeInternet();

        String actualPhoneInternetPlaceholder = homePage.getPhonePlaceholderInternet();
        String expectPhoneInternetPlaceholder = "Номер абонента";

        assertEquals(actualPhoneInternetPlaceholder, expectPhoneInternetPlaceholder);

        String actualAmountPlaceholderInternet = homePage.getAmountPlaceholderInternet();
        String expectAmountPlaceholderInternet = "Сумма";

        assertEquals(actualAmountPlaceholderInternet, expectAmountPlaceholderInternet);

        String actualEmailPlaceholderInternet = homePage.getEmailPlaceholderInternet();
        String expectEmailPlaceholderInternet = "E-mail для отправки чека";

        assertEquals(actualEmailPlaceholderInternet, expectEmailPlaceholderInternet);

        homePage.choiceHeader();
        homePage.chooseInstallmentPlan();

        String actualInstallmentNumberScorePlaceholder = homePage.getInstallmentNumberScorePlaceholder();
        String expectInstallmentNumberScorePlaceholder = "Номер счета на 44";

        assertEquals(actualInstallmentNumberScorePlaceholder, expectInstallmentNumberScorePlaceholder);

        String actualInstallmentAmountPlaceholder = homePage.getInstallmentAmountPlaceholder();
        String expectInstallmentAmountPlaceholder = "Сумма";

        assertEquals(actualInstallmentAmountPlaceholder, expectInstallmentAmountPlaceholder);

        String actualInstallmentEmailPlaceholder = homePage.getInstallmentEmailPlaceholder();
        String expectInstallmentEmailPlaceholder = "E-mail для отправки чека";

        assertEquals(actualInstallmentEmailPlaceholder, expectInstallmentEmailPlaceholder);

        homePage.choiceHeader();
        homePage.chooseArrears();

        String actualArrearsmentNumberScorePlaceholder = homePage.getArrearsNumberScorePlaceholder();
        String expectArrearsNumberScorePlaceholder = "Номер счета на 2073";

        assertEquals(actualArrearsmentNumberScorePlaceholder, expectArrearsNumberScorePlaceholder);

        String actualArrearsAmountPlaceholder = homePage.getArrearsAmountPlaceholder();
        String expectArrearsAmountPlaceholder = "Сумма";

        assertEquals(actualArrearsAmountPlaceholder, expectArrearsAmountPlaceholder);

        String actualArrearsEmailPlaceholder = homePage.getArrearsEmailPlaceholder();
        String expectArrearsEmailPlaceholder = "E-mail для отправки чека";

        assertEquals(actualArrearsEmailPlaceholder, expectArrearsEmailPlaceholder);
    }
}
