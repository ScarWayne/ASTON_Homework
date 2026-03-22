package com.example.tests;

import com.example.BaseTest;
import com.example.pages.HomePage;
import com.example.pages.PaymentWindow;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Feature("Онлайн пополнение без комиссии")
public class PaymentWindowTests extends BaseTest {

    @Test
    @Story("Проверка суммы и номера телефона в окне оплаты")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPopupAmountAndPhoneForConnectionPayment() {

        HomePage homePage = new HomePage(driver);
        PaymentWindow paymentWindow = new PaymentWindow(driver);

        Allure.step("Открыть окно оплаты и заполнить форму", () -> {
        homePage.acceptCookie();
        homePage.enterPhone("297777777");
        homePage.enterAmount("50");             
        homePage.clickResume();
        homePage.switchToPopupFrame();
        });

        String actualPopupAmount = paymentWindow.getPaymentAmount();
        String expectedPopupAmount = "50.00 BYN";

        Allure.step("Проверить сумму", () -> {
        assertEquals(expectedPopupAmount, actualPopupAmount);
        });

        String actualPopupButtonText = paymentWindow.getPaymentButtonText();
        String expectedPopupButtonText = "Оплатить 50.00 BYN";

        Allure.step("Проверить текст кнопки оплаты", () -> {
        assertEquals(expectedPopupButtonText, actualPopupButtonText);
        });

        String actualPopupPhoneText = paymentWindow.getPaymentText();
        String expectedPopupPhoneText = "Оплата: Услуги связи Номер:375297777777";

        Allure.step("Проверить номер телефона", () -> {
        assertEquals(expectedPopupPhoneText, actualPopupPhoneText);
        });
    }

    @Test
    @Story("Проверка корректности подписей внутри полей ввода")
    @Severity(SeverityLevel.NORMAL)
    public void checkPopupCardPlaceholdersForConnectionPayment() {

        HomePage homePage = new HomePage(driver);
        PaymentWindow paymentWindow = new PaymentWindow(driver);

        Allure.step("Открыть окно оплаты и заполнить форму", () -> {
            homePage.acceptCookie();
            homePage.enterPhone("297777777");
            homePage.enterAmount("50");
            homePage.clickResume();
            homePage.switchToPopupFrame();
        });

        String actualCardNumberPlaceholder = paymentWindow.getCardNumberLabelText();
        String expectedCardNumberPlaceholder = "Номер карты";

        Allure.step("Проверить подпись внутри поля номера карты", () -> {
        assertEquals(expectedCardNumberPlaceholder, actualCardNumberPlaceholder);
        });

        String actualCardDatePlaceholder = paymentWindow.getCardDateLabelText();
        String expectedCardDatePlaceholder = "Срок действия";

        Allure.step("Проверить подпись внутри поля даты", () -> {
        assertEquals(expectedCardDatePlaceholder, actualCardDatePlaceholder);
        });

        String actualCardCvcPlaceholder = paymentWindow.getCardCvcLabelText();
        String expectedCardCvcPlaceholder = "CVC";

        Allure.step("Проверить подпись внутри CVC", () -> {
        assertEquals(expectedCardCvcPlaceholder, actualCardCvcPlaceholder);
        });

        String actualCardHolderPlaceholder = paymentWindow.getCardHolderLabelText();
        String expectedCardHolderPlaceholder = "Имя и фамилия на карте";

        Allure.step("Проверить подпись внутри поля держателя карты", () -> {
        assertEquals(expectedCardHolderPlaceholder, actualCardHolderPlaceholder);
        });
    }

    @Test
    @Story("Проверка наличия иконок платежных карт")
    @Severity(SeverityLevel.NORMAL)
    public void checkPopupPaymentSystemLogosForConnectionPayment() {

        HomePage homePage = new HomePage(driver);
        PaymentWindow paymentWindow = new PaymentWindow(driver);

        Allure.step("Открыть окно оплаты и заполнить форму", () -> {
            homePage.acceptCookie();
            homePage.enterPhone("297777777");
            homePage.enterAmount("50");
            homePage.clickResume();
            homePage.switchToPopupFrame();
        });

        Allure.step("Проверить наличия иконок обязательных платежных систем", () -> {
        assertTrue(paymentWindow.getVisaLogo().isDisplayed());
        assertTrue(paymentWindow.getMastercardLogo().isDisplayed());
        assertTrue(paymentWindow.getBelkartLogo().isDisplayed());
        });
    }
}

