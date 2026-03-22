package com.example.tests;

import com.example.pages.HomePage;
import com.example.BaseTest;
import io.qameta.allure.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Feature("Онлайн пополнение без комиссии")
public class WebHomePageTests extends BaseTest {

    @Test
    @Story("Проверка заголовка блока")
    @Severity(SeverityLevel.NORMAL)
    public void checkH2Title() {

        HomePage homePage = new HomePage(driver);

        String expectedText = "Онлайн пополнение без комиссии";
        String actualText = homePage.normalizeTitle();

        Allure.step("Проверить текст заголовка блока", () -> {
            assertEquals(expectedText, actualText);
        });
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Visa",
            "Verified By Visa",
            "MasterCard",
            "MasterCard Secure Code",
            "Белкарт"
    })
    @Story("Проверка логотипов платежных систем")
    @Severity(SeverityLevel.NORMAL)
    public void checkLogosOfPaymentSystems(String expectedAlt) {

        HomePage homePage = new HomePage(driver);

        WebElement image = homePage.getLogosOfPaymentSystems(expectedAlt);

        Allure.step("Проверить отображение логотипа " + expectedAlt, () -> {
            assertTrue(image.isDisplayed());
        });
    }

    @Test
    @Story("Проверка ссылки Подробнее о сервисе")
    @Severity(SeverityLevel.NORMAL)
    public void checkWorkLink() {

        HomePage homePage = new HomePage(driver);

        Allure.step("Принять cookies", () -> {
            homePage.acceptCookie();
        });

        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

        Allure.step("Нажать на ссылку Подробнее о сервисе", () -> {
            homePage.clickLink();
        });

        String actualUrl = homePage.getActualLink();

        Allure.step("Проверить URL после перехода", () -> {
            assertEquals(expectedUrl, actualUrl);
        });
    }

    @Test
    @Story("Проверка кнопки Продолжить")
    @Severity(SeverityLevel.CRITICAL)
    public void checkWorkButtonResume() {

        HomePage homePage = new HomePage(driver);

        Allure.step("Принять cookies", () -> {
            homePage.acceptCookie();
        });

        Allure.step("Заполнить номер телефона и сумму", () -> {
            homePage.enterPhone("297777777");
            homePage.enterAmount("50");
        });

        Allure.step("Проверить, что кнопка Продолжить активна", () -> {
            assertTrue(homePage.getResumeButton().isEnabled());
        });

        Allure.step("Нажать кнопку Продолжить", () -> {
            homePage.clickResume();
        });

        Allure.step("Проверить, что открылся popup iframe", () -> {
            assertTrue(homePage.getPopupFrame().isDisplayed());
        });
    }

    @Test
    @Story("Проверка подписей в незаполненных полях")
    @Severity(SeverityLevel.NORMAL)
    public void checkPlaceholders() {

        HomePage homePage = new HomePage(driver);

        Allure.step("Принять cookies", () -> {
            homePage.acceptCookie();
        });

        Allure.step("Проверить placeholders для Услуги связи", () -> {
            assertEquals("Номер телефона", homePage.getPhonePlaceholderConnection());
            assertEquals("Сумма", homePage.getAmountPlaceholderConnection());
            assertEquals("E-mail для отправки чека", homePage.getEmailPlaceholderConnection());
        });

        Allure.step("Переключиться на Домашний интернет и проверить placeholders", () -> {
            homePage.choiceHeader();
            homePage.chooseHomeInternet();

            assertEquals("Номер абонента", homePage.getPhonePlaceholderInternet());
            assertEquals("Сумма", homePage.getAmountPlaceholderInternet());
            assertEquals("E-mail для отправки чека", homePage.getEmailPlaceholderInternet());
        });

        Allure.step("Переключиться на Рассрочка и проверить placeholders", () -> {
            homePage.choiceHeader();
            homePage.chooseInstallmentPlan();

            assertEquals("Номер счета на 44", homePage.getInstallmentNumberScorePlaceholder());
            assertEquals("Сумма", homePage.getInstallmentAmountPlaceholder());
            assertEquals("E-mail для отправки чека", homePage.getInstallmentEmailPlaceholder());
        });

        Allure.step("Переключиться на Задолженность и проверить placeholders", () -> {
            homePage.choiceHeader();
            homePage.chooseArrears();

            assertEquals("Номер счета на 2073", homePage.getArrearsNumberScorePlaceholder());
            assertEquals("Сумма", homePage.getArrearsAmountPlaceholder());
            assertEquals("E-mail для отправки чека", homePage.getArrearsEmailPlaceholder());
        });
    }
}