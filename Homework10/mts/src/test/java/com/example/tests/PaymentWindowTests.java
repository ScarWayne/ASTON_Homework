package com.example.tests;

import com.example.BaseTest;
import com.example.pages.HomePage;
import com.example.pages.PaymentWindow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentWindowTests extends BaseTest {

    @Test
    public void checkPopupAmountAndPhoneForConnectionPayment() {

        HomePage homePage = new HomePage(driver);
        PaymentWindow paymentWindow = new PaymentWindow(driver);

        homePage.acceptCookie();
        homePage.enterPhone("297777777");
        homePage.enterAmount("50");             
        homePage.clickResume();
        homePage.switchToPopupFrame();

        String actualPopupAmount = paymentWindow.getPaymentAmount();
        String expectedPopupAmount = "50.00 BYN";

        assertEquals(expectedPopupAmount, actualPopupAmount);

        String actualPopupButtonText = paymentWindow.getPaymentButtonText();
        String expectedPopupButtonText = "Оплатить 50.00 BYN";

        assertEquals(expectedPopupButtonText, actualPopupButtonText);

        String actualPopupPhoneText = paymentWindow.getPaymentText();
        String expectedPopupPhoneText = "Оплата: Услуги связи Номер:375297777777";

        assertEquals(expectedPopupPhoneText, actualPopupPhoneText);
    }

    @Test
    public void checkPopupCardPlaceholdersForConnectionPayment() {

        HomePage homePage = new HomePage(driver);
        PaymentWindow paymentWindow = new PaymentWindow(driver);

        homePage.acceptCookie();
        homePage.enterPhone("297777777");
        homePage.enterAmount("50");
        homePage.clickResume();
        homePage.switchToPopupFrame();

        String actualCardNumberPlaceholder = paymentWindow.getCardNumberLabelText();
        String expectedCardNumberPlaceholder = "Номер карты";

        assertEquals(expectedCardNumberPlaceholder, actualCardNumberPlaceholder);

        String actualCardDatePlaceholder = paymentWindow.getCardDateLabelText();
        String expectedCardDatePlaceholder = "Срок действия";

        assertEquals(expectedCardDatePlaceholder, actualCardDatePlaceholder);

        String actualCardCvcPlaceholder = paymentWindow.getCardCvcLabelText();
        String expectedCardCvcPlaceholder = "CVC";

        assertEquals(expectedCardCvcPlaceholder, actualCardCvcPlaceholder);

        String actualCardHolderPlaceholder = paymentWindow.getCardHolderLabelText();
        String expectedCardHolderPlaceholder = "Имя и фамилия на карте";

        assertEquals(expectedCardHolderPlaceholder, actualCardHolderPlaceholder);
    }

    @Test
    public void checkPopupPaymentSystemLogosForConnectionPayment() {

        HomePage homePage = new HomePage(driver);
        PaymentWindow paymentWindow = new PaymentWindow(driver);

        homePage.acceptCookie();
        homePage.enterPhone("297777777");
        homePage.enterAmount("50");
        homePage.clickResume();
        homePage.switchToPopupFrame();

        assertTrue(paymentWindow.getVisaLogo().isDisplayed());
        assertTrue(paymentWindow.getMastercardLogo().isDisplayed());
        assertTrue(paymentWindow.getBelkartLogo().isDisplayed());
    }
}

